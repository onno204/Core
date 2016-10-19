package org.eu.nl.onno204.Core.Commands;

import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Config.Config;
import org.eu.nl.onno204.Core.Main.Holder;

public class BankCommand implements CommandExecutor {
	 
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		if(args.length == 0){ ShowHelp(sender); return true;}
		if(args[0].toLowerCase().equalsIgnoreCase("give")){ 
			if(args.length < 3){ sender.sendMessage(Holder.title + "§4§l" + Holder.NotEnoughArgs); return true; }
			Player player = Bukkit.getPlayer(args[1]);
			int amount = Integer.valueOf(args[2]);
			Holder.economy.withdrawPlayer(player, amount);
			player.sendMessage(Holder.title + "Er is " + amount + " euro overgemaakt naar jou.");
			sender.sendMessage(Holder.title + "Er is " + amount + " euro overgemaakt naar " + player.getName() + ".");
			Date date = new Date();
			Config.Bank.set(player.getName() + ".OpSchriften.D"+date.getDay()+".H"+date.getHours() + ".Min" +date.getMinutes()+ ".S" +date.getSeconds(), amount );
			return true;
		}else if(args[0].toLowerCase().equalsIgnoreCase("take")){ 
			if(args.length < 3){ sender.sendMessage(Holder.title + "§4§l" + Holder.NotEnoughArgs); return true; }
			Player player = Bukkit.getPlayer(args[1]);
			int amount = Integer.valueOf(args[2]);
			if(Holder.economy.getBalance(player) < amount){
				sender.sendMessage(Holder.title + "Deze speler is sceer en heeft maar: " +  Holder.economy.getBalance(player));
				return true;
			}
			Holder.economy.withdrawPlayer(player, amount);
			player.sendMessage(Holder.title + "Er is " + amount + " euro overgemaakt naar de bank.");
			sender.sendMessage(Holder.title + "Er is " + amount + " euro overgemaakt naar de bank vanaf " + player.getName() + ".");
			Date date = new Date();
			Config.Bank.set(player.getName() + ".Afschiften.D"+date.getDay()+".H"+date.getHours() + ".Min" +date.getMinutes()+ ".S" +date.getSeconds(), amount );
			
			
			
			return true;
		}else if(args[0].toLowerCase().equalsIgnoreCase("ZijnWeSceer")){ 
			sender.sendMessage(Holder.title + "Jullie hebben nog: " + Holder.economy.bankBalance("Bank").balance );
			sender.sendMessage(Holder.economy.getBanks().toString());
			return true;
		}else { ShowHelp(sender); }
		return true;
	} 
	
	private void ShowHelp(CommandSender sender){ 
		CommandSender player = sender;
		player.sendMessage(ChatColor.BLUE + "===========================");
		player.sendMessage(ChatColor.AQUA + "Bank Help Menu");
		player.sendMessage(ChatColor.RED + "<> = Required " + ChatColor.DARK_RED + "[] = Option");
		player.sendMessage("/Bank " + ChatColor.RED + "Show's this help menu.");
		player.sendMessage("/Bank Give <player> <amount>" + ChatColor.RED + "Geef iemands geld.");
		player.sendMessage("/Bank Take <player> <amount>" + ChatColor.RED + "Steel iemands geld.");
		player.sendMessage("/Bank ZijnWeSceer" + ChatColor.RED + "Steel iemands geld.");
		player.sendMessage(ChatColor.BLUE + "===========================");
	}
}
