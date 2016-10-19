package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.TimerTask;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Methods;
import org.eu.nl.onno204.Core.Main.Permissions;

public class Timer extends TimerTask {
	
	public void run() { 
		Broadcaster();
		GamemodeCheck();
	}
	
	private static void Broadcaster(){
		for(Player p : Bukkit.getOnlinePlayers()){
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', Holder.title + "§b" + Holder.BroadcastMessages.get(Holder.BroadcastCounter)) );
		}
		if(Holder.BroadcastCounter < Holder.BroadcastMessages.size()-1 ){ Holder.BroadcastCounter = Holder.BroadcastCounter+1; 
		}else{ Holder.BroadcastCounter = 0;
		}
	}
	
	private static void GamemodeCheck(){
		for(Player p : Bukkit.getOnlinePlayers()){
			if(p.getGameMode() == GameMode.CREATIVE){
				if(!p.hasPermission(Permissions.GamemodeBypass)){
					Methods.RunConsoleCommand("gamemode survival " + p.getName());
					Methods.NotifyPlayerWithPerms(Holder.title + "§c§l" + Methods.ReplacePlayer(Holder.HasGamemodeMessage, p));
					Methods.NotifyPlayerWithPerms(Holder.title + "§c§l" + Methods.ReplacePlayer(Holder.HasGamemodeMessage, p));
				}
			}
		}
	}
	
	
}
