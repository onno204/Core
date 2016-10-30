package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.TimerTask;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class Timer extends TimerTask {
	
	public void run() { 
		Broadcaster();
	}
	
	private static void Broadcaster(){
		for(Player p : Bukkit.getOnlinePlayers()){
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', Messages.title.GetString() + "§b" + Messages.BroadcastMessages.GetList().get(Holder.BroadcastCounter)) );
		}
		if(Holder.BroadcastCounter < Messages.BroadcastMessages.GetList().size()-1 ){ Holder.BroadcastCounter = Holder.BroadcastCounter+1; 
		}else{ Holder.BroadcastCounter = 0;
		}
	}
}
