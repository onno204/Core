package org.eu.nl.onno204.Core.SmallEventListener;

import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Permissions;

public class AntiBuild {
	
	public static void PlayerAntiBuildPlace(org.bukkit.event.block.BlockPlaceEvent e) { e.setCancelled(Handler(e.getPlayer())); }
	public static void PlayerAntiBuildBreak(org.bukkit.event.block.BlockBreakEvent e) { e.setCancelled(Handler(e.getPlayer())); }	
	
	public static boolean Handler(Player player){
		if(player.hasPermission(Permissions.Build)){
			return false;
		}
		player.sendMessage(Messages.title.GetString() + Messages.AntiBuild.GetString());
		return true;
	}
}
