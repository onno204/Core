package org.eu.nl.onno204.Core.SmallEventListener;

import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Methods;

public class JoinAndLeaveMessage { 
	 
		public static void CustomJoinMessage(org.bukkit.event.player.PlayerJoinEvent e) {
			e.setJoinMessage(Holder.title + Methods.ReplacePlayer(Holder.CustomJoinMessage, e.getPlayer()));
		}
		public static void CustomLeaveMessage(org.bukkit.event.player.PlayerQuitEvent e) {
			e.setQuitMessage(Holder.title + Methods.ReplacePlayer(Holder.CustomLeaveMessage, e.getPlayer()));
		}
		
		
}