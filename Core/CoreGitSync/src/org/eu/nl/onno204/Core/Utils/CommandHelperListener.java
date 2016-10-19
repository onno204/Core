package org.eu.nl.onno204.Core.Utils;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.Main.Holder;

public class CommandHelperListener { 
	 
		public static void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent e) {
			Player p = e.getPlayer();
			String cmd = e.getMessage().toLowerCase();
			
			if(cmd.startsWith("/aaatell") || cmd.startsWith("/aaamsg")){
				p.sendMessage(Holder.title + "/Tell hebben we helaas uitgezet. Maar we hebben wel een mail systeem! Gebruik '/mail'");
				return;
			}
			
		}
		
		
		
		
}