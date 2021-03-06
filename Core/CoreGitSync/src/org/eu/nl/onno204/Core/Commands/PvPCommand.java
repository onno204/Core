package org.eu.nl.onno204.Core.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class PvPCommand implements CommandExecutor {
	 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		//Boolean option = Messages.PvPEnabled.GetBoolean();
		Boolean option = Holder.PvPEnabled;
		if(args.length == 0){ ShowHelp(sender); return true;}
		if(args[0].equalsIgnoreCase("on")){ 
			if(option){
				sender.sendMessage(Messages.title.GetString() + "Pvp was already turned on.");
				return true;
			}
			Holder.PvPEnabled = true;
			for(Player p : Bukkit.getOnlinePlayers()){
				if(p == null){ continue; }
				p.sendMessage(Messages.title.GetString() + "�4�l" + sender.getName().toUpperCase() + " heeft pvp aangezet!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
				p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
			}
		}else if(args[0].equalsIgnoreCase("off")){ 
			if(!option){
				sender.sendMessage(Messages.title.GetString() + "Pvp was already turned off.");
				return true;
			}
			Holder.PvPEnabled = false;
			for(Player p : Bukkit.getOnlinePlayers()){
				if(p == null){ continue; }
				p.sendMessage(Messages.title.GetString() + "�4�l" + sender.getName().toUpperCase() + " heeft pvp uitgezet!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
				p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
			}
		}else if(args[0].equalsIgnoreCase("check")){ 
			sender.sendMessage(Messages.title.GetString() + "The currently pvp enabled: " + Holder.PvPEnabled);
		}else if(args[0].equalsIgnoreCase("switch")){ 
			if(option){
				Holder.PvPEnabled = !option;
				for(Player p : Bukkit.getOnlinePlayers()){
					if(p == null){ continue; }
					p.sendMessage(Messages.title.GetString() + "�4�l" + sender.getName().toUpperCase() + " heeft pvp uitgezet!");
					p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
					p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
				}
			}else {
				Holder.PvPEnabled = !option;
				for(Player p : Bukkit.getOnlinePlayers()){
					if(p == null){ continue; }
					p.sendMessage(Messages.title.GetString() + "�4�l" + sender.getName().toUpperCase() + " heeft pvp aangezet!");
					p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
					p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
				}
			}
		}
		return true;
	}
	
	private void ShowHelp(CommandSender sender){ 
		CommandSender player = sender;
		player.sendMessage(ChatColor.BLUE + "===========================");
		player.sendMessage(ChatColor.AQUA + "PVP Help Menu");
		player.sendMessage(ChatColor.RED + "<> = Required " + ChatColor.DARK_RED + "[] = Option");
		player.sendMessage("/ " + ChatColor.RED + "Show's this help menu.");
		player.sendMessage("/pvp off " + ChatColor.RED + "Turns off PVP.");
		player.sendMessage("/pvp on " + ChatColor.RED + "Turns on PVP.");
		player.sendMessage("/pvp Check " + ChatColor.RED + "Checks the PVP status.");
		player.sendMessage("/pvp switch " + ChatColor.RED + "Switches the PVP status.");
		player.sendMessage(ChatColor.BLUE + "===========================");
	}
}
