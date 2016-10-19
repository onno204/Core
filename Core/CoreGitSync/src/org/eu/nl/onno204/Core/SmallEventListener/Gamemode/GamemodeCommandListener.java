package org.eu.nl.onno204.Core.SmallEventListener.Gamemode;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Permissions;

public class GamemodeCommandListener { 
	 
		public static void GamemodeListenerCommand(PlayerCommandPreprocessEvent e) {
			if(e.isCancelled()){ return; }
			Player p = e.getPlayer();
			String cmd = e.getMessage().toLowerCase();
			if( cmd.contains("mode") || cmd.contains("gm") || cmd.contains("creative")){
				if( p.hasPermission(Permissions.GamemodeBypass)){
					p.sendMessage(Holder.title + Holder.GamemodeCheaterMessage);
				}else{
					e.setCancelled(true);
					p.sendMessage(Holder.title + "§c" + Holder.GamemodeDenyMessage);
				}
			}
		}
}
