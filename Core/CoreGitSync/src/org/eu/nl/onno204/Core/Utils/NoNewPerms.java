package org.eu.nl.onno204.Core.Utils;

import java.util.ArrayList;

import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

public class NoNewPerms { 
	 public static ArrayList<String> BlockedCommands = new ArrayList<String>();
	 public static ArrayList<String> AxactCommand = new ArrayList<String>();
	 public static ArrayList<String> AllowedCommands = new ArrayList<String>();
	
	public static void NoNewPermsCommandListner(PlayerCommandPreprocessEvent e) {
		if(e.isCancelled()){ return; }
		String[] Splitted = e.getMessage().split(" ");
		String Command = Splitted[0].replace("/", "").toLowerCase();
		if(AllowedCommands.contains(Command.replace("/", "").toLowerCase())){ return; }
		Boolean BlockedCommand = false;
		String DeniedCommand = "";
		for(String s : BlockedCommands){ if(Command.contains(s)){ DeniedCommand = s; BlockedCommand = true; } }
		for(String s : AxactCommand){ if(s.equalsIgnoreCase(Command)){ DeniedCommand = s; BlockedCommand = true; } }
		if(BlockedCommand){
			e.setCancelled(true);
			e.getPlayer().sendMessage(Messages.title.GetString() + "§2" + Messages.CoreProtectedCommand);
			e.getPlayer().sendMessage("§2" + Messages.CoreOnlyConsole);
			e.getPlayer().sendMessage("§4§l" + Messages.CommandContained.Replace("", DeniedCommand));
            Methods.NotifyPlayerWithPerms(Messages.PlayerTriedCommand.Replace(e.getPlayer(), e.getMessage()));;
		}
	}
	
	public static void NoSubCommands(PlayerCommandPreprocessEvent e) {
		String[] Splitted = e.getMessage().split(" ");
		String Command = Splitted[0].replace("/", "").toLowerCase();
		if(Command.contains(":")){
			e.setCancelled(true);
			e.getPlayer().sendMessage(Messages.title.GetString() + "§2" + Messages.CoreNoSubCommand);
			Methods.NotifyPlayerWithPerms( Messages.NoSubCommandPublic.Replace( e.getPlayer(), e.getMessage()) );
		} 
	}
}