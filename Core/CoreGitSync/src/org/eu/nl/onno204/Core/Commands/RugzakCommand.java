package org.eu.nl.onno204.Core.Commands;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.eu.nl.onno204.Core.Main.Holder;

import com.drtshock.playervaults.util.Lang;
import com.drtshock.playervaults.vaultmanagement.EconomyOperations;
import com.drtshock.playervaults.vaultmanagement.UUIDVaultManager;

public class RugzakCommand implements CommandExecutor {
	 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {  
		Player p = (Player) sender;
		if(p.getInventory().getHelmet() == null || p == null){ sender.sendMessage(Holder.title + Holder.NoBackPack ); return true; }
		if(!p.getInventory().getHelmet().getType().equals(Material.BRICK)){ sender.sendMessage(Holder.title + Holder.NoBackPack ); return true; }
		int VualtNR = p.getInventory().getHelmet().getAmount();
		p.performCommand("pv " + VualtNR);
		return true;
	} 
	
	
	public static boolean openOwnVault(Player player, String arg) {
		int number;
	    try {
	    	number = Integer.parseInt(arg);
	      if (number < 1) { return false; }
	    }
	    catch (NumberFormatException nfe) {
	      player.sendMessage(Holder.title + Lang.MUST_BE_NUMBER.toString());
	      return false;
	    }
	    if (checkPerms(player, number)) {
	      if (EconomyOperations.payToOpen(player, number)) {
	        Inventory inv = UUIDVaultManager.getInstance().loadOwnVault(player, number, getMaxVaultSize(player));
	        player.openInventory(inv);
	        player.sendMessage(Holder.title + "Rugzak #" + number + " word geöpent!");
	        return true;
	      }
	      player.sendMessage(Holder.title + Lang.INSUFFICIENT_FUNDS);
	      return false;
	    }
	    player.sendMessage(Holder.title + "Je mag niet meer dan 10 rugzakken bezitten!");
	    
	    return false;
	  }
	
	
	
	  
	  public static boolean checkPerms(CommandSender sender, int number) {
	    if (sender.hasPermission("playervaults.amount." + String.valueOf(number))) {
	      return true;
	    }
	    for (int x = number; x <= 99; x++) {
	      if (sender.hasPermission("playervaults.amount." + String.valueOf(x))) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	  public static int getMaxVaultSize(OfflinePlayer player) {
	    if ((player == null) || (!player.hasPlayedBefore()) || (!player.isOnline())) {
	      return 54;
	    }
	    for (int i = 6; i != 0; i--) {
	      if (player.getPlayer().hasPermission("playervaults.size." + i)) {
	        return i * 9;
	      }
	    }
	    return 54;
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
