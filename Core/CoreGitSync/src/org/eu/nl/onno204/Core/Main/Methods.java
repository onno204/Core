package org.eu.nl.onno204.Core.Main;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Config.Config;

public class Methods {

	public static void NotifyPlayerWithPerms(String message){
		for(Player p : Bukkit.getOnlinePlayers()){
        	if(p.hasPermission(Permissions.Notify)){ p.sendMessage(Messages.title.GetString() +  message);}
        }
	}
	
	public static void Broadcast(String message){
		for(Player p : Bukkit.getOnlinePlayers()){
        	p.sendMessage(Messages.title.GetString() + message);
        }
	}
	
	public static void SafeCommandwatcher(){
		ArrayList<String> Strings = new ArrayList<String>();
		for(Player p : Holder.CommandWacherPlayers){
			if(p != null){ Strings.add(p.getName());
			}else{ Holder.CommandWacherPlayers.remove(p); }
        }
    	Config.CommandWatcher.set("Player", Strings);
	}
	
	public static void LoadCommandWacther(){
		for(String s : Config.CommandWatcher.getStringList("Player")){
			Holder.CommandWacherPlayers.add(Bukkit.getPlayer(s));
        }
	}
	
	
	public static void RunConsoleCommand(String cmd){Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), cmd);}
	public static String ReplacePlayer(String Default, Player p){ return Default.replace("%player%", p.getName()); }
	public static String ReplacePlayer(String Default, String p){ return Default.replace("%player%", p); }
	public static String ReplaceMessage(String Default, String Message){ return Default.replace("%message%", Message); }
	public static String ReplaceBanType(String Default, String Message){ return Default.replace("%bantype%", Message); }
	
	
}
