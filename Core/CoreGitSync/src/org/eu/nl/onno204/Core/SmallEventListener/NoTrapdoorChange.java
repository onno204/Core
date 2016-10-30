package org.eu.nl.onno204.Core.SmallEventListener;

import org.bukkit.Material;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Permissions;

public class NoTrapdoorChange {
	public static void NoTrapdoorFuck(org.bukkit.event.player.PlayerInteractEvent e) {
		if(e.isCancelled()){ return; }
		if (e.getAction().toString().equalsIgnoreCase("RIGHT_CLICK_BLOCK")){
			if(e.getClickedBlock().getType().equals(Material.TRAP_DOOR)){
				if(e.getClickedBlock().getLocation().add(0, 1, 0).getBlock().getType().equals(Material.SMOOTH_STAIRS)){
					if(!e.getPlayer().hasPermission(Permissions.AllowTrapdoor)){
						e.setCancelled(true);
						e.getPlayer().sendMessage(Messages.title.GetString() + Messages.DontClickTheTrapdoor.GetString());
					}else{
						e.getPlayer().sendMessage(Messages.title.GetString() + Messages.AllowDontClickTheTrapdoor.GetString());
					}
				}
			}
		}
	}
}
