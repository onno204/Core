package org.eu.nl.onno204.Core.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;

public class PvPCommand implements CommandExecutor {
	 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		Boolean option = Holder.PvPEnabled;
		if(option){
			Holder.PvPEnabled = !option;
			for(Player p : Bukkit.getOnlinePlayers()){
				if(p == null){ continue; }
				p.sendMessage(Holder.title + "§4§l" + sender.getName().toUpperCase() + " heeft pvp uitgezet!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
				p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
			}
		}else {
			Holder.PvPEnabled = !option;
			for(Player p : Bukkit.getOnlinePlayers()){
				if(p == null){ continue; }
				p.sendMessage(Holder.title + "§4§l" + sender.getName().toUpperCase() + " heeft pvp aangezet!");
				p.playSound(p.getLocation(), Sound.LEVEL_UP , 10, 1);
				p.playSound(p.getLocation(), Sound.ANVIL_USE , 10, 1);
			}
		}
		return true;
	}
}
