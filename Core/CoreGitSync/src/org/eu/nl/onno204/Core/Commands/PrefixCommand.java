package org.eu.nl.onno204.Core.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class PrefixCommand implements CommandExecutor {
	 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		if(args.length == 0){ ShowHelp(sender); return true;}
		if(args[0].toLowerCase().equalsIgnoreCase("setprefix")){ 
			if(args.length < 3){ sender.sendMessage(Messages.title.GetString() + "§4§l" + Messages.NotEnoughArgs.GetString()); return true; }
			Player player = Bukkit.getPlayer(args[1]);
			Holder.Chat.setPlayerPrefix(player, "&8[&7" + args[2].replace("&", "") + "&8]&6");
			sender.sendMessage(Messages.title.GetString() + "Updated prefix!");
			player.sendMessage(Messages.title.GetString() + "Updated prefix!");
			return true;
		}if(args[0].toLowerCase().equalsIgnoreCase("removeprefix")){ 
			if(args.length < 2){ sender.sendMessage(Messages.title.GetString() + "§4§l" + Messages.NotEnoughArgs.GetString()); return true; }
			Player player = Bukkit.getPlayer(args[1]);
			Holder.Chat.setPlayerPrefix(player, "");
			sender.sendMessage(Messages.title.GetString() + "Updated prefix!");
			player.sendMessage(Messages.title.GetString() + "Updated prefix!");
			return true;
		}else { ShowHelp(sender); }
		return true;
	} 
	
	private void ShowHelp(CommandSender sender){ 
		CommandSender player = sender;
		player.sendMessage(ChatColor.BLUE + "===========================");
		player.sendMessage(ChatColor.AQUA + "Prefix Help Menu");
		player.sendMessage(ChatColor.RED + "<> = Required " + ChatColor.DARK_RED + "[] = Option");
		player.sendMessage("/Prefix " + ChatColor.RED + "Show's this help menu.");
		player.sendMessage("/Prefix SetPrefix <player> <Prefix> §4§lGeen kleurtjeees!" + ChatColor.RED + "Stel iemands prefix.");
		player.sendMessage("/Prefix RemovePrefix <player> " + ChatColor.RED + "Haal iemand prefix weg.");
		player.sendMessage(ChatColor.BLUE + "===========================");
	}
}
