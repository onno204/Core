package org.eu.nl.onno204.Core.Commands;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

public class WarnSystem {
	

	public static Map<Player, Integer> WarnList = new HashMap<Player, Integer>();
	
	public static void Warn(Player sender, String PlayerString){
		Player player = null;
		for(Player p : Bukkit.getOnlinePlayers()){ if(p.getName().equalsIgnoreCase(PlayerString)){ player = p; } }
		if(player == null){ sender.sendMessage(Messages.title.GetString() + "§8§lThe player: " + PlayerString + " wasn't online!"); return; }
		
		for(Player p : Bukkit.getOnlinePlayers()){
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(p, player.getLocation());
		}
		
		
		if(!WarnList.containsKey(player)){
			WarnList.put(player, 1);
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = player.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = player.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        
			player.damage(2);
            player.sendMessage(Messages.title.GetString() + "§4§lYou have been warned by: " + sender.getDisplayName() + ".");
            player.sendMessage("§4§lThis is warning: 1/3");
            Methods.NotifyPlayerWithPerms( player.getName() + " Was warned 1/3! By: " + sender.getDisplayName()+".");
		}else if(WarnList.get(player) >= 3){
			WarnList.put(player, WarnList.get(player) + 1);

			WarnList.put(player, 1);
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = player.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = player.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        
			player.damage(10);
            String StartMessage = Messages.title.GetString() + "§l§4You have been WarnBanned by " + sender.getDisplayName() + "!";
			String MiddleMessage = "§b" + Messages.WarnKickMessage.GetString();
			String FinalMessage = "tempban " + player.getName() + " 3h " + StartMessage + "\n\n" + MiddleMessage + "\n\n" + Messages.BanEndMessage.GetString();
			Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender(), FinalMessage);
            Methods.NotifyPlayerWithPerms(player.getName() + " Was warned! " + WarnList.get(player) +"/3! By: " + sender.getDisplayName());
            WarnList.remove(player);
		}else if(WarnList.containsKey(player)){
			WarnList.put(player, WarnList.get(player) + 1);
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = player.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = player.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(player, location);
			
			player.damage(6);
            player.sendMessage(Messages.title.GetString() + "§4§lYou have been warned by: " + sender.getDisplayName() + ".");
            player.sendMessage("§4§lThis is warning: " + WarnList.get(player) +"/3");
            Methods.NotifyPlayerWithPerms(player.getName() + " Was warned! " + WarnList.get(player) +"/3! By: " + sender.getDisplayName());
		}
	}
	
}
