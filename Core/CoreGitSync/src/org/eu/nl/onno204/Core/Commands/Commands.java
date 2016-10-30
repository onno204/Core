package org.eu.nl.onno204.Core.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

public class Commands implements CommandExecutor {
	 
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		if(args.length == 0){ ShowHelp(sender); return true;}
		if(args[0].equalsIgnoreCase("Warn")){ 
			if(args.length < 2){ sender.sendMessage(Messages.title.GetString() + "§4§l" + Messages.NotEnoughArgs.GetString()); return true; }
			WarnSystem.Warn(Bukkit.getPlayer(sender.getName()), args[1]);
		}else if(args[0].equalsIgnoreCase("Firework")){
			Methods.Broadcast("§a" + Messages.FireworkMessage.GetString());
			GlobalCommandFunctions.FireWork();
			GlobalCommandFunctions.FireWork();
			GlobalCommandFunctions.FireWork();
		}else if(args[0].equalsIgnoreCase("SaveLoggers")){
			org.eu.nl.onno204.Core.Config.TxTWriter.SaveWriters();
			sender.sendMessage(Messages.title.GetString() + "Save configs!");
		}else if(args[0].equalsIgnoreCase("Broadcast")){
			if(args.length < 2){ sender.sendMessage(Messages.title.GetString() + "§4§l" + Messages.NotEnoughArgs.GetString()); return true; }
			String s = "";
			for(int i=2; i <= args.length; i++){ s = s + args[i-1] + " "; }
			Methods.Broadcast( ChatColor.translateAlternateColorCodes('&',s) );
		}else if(args[0].equalsIgnoreCase("CommandWatcher")){
			if(Holder.CommandWacherPlayers.contains(Bukkit.getPlayer(sender.getName()))){
				Holder.CommandWacherPlayers.remove(Bukkit.getServer().getPlayer(sender.getName()));
				sender.sendMessage(Messages.title.GetString() + "§3"+ Messages.DisabledCommandWatcher.GetString());
				Methods.SafeCommandwatcher();
				Methods.NotifyPlayerWithPerms(sender.getName() + " Disabled command watcher");
			}else{
				Holder.CommandWacherPlayers.add(Bukkit.getServer().getPlayer(sender.getName()));
				sender.sendMessage(Messages.title.GetString() + "§3"+Messages.EnabledCommandWatcher.GetString());
				Methods.SafeCommandwatcher();
				Methods.NotifyPlayerWithPerms(sender.getName() + " Enabled command watcher");
			}
		}else if(args[0].equalsIgnoreCase("crash")){ 
			if(args.length < 2){ sender.sendMessage(Messages.title.GetString() + "§4§l" + Messages.NotEnoughArgs.GetString()); return true; }
			if(Bukkit.getPlayer(args[1]) == null){ sender.sendMessage(Messages.title.GetString() + Methods.ReplaceMessage(Messages.NoValidPlayer.GetString(), args[1]));return true; }
			Methods.NotifyPlayerWithPerms(Methods.ReplacePlayer(Methods.ReplaceMessage(Messages.PlayerCrashedPlayer.GetString(), Bukkit.getPlayer(args[1]).getName()) , sender.getName()));
			GlobalCommandFunctions.Crash(Bukkit.getPlayer(args[1]), sender);
		}else if(args[0].equalsIgnoreCase("FakePeople")){ 
			if(args.length < 2){ sender.sendMessage(Messages.title.GetString() + "§4§l" + Messages.NotEnoughArgs.GetString()); return true; }
			if(Bukkit.getPlayer(args[1]) == null){ sender.sendMessage(Messages.title.GetString() + Messages.NoValidPlayer.Replace("", args[1]));return true; }
			Methods.NotifyPlayerWithPerms(Messages.FakePeopleSpawn.Replace( Bukkit.getPlayer(args[1]).getName() , sender.getName()));
			GlobalCommandFunctions.FakePlayers(Bukkit.getPlayer(args[1]), sender);
		}else if(args[0].equalsIgnoreCase("test")){ 
			//Player p = ((Player) sender);
		}else { ShowHelp(sender); }
		return true;
	} 
	
	
	
	
	
	private void ShowHelp(CommandSender sender){ 
		CommandSender player = sender;
		player.sendMessage(ChatColor.BLUE + "===========================");
		player.sendMessage(ChatColor.AQUA + Messages.MainCommand.GetString() + " Help Menu");
		player.sendMessage(ChatColor.RED + "<> = Required " + ChatColor.DARK_RED + "[] = Option");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" " + ChatColor.RED + "Show's this help menu.");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" warn <player> " + ChatColor.RED + "Use this to warn a player.");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" Firework " + ChatColor.RED + "This just does firework on every player.");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" SaveLoggers " + ChatColor.RED + "Saves the Loggers.");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" Broadcast <message> " + ChatColor.RED + "Broadcasts a message.");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" CommandWatcher " + ChatColor.RED + "Enables/Disables CommandWatcher.");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" Crash <Player> " + ChatColor.RED + "Crashes someone.");
		player.sendMessage("/"+Messages.MainCommand.GetString()+" FakePeople <Player> " + ChatColor.RED + "Gives someone 10*11 fake people.");
		player.sendMessage(ChatColor.BLUE + "===========================");
	}
}
