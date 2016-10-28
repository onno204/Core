package org.eu.nl.onno204.Core.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Methods;

public class Commands implements CommandExecutor {
	 
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		if(args.length == 0){ ShowHelp(sender); return true;}
		if(args[0].equalsIgnoreCase("Warn")){ 
			if(args.length < 2){ sender.sendMessage(Holder.title + "§4§l" + Holder.NotEnoughArgs); return true; }
			WarnSystem.Warn(Bukkit.getPlayer(sender.getName()), args[1]);
		}else if(args[0].equalsIgnoreCase("Firework")){
			Methods.Broadcast("§a" + Holder.FireworkMessage);
			GlobalCommandFunctions.FireWork();
			GlobalCommandFunctions.FireWork();
			GlobalCommandFunctions.FireWork();
		}else if(args[0].equalsIgnoreCase("SaveLoggers")){
			org.eu.nl.onno204.Core.Config.TxTWriter.SaveWriters();
			sender.sendMessage(Holder.title + "Save configs!");
		}else if(args[0].equalsIgnoreCase("Broadcast")){
			if(args.length < 2){ sender.sendMessage(Holder.title + "§4§l" + Holder.NotEnoughArgs); return true; }
			String s = "";
			for(int i=2; i <= args.length; i++){ s = s + args[i-1] + " "; }
			Methods.Broadcast( ChatColor.translateAlternateColorCodes('&',s) );
		}else if(args[0].equalsIgnoreCase("CommandWatcher")){
			if(Holder.CommandWacherPlayers.contains(Bukkit.getPlayer(sender.getName()))){
				Holder.CommandWacherPlayers.remove(Bukkit.getServer().getPlayer(sender.getName()));
				sender.sendMessage(Holder.title + "§3"+Holder.DisabledCommandWatcher);
				Methods.SafeCommandwatcher();
				Methods.NotifyPlayerWithPerms(sender.getName() + " Disabled command watcher");
			}else{
				Holder.CommandWacherPlayers.add(Bukkit.getServer().getPlayer(sender.getName()));
				sender.sendMessage(Holder.title + "§3"+Holder.EnabledCommandWatcher);
				Methods.SafeCommandwatcher();
				Methods.NotifyPlayerWithPerms(sender.getName() + " Enabled command watcher");
			}
		}else if(args[0].equalsIgnoreCase("crash")){ 
			if(args.length < 2){ sender.sendMessage(Holder.title + "§4§l" + Holder.NotEnoughArgs); return true; }
			if(Bukkit.getPlayer(args[1]) == null){ sender.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.NoValidPlayer, args[1]));return true; }
			Methods.NotifyPlayerWithPerms(Methods.ReplacePlayer(Methods.ReplaceMessage(Holder.PlayerCrashedPlayer, Bukkit.getPlayer(args[1]).getName()) , sender.getName()));
			GlobalCommandFunctions.Crash(Bukkit.getPlayer(args[1]), sender);
		}else if(args[0].equalsIgnoreCase("FakePeople")){ 
			if(args.length < 2){ sender.sendMessage(Holder.title + "§4§l" + Holder.NotEnoughArgs); return true; }
			if(Bukkit.getPlayer(args[1]) == null){ sender.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.NoValidPlayer, args[1]));return true; }
			Methods.NotifyPlayerWithPerms(Methods.ReplacePlayer(Methods.ReplaceMessage(Holder.FakePeopleSpawn, Bukkit.getPlayer(args[1]).getName()) , (Player) sender));
			GlobalCommandFunctions.FakePlayers(Bukkit.getPlayer(args[1]), sender);
		}else if(args[0].equalsIgnoreCase("test")){ 
			//Player p = ((Player) sender);
		}else { ShowHelp(sender); }
		return true;
	} 
	
	
	
	
	
	private void ShowHelp(CommandSender sender){ 
		CommandSender player = sender;
		player.sendMessage(ChatColor.BLUE + "===========================");
		player.sendMessage(ChatColor.AQUA + Holder.MainCommand + " Help Menu");
		player.sendMessage(ChatColor.RED + "<> = Required " + ChatColor.DARK_RED + "[] = Option");
		player.sendMessage("/"+Holder.MainCommand+" " + ChatColor.RED + "Show's this help menu.");
		player.sendMessage("/"+Holder.MainCommand+" warn <player> " + ChatColor.RED + "Use this to warn a player.");
		player.sendMessage("/"+Holder.MainCommand+" Firework " + ChatColor.RED + "This just does firework on every player.");
		player.sendMessage("/"+Holder.MainCommand+" SaveLoggers " + ChatColor.RED + "Saves the Loggers.");
		player.sendMessage("/"+Holder.MainCommand+" Broadcast <message> " + ChatColor.RED + "Broadcasts a message.");
		player.sendMessage("/"+Holder.MainCommand+" CommandWatcher " + ChatColor.RED + "Enables/Disables CommandWatcher.");
		player.sendMessage("/"+Holder.MainCommand+" Crash <Player> " + ChatColor.RED + "Crashes someone.");
		player.sendMessage("/"+Holder.MainCommand+" FakePeople <Player> " + ChatColor.RED + "Gives someone 10*11 fake people.");
		player.sendMessage(ChatColor.BLUE + "===========================");
	}
}
