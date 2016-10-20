package org.eu.nl.onno204.Core.Utils;

import java.util.ArrayList;

import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.Main.Holder;
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
			e.getPlayer().sendMessage(Holder.title + "§2" + Holder.CoreProtectedCommand);
			e.getPlayer().sendMessage("§2" + Holder.CoreOnlyConsole);
			e.getPlayer().sendMessage("§4§l" + Methods.ReplaceMessage(Holder.CommandContained, DeniedCommand));
            Methods.NotifyPlayerWithPerms(Methods.ReplacePlayer(Methods.ReplaceMessage(Holder.PlayerTriedCommand, e.getMessage()), e.getPlayer()));;
		}
	}
	
	public static void NoSubCommands(PlayerCommandPreprocessEvent e) {
		String[] Splitted = e.getMessage().split(" ");
		String Command = Splitted[0].replace("/", "").toLowerCase();
		if(Command.contains(":")){
			e.setCancelled(true);
			e.getPlayer().sendMessage(Holder.title + "§2" + Holder.CoreNoSubCommand);
			Methods.NotifyPlayerWithPerms( Methods.ReplaceMessage(Methods.ReplacePlayer(Holder.NoSubCommandPublic, e.getPlayer()), e.getMessage()));
		}
	}
}