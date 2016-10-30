package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.NameTagVisibility;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class ScoreboardFunctions {
		
		public static ScoreboardManager sbmanager = Bukkit.getScoreboardManager();
		public static Scoreboard sBoard = sbmanager.getNewScoreboard();
		public static Team Bivak = sBoard.registerNewTeam("Bivak");
		public static Team NoTeam = sBoard.registerNewTeam("NoTeam");
		
		@SuppressWarnings("deprecation")
		public static void SetupBivak(){
			Bivak.setNameTagVisibility(NameTagVisibility.HIDE_FOR_OTHER_TEAMS);
			Bivak.setAllowFriendlyFire(true);
			Bivak.setDisplayName("Anonymous.");
			Bivak.setPrefix("OverValler!");
			
			for(Player p : Bukkit.getOnlinePlayers()){
				if(p == null){ continue; }
				if(p.getInventory() == null){ NoTeam.addPlayer(Bukkit.getOfflinePlayer(p.getUniqueId())); continue; }
				if(p.getInventory().getHelmet() == null){ NoTeam.addPlayer(Bukkit.getOfflinePlayer(p.getUniqueId())); continue; }
				if(p.getInventory().getHelmet().getType() == null){ NoTeam.addPlayer(Bukkit.getOfflinePlayer(p.getUniqueId())); continue; }
				if(p.getInventory().getHelmet().getType().equals(Material.MOSSY_COBBLESTONE)){
					Bivak.addPlayer(Bukkit.getOfflinePlayer(p.getUniqueId()));
					p.sendMessage(Messages.title.GetString() + Messages.AddBivak.GetString() );
					p.setPlayerListName("Overvaller");
					p.setCustomName("Overvaller");
					p.setDisplayName("Overvaller");
				}else{ NoTeam.addPlayer(Bukkit.getOfflinePlayer(p.getUniqueId())); }
			}
		}
		
		
		public static void Setup(Player playerr, boolean quit){
			HashMap<String, Integer> ScoreBoardList = new HashMap<String, Integer>();
			
			for(Player p : Bukkit.getOnlinePlayers()){
				ScoreBoardList.clear();
				if(p == playerr){ continue; }
				
				Random random = new Random();
				Scoreboard SBB = sbmanager.getNewScoreboard();
				Objective po = SBB.registerNewObjective("R" + random.nextInt(231312123), "Dummy");
				
				po.setDisplayName("§6§lReal§9§lLands");
				ScoreBoardList.put("§aWelkom §b" + p.getName() + "§a!", 17);
				ScoreBoardList.put("§1", 16);
				ScoreBoardList.put("§4§l/Support", 15);
				ScoreBoardList.put("§5", 14);
				if(quit){ ScoreBoardList.put("§dOnline players: §5" + (Bukkit.getOnlinePlayers().size()-1), 13);
				}else{ ScoreBoardList.put("§dOnline players: §5" + Bukkit.getOnlinePlayers().size(), 13); }
				ScoreBoardList.put("§2", 12);
				ScoreBoardList.put("§5Baan: §8" +  GetJob(p), 11);
				ScoreBoardList.put("§3", 10);
				ScoreBoardList.put("§9Geld: §b€" +  Holder.economy.getBalance(Bukkit.getOfflinePlayer(p.getUniqueId())), 9);
				ScoreBoardList.put("§4", 8);
				ScoreBoardList.put("§2Level: §6" +  me.onno204.MinetopiaUpgrade.config.Confikje.UserData.getString(p.getName().toLowerCase() + ".lvl"), 7);
				ScoreBoardList.put("======================= ", 6);
				ScoreBoardList.put("§9alpha.kaashosting.nl:25756", 5);
				ScoreBoardList.put("=======================", 4);
				
				for(String key : ScoreBoardList.keySet()){
					po.getScore(key).setScore(ScoreBoardList.get(key));
				}

				po.setDisplaySlot(DisplaySlot.SIDEBAR);
				p.setScoreboard(SBB);
			}
			
		}
	
	public static String GetJob(Player p){
		String prefix = Holder.Chat.getPlayerPrefix(p);
		if(prefix.contains("Burger")){
			return "Werkloos";
		}else {
			if(ChatColor.translateAlternateColorCodes('&', Holder.Chat.getPlayerPrefix(p)).length() > 30){
				return "ToLong";
			}
			return ChatColor.translateAlternateColorCodes('&', Holder.Chat.getPlayerPrefix(p));
		}
	}
	
}
