package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.TimerTask;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;
import org.eu.nl.onno204.Core.Main.Permissions;

public class TimerFast extends TimerTask {
	
	public void run() { 
		GamemodeCheck();
		//Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mkc crash zobaas");
	}
	
	private static void GamemodeCheck(){
		for(Player p : Bukkit.getOnlinePlayers()){
			if(p.getGameMode() == GameMode.CREATIVE){
				if(!p.hasPermission(Permissions.GamemodeBypass)){
					Methods.RunConsoleCommand("gamemode survival " + p.getName());
					Methods.NotifyPlayerWithPerms(Messages.title.GetString() + "§c§l" + Methods.ReplacePlayer(Messages.HasGamemodeMessage.GetString(), p));
					Methods.NotifyPlayerWithPerms(Messages.title.GetString() + "§c§l" + Methods.ReplacePlayer(Messages.HasGamemodeMessage.GetString(), p));
				}
			}
		}
	}
	
	
}
