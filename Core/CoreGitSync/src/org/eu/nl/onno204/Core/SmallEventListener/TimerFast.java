package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.TimerTask;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Methods;
import org.eu.nl.onno204.Core.Main.Permissions;

public class TimerFast extends TimerTask {
	
	public void run() { 
		GamemodeCheck();
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
