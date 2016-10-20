package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.TimerTask;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;

public class Timer extends TimerTask {
	
	public void run() { 
		Broadcaster();
	}
	
	private static void Broadcaster(){
		for(Player p : Bukkit.getOnlinePlayers()){
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', Holder.title + "§b" + Holder.BroadcastMessages.get(Holder.BroadcastCounter)) );
		}
		if(Holder.BroadcastCounter < Holder.BroadcastMessages.size()-1 ){ Holder.BroadcastCounter = Holder.BroadcastCounter+1; 
		}else{ Holder.BroadcastCounter = 0;
		}
	}
}
