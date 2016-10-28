package org.eu.nl.onno204.Core.Utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class NoOnno204Spam {

	@SuppressWarnings("deprecation")
	public static void onno204Spam(org.bukkit.event.player.PlayerChatEvent e) {
		if(e.isCancelled()){ return; }
		String Message = e.getMessage().replace(" ", "").toLowerCase();
		if(Message.contains("onno") || Message.contains("ono")|| Message.contains("onni")|| Message.contains("oni")){
			Player p = e.getPlayer();
			String Lvl = ChatColor.BLUE + "[" + ChatColor.GREEN + "Level:"+ ChatColor.YELLOW + 10 + ChatColor.BLUE + "]";
			for(int i=0; i<25; i++){
				p.sendMessage(Lvl + "§8[§7Perdon-Eig.§8]§6onno204§7§l[§6§lDev§7§l]§7> §f" + "Hoi " + p.getName() + " Voel je vrij belangerijke vragen via skype te stellen. Live:RealLandsServer");
			}
		}
	}
}
