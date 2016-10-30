package org.eu.nl.onno204.Core.Utils;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class CommandWatcherListener { 
	 
		public static void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent e) {
			if(e.isCancelled()){ return; }
			for(Player p : Holder.CommandWacherPlayers){
				if((p != null) && (p.isOnline()) && (e.getPlayer() != p)){
					p.sendMessage(Messages.CommandWacherPrefix.GetString() + "§9"+e.getPlayer().getName() + "§8> §7" + e.getMessage());
				}
			}
		}
}