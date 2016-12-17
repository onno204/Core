package org.eu.nl.onno204.Core.Commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.eu.nl.onno204.Core.Config.Config;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class TntCommand implements CommandExecutor {
	 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		//Boolean option = Messages.TntEnabled.GetBoolean();
		Boolean option = Holder.TntEnabled;
		if(args.length == 0){ ShowHelp(sender); return true;}
		if(args[0].equalsIgnoreCase("on")){ 
			if(option){
				sender.sendMessage(Messages.title.GetString() + "TNT was already turned on.");
				return true;
			}
			Holder.TntEnabled = true;
			for(Player p : Bukkit.getOnlinePlayers()){
				if(p == null){ continue; }
				p.sendMessage(Messages.title.GetString() + "§4§l" + sender.getName().toUpperCase() + " heeft TNT aangezet!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
				p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
			}
		}else if(args[0].equalsIgnoreCase("off")){ 
			if(!option){
				sender.sendMessage(Messages.title.GetString() + "TNT was already turned off.");
				return true;
			}
			Holder.TntEnabled = false;
			for(Player p : Bukkit.getOnlinePlayers()){
				if(p == null){ continue; }
				p.sendMessage(Messages.title.GetString() + "§4§l" + sender.getName().toUpperCase() + " heeft TNT uitgezet!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
				p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
			}
		}else if(args[0].equalsIgnoreCase("check")){ 
			sender.sendMessage(Messages.title.GetString() + "The currently TNT enabled: " + Holder.TntEnabled);
		}else if(args[0].equalsIgnoreCase("switch")){ 
			if(option){
				Holder.TntEnabled = !option;
				for(Player p : Bukkit.getOnlinePlayers()){
					if(p == null){ continue; }
					p.sendMessage(Messages.title.GetString() + "§4§l" + sender.getName().toUpperCase() + " heeft TNT uitgezet!");
					p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
					p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
				}
			}else {
				Holder.TntEnabled = !option;
				for(Player p : Bukkit.getOnlinePlayers()){
					if(p == null){ continue; }
					p.sendMessage(Messages.title.GetString() + "§4§l" + sender.getName().toUpperCase() + " heeft TNT aangezet!");
					p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
					p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
				}
			}
		}else if(args[0].equalsIgnoreCase("get")){ 
			if(args.length < 2){ sender.sendMessage(Messages.title + "You didn't enter a amount of tnt.");; return true;}
			if(!(sender instanceof Player)){ sender.sendMessage(Messages.title+ "Player command!"); return true; }
			Player p = (Player) sender;
			int tntA = Config.Bank.getInt("TntAmount");
			int Get = Integer.parseInt(args[1]);
			ItemStack tnt = new ItemStack(Material.TNT, 1);
			ItemMeta meta = tnt.getItemMeta();
			List<String> Lore = new ArrayList<String>();
			meta.setLore(Lore);
			for(int i=0; i < Get; i++ ){
				Lore.clear();
				Lore.add("§8Tnt Nr:" + (i+tntA));
				meta.setLore(Lore);
				tnt.setItemMeta(meta);
				p.getInventory().addItem(tnt);
			}
			Config.Bank.set("TntAmount", tntA + Get);
			p.sendMessage(Messages.title.toString() + "Tnt is gegeven! Kijk maar goed in je inventory");
			
		}
		return true;
	}
	
	private void ShowHelp(CommandSender sender){ 
		CommandSender player = sender;
		player.sendMessage(ChatColor.BLUE + "===========================");
		player.sendMessage(ChatColor.AQUA + "TNT Help Menu");
		player.sendMessage(ChatColor.RED + "<> = Required " + ChatColor.DARK_RED + "[] = Option");
		player.sendMessage("/tnt " + ChatColor.RED + "Show's this help menu.");
		player.sendMessage("/tnt off " + ChatColor.RED + "Turns off TNT.");
		player.sendMessage("/tnt on " + ChatColor.RED + "Turns on TNT.");
		player.sendMessage("/tnt Check " + ChatColor.RED + "Checks the TNT status.");
		player.sendMessage("/tnt switch " + ChatColor.RED + "Switches the TNT status.");
		player.sendMessage("/tnt get <Amount>" + ChatColor.RED + "Get alowed TNT");
		player.sendMessage(ChatColor.BLUE + "===========================");
	}
}
