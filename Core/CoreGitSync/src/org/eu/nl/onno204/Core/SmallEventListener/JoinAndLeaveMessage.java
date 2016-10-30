package org.eu.nl.onno204.Core.SmallEventListener;

import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

public class JoinAndLeaveMessage { 
	 
		public static void CustomJoinMessage(org.bukkit.event.player.PlayerJoinEvent e) {
			e.setJoinMessage(Messages.title.GetString() + Methods.ReplacePlayer(Messages.CustomJoinMessage.GetString(), e.getPlayer()));
		}
		public static void CustomLeaveMessage(org.bukkit.event.player.PlayerQuitEvent e) {
			e.setQuitMessage(Messages.title.GetString() + Methods.ReplacePlayer(Messages.CustomLeaveMessage.GetString(), e.getPlayer()));
		}
		
		
}