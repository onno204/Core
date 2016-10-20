package org.eu.nl.onno204.Core.Main;

import java.util.Timer;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
//import org.bukkit.Material;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.eu.nl.onno204.Core.SmallEventListener.ScoreboardFunctions;
//import org.eu.nl.onno204.Core.Utils.PvPWhitelist;
import org.eu.nl.onno204.Core.Utils.PvPWhitelist;

import com.comphenix.protocol.ProtocolLibrary;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;

public class main extends JavaPlugin { 
	
	private static boolean Disabled = false;
	PluginDescriptionFile pdfFile = this.getDescription();
	public final Logger logger = Logger.getLogger("Minecraft");
	Timer SafeConfigs;
	Timer UtilsTimer;
	Timer FastUtilsTimer;
    
    static boolean setupEconomy() {
    	 RegisteredServiceProvider<Economy> rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
         if (rsp == null) { return false; }
         Holder.economy = rsp.getProvider();
         return Holder.economy != null;
    }
    
    static boolean setupChat() {
        RegisteredServiceProvider<Chat> rsp = Bukkit.getServer().getServicesManager().getRegistration(Chat.class);
        Holder.Chat = rsp.getProvider();
        return Holder.Chat != null;
    }
	
    public void onLoad() {
        Holder.protocolManager = ProtocolLibrary.getProtocolManager();
        
        //PlayerToZombie.Start();
        //NameHide.Start();
    }
 
	
	@SuppressWarnings("deprecation")
	public void onEnable(){
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
        	Methods.NotifyPlayerWithPerms("No vault Plugin was found!");
        	Bukkit.getPluginManager().disablePlugin(this);
        }
        
        if(!setupChat()){
        	Methods.NotifyPlayerWithPerms("No vault Chat dependency found!");
        	Disabled = true;
        	Bukkit.getPluginManager().disablePlugin(this);
        }
        if(!setupEconomy()){
        	Methods.NotifyPlayerWithPerms("No vault Economy dependency found!");
        	Disabled = true;
        	Bukkit.getPluginManager().disablePlugin(this);
        }
		
		if(Disabled){ return; }
		
		
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Is getting enabled!" + ", Created By onno204!");
		this.logger.info("=======================================================================================================");
		this.logger.info("=======================================================================================================");
		this.logger.info("********!!!!!********!!!!!***********!!!******!!!******************************************************");
		this.logger.info("******!!!****!!!***!!!***!!!*********!!!*****!!!***********!!!!!!!!************************************");
		this.logger.info("*****!!!******!!!!!!!******!!!*******!!!****!!!***********!!!******************************************");
		this.logger.info("*****!!!********!!!********!!!*******!!!**!!!************!!!*******************************************");
		this.logger.info("*****!!!********!!!********!!!*******!!!!!!*************!!!********************************************");
		this.logger.info("*****!!!********!!!********!!!*******!!!*!!!************!!!********************************************");
		this.logger.info("*****!!!********!!!********!!!*******!!!***!!!***********!!!*******************************************");
		this.logger.info("*****!!!********!!!********!!!*******!!!***!!!************!!!******************************************");
		this.logger.info("*****!!!********!!!********!!!*******!!!****!!!************!!!!!!!!************************************");
		this.logger.info("*****!!!********!!!********!!!*******!!!*****!!!*******************************************************");
		this.logger.info("=======================================================================================================");
		this.logger.info("=======================================================================================================");
		Holder.Console.sendMessage(ChatColor.AQUA + pdfFile.getName() + ChatColor.YELLOW + " Version " + pdfFile.getVersion() + ChatColor.AQUA + " Is getting enabled...");

		System.out.println("Currently restarting or reloading!");
		Methods.Broadcast("Bijna klaar met reloaden!");
		
		System.out.println("Loading Config Files...");
		if(!this.getDataFolder().exists()){ this.getDataFolder().mkdir(); System.out.println("Datafolder Created."); 
		}else{
			System.out.println("Datafolder Already exited."); 
		}
		org.eu.nl.onno204.Core.Config.TxTWriter.Load();
		org.eu.nl.onno204.Core.Config.Setup.Load();
		Holder.CommandWacherPlayers.clear();
		Methods.LoadCommandWacther();
		

		System.out.println("Setting up Inventories...");
		org.eu.nl.onno204.Core.Inventorys.SetupItemstacks.Setup();
		org.eu.nl.onno204.Core.Inventorys.Inventorys.Setup();
		
		
		System.out.println("Setting up perms...");
		PluginManager pl = Bukkit.getPluginManager();
		for(Permission perm : Permissions.AllPerms()){ pl.addPermission(perm); }
		
		System.out.println("Controlling Commands..."); 
		getCommand("RealLandsCore").setExecutor(new org.eu.nl.onno204.Core.Commands.Commands() );
		getCommand("RealLandsCore").setPermission(Permissions.Menu.toString());
		getCommand("RealLandsCore").setPermissionMessage(ChatColor.RED + "To bad. Not enough perms!");
		
		getCommand("Prefix").setExecutor(new org.eu.nl.onno204.Core.Commands.PrefixCommand() );
		getCommand("Prefix").setPermission(Permissions.Prefix.toString());
		getCommand("Prefix").setPermissionMessage(ChatColor.RED + "To bad. Not enough perms!");
		
		getCommand("Bank").setExecutor(new org.eu.nl.onno204.Core.Commands.BankCommand() );
		getCommand("Bank").setPermission(Permissions.Bank.toString());
		getCommand("Bank").setPermissionMessage(ChatColor.RED + "/Bank is alleen voor de bank! §6Om een pinautomaat te openen moet je er een zoeken.");
		
		getCommand("pvp").setExecutor(new org.eu.nl.onno204.Core.Commands.PvPCommand() );
		getCommand("pvp").setPermission(Permissions.pvp.toString());
		getCommand("pvp").setPermissionMessage(ChatColor.RED + "123123.");
		
		getCommand("Rugzak").setExecutor(new org.eu.nl.onno204.Core.Commands.RugzakCommand() );
		
		
		System.out.println("Registering events..."); 
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.AntiWurstInventoryListener(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.BlockListener(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.ChatListener(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.CommandListener(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.CraftListener(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.InteractEvent(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.Inventory(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.KillEvent(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.LoginAndOut(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.PvPEvent(), this);
		pl.registerEvents(new org.eu.nl.onno204.Core.EventRedicter.SignListener(), this);
		
		
		System.out.println("Loading Blocked Commands");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("manuaddp");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("manudel");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("manudelp");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("manuaddsub");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("manudelsub");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("mangaddp");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("mangdelp");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("mangaddi");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("mangadd");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("mangadd");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("mangadd");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.BlockedCommands.add("mangadd");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("op");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("deop");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("pl");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("a");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("about");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("ver");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("version");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("bukkit:help");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("bukkit:?");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("?");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("plugins");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("pv");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("chest");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("vault");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AxactCommand.add("playervaults");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AllowedCommands.add("manudelv");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AllowedCommands.add("manuaddv");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AllowedCommands.add("copy");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AllowedCommands.add("plot");
		org.eu.nl.onno204.Core.Utils.NoNewPerms.AllowedCommands.add("top");
		System.out.println("Adding PvPWhitelist items...");
		PvPWhitelist.AllowedWeapons.add(Material.DIAMOND_SWORD);
		PvPWhitelist.AllowedWeapons.add(Material.GOLD_SWORD);
		PvPWhitelist.AllowedWeapons.add(Material.IRON_SWORD);
		PvPWhitelist.AllowedWeapons.add(Material.WOOD_SWORD);
		PvPWhitelist.AllowedWeapons.add(Material.STONE_SWORD);
		PvPWhitelist.AllowedWeapons.add(Material.BOW);
		PvPWhitelist.AllowedWeapons.add(Material.STICK);
		
		System.out.println("Loading Broadcast messages...");
		org.eu.nl.onno204.Core.Main.Holder.BroadcastMessages.add("&2Voor alle informatie die je nodig hebt type: '/Support'");
		org.eu.nl.onno204.Core.Main.Holder.BroadcastMessages.add("&6Vragen over een plugin? onno204 staat altijd voor je klaar.");
		org.eu.nl.onno204.Core.Main.Holder.BroadcastMessages.add("&9Alle vragen die je hebt worden beantword op de skype: '&lLive:RealLandsServer&9'.");
		

		

		System.out.println("Creating ScoreBoards...");
		ScoreboardFunctions.SetupBivak();
		ScoreboardFunctions.Setup(null, false);
		
		System.out.println("SettingUp Bank...");
		Holder.economy.createBank("Bank", Bukkit.getOfflinePlayer("AstrumDeus"));
		
		System.out.println("Creating Timers...");
		UtilsTimer = new Timer();
		FastUtilsTimer = new Timer();
		SafeConfigs = new Timer();
		UtilsTimer.schedule(new org.eu.nl.onno204.Core.SmallEventListener.Timer(), 1*1000, 5*60*1000);
		FastUtilsTimer.schedule(new org.eu.nl.onno204.Core.SmallEventListener.TimerFast(), 1*1000, 1*60*1000);
		SafeConfigs.schedule(new org.eu.nl.onno204.Core.Config.SafeConfigTimer(), (long)13*1000, 10*60*1000);
		
		Holder.Console.sendMessage(ChatColor.AQUA + pdfFile.getName() + ChatColor.YELLOW + " Version " + pdfFile.getVersion() + ChatColor.AQUA + " Has Been Enabled!" + " Created By onno204!");
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled!" + ", Created By onno204!");
	}
	
	public void onDisable() {
		Holder.Console.sendMessage(ChatColor.AQUA + pdfFile.getName() + " Is getting Disabled!  " +ChatColor.RED + "");
		PluginDescriptionFile pdfFile = this.getDescription();
		
		System.out.println("Currently restarting or reloading!");
		Methods.Broadcast("Reloading!");
		
		System.out.println("Saving Configs...");
		org.eu.nl.onno204.Core.Config.TxTWriter.ExitSaveWriters();
		org.eu.nl.onno204.Core.Config.Setup.SafeConfigs();
		
		//Disablign Timers
		System.out.println("Removing Timers...");
		SafeConfigs.cancel();
		SafeConfigs.purge();
		UtilsTimer.cancel();
		UtilsTimer.purge();
		FastUtilsTimer.cancel();
		FastUtilsTimer.purge();
		
		System.out.println("Removing perms...");
		PluginManager pl = Bukkit.getPluginManager();
		for(Permission perm : Permissions.AllPerms()){ pl.removePermission(perm); }
        
		Holder.Console.sendMessage(ChatColor.AQUA + pdfFile.getName() + " Has Been Disabled!  " +ChatColor.RED + ":(");
	}
	
	
	
}