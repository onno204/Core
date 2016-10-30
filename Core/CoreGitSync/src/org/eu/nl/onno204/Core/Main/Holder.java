package org.eu.nl.onno204.Core.Main;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.comphenix.protocol.ProtocolManager;

import net.milkbowl.vault.economy.Economy;

public class Holder {

	public static ProtocolManager protocolManager;
	public final Logger logger = Logger.getLogger("Minecraft");
	public static String title = "§8[§6Real§9Lands§8]§f";
	public static String Skype = "Live:RealLandsServer";
	public static String RawName = "RealLandsCore";
	public static String FancyName = "§4§k..§r§b§lReal§6§lLands§4§k..§r";
	public static Plugin pl = Bukkit.getPluginManager().getPlugin(RawName);
	public static ConsoleCommandSender Console = Bukkit.getServer().getConsoleSender();
	
	//Vault
    public static Economy economy = null;
    public static net.milkbowl.vault.chat.Chat Chat = null;
	
    
    
    /*
     * 
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * ENGLISH
     * 
	//Gamemode Messages
	public static String HasGamemodeMessage = "%player% Has gamemode! It's getting taken away now...";
	public static String KillGamemodeMessage = "%player% Has gamemode and killed someone! It's getting taken away now...";
	public static String GamemodeDenyMessage = "Gamemode is only for the console!";
	public static String GamemodeCheaterMessage = "§c§lEnjoy your gamemode cheater!";
	
	//Gamemode Messages
	public static String AddBivak = "You'r now wearing a hat!";
	public static String RemoveBivak = "You'r now stopping wearing a hat!";
		
	//Commands
	public static String MainCommand = "RealLandsServer";
	public static String FireworkMessage = "Enjoy some firework :D";
	public static String WarnKickMessage = "You have been warned 3 times!";
	public static String NotEnoughArgs = "Not all args included.";
	public static String EnabledCommandWatcher = "Command watcher enabled.";
	public static String DisabledCommandWatcher = "Command watcher disabled.";
	public static String NoValidPlayer = "%message% is not a valid player!";
	public static String PlayerCrashedPlayer = "%player% crashed %message%";
  	public static String FakePeopleSpawn = "%player% Spawned fake people at %message%";
	public static String NoBackPack = "§9No backpack found!";
  		
	//Packets
  	public static ArrayList<Player> BivakPlayers = new ArrayList<Player>();
		
	//Utils
	public static String CoreProtectedCommand = "I'm sorry, but this command is blocked by the core.";
	public static String CoreOnlyConsole = "Only the console can execute this Command.";
	public static String CoreNoSubCommand = "I'm sorry, but Sub commands containing ':' are not allowed!";
	public static String PlayerTriedCommand = "%player% tried the command: '%message%'!";
	public static String CommandContained = "The command contained: %message%";
	public static String ManuaddCommand = "The player %player% was moved to the kingdom %message%";
	public static String NoSubCommandPublic = "%player% tried a subcommand of a plugin: '%message%'!";
	public static String BanAndKickFormattingMessage = "Formatting the message to our custom kick/ban command!";
	public static String BroadcastFormattingMessage = "Formatting the message to our custom broadcast command!";
	public static String BanAndKickFirstLine = "You have been %bantype% by %player%!";
	public static String TempBanFirstLine = "You have been %bantype% by %player%!";
	public static ArrayList<Player> CommandWacherPlayers = new ArrayList<Player>();
	public static String CommandWacherPrefix = "§7[§8RLWatcher§7]§f";
	public static String NoCrashItemMessage = "You'r not allowed to have crash items!";
	public static String CustomJoinMessage = "§2%player% §ajoined §6Real§9Lands§a!";
	public static String CustomLeaveMessage = "§4%player% §chas left §6Real§9Lands§a!";
	public static String PvPWhitelistDeny = "§3You have to use a weapon!";
	public static boolean PvPEnabled = false;
	public static String PvPDisabled = "§cPvp is disabled!";
	public static String NoUnamedBook = "§cYou can't trow unnamed books!";
	
	//Broadcaster
	public static ArrayList<String> BroadcastMessages = new ArrayList<String>();
	public static int BroadcastCounter = 0;
		
	//AntiWorldFuckUp
	public static String DontClickTheTrapdoor = "You'r not allowed to click this awesom trapdoor!";
	public static String AllowDontClickTheTrapdoor = "Since u have perms for these trapdoors u can change them.";
	public static String AntiBuild = "You'r not allowed to build!";
  	public static String NoCrafting = "§cYou'r not allowed to craft!!";
	
	//Bank
	public static String ToTheBank = "§cJe hebt %message% op de bank gezet.";
	public static String FromTheBank = "§aJe hebt %message% In je Inventory gekregen.";
	
	*/
  //Gamemode Messages
  	public static String HasGamemodeMessage = "%player% Heeft gamemode. Het word nu weg gehaalt";
  	public static String KillGamemodeMessage = "%player% Heeft gamemode en vermoorde iemand.";
  	public static String GamemodeDenyMessage = "§4Gamemode is alleen voor console";
  	public static String GamemodeCheaterMessage = "§c§lVeel plezier met je gamemode vieze vals speler!";
	
	//Gamemode Messages
	public static String AddBivak = "§cJe hebt nu een bivak mutsje op.";
	public static String RemoveBivak = "§1Je bivak mutsje is afgedaan!";
  		
  	//Commands
  	public static String MainCommand = "RealLandsServer";
  	public static String FireworkMessage = "§aBeetje vuurwerk";
  	public static String WarnKickMessage = "Je hebt 3 waarschuwingen gehad!";
  	public static String NotEnoughArgs = "Niet genoeg opties ingevoert!";
  	public static String EnabledCommandWatcher = "Command watcher aangezet.";
  	public static String DisabledCommandWatcher = "Command watcher uitgezet.";
  	public static String NoValidPlayer = "%message% is geen levend persoon!";
  	public static String PlayerCrashedPlayer = "%player% crashed %message%";
  	public static String FakePeopleSpawn = "%player% Spawned fake people at %message%";
	public static String NoBackPack = "§9Je hebt geen rugzak aan! Hoe hem in je hand en doe /hat.";
  		
	//Packets
  	public static ArrayList<Player> BivakPlayers = new ArrayList<Player>();
	
	
  	//Utils
  	public static String CoreProtectedCommand = "Hoi. Onze Hoofd plugin blockeert deze command.";
  	public static String CoreOnlyConsole = "Alleen de console kan dit command uitvoeren.";
  	public static String CoreNoSubCommand = "Sorry. Maar commands met ':' zijn niet toegestaan!";
  	public static String PlayerTriedCommand = "%player% Probeerde de command: '%message%'!";
  	public static String CommandContained = "Het verbode woord: %message%";
  	public static String ManuaddCommand = "The player %player% was moved to the kingdom %message%";
  	public static String NoSubCommandPublic = "%player% Probeerde een Sub-Commamd: '%message%'!";
  	public static String BanAndKickFormattingMessage = "§9Het berichtje word nu omgezet naar onze Kick/Ban command.!";
  	public static String BroadcastFormattingMessage = "Gebruik /mkc broadcast";
  	public static String BanAndKickFirstLine = "You have been %bantype% by %player%!";
  	public static String TempBanFirstLine = "You have been %bantype% by %player%!";
  	public static ArrayList<Player> CommandWacherPlayers = new ArrayList<Player>();
  	public static String CommandWacherPrefix = "§7[§8RLWatcher§7]§f";
  	public static String NoCrashItemMessage = "Je mag geen crash items hebben!";
  	public static String CustomJoinMessage = "§2%player% §ajoined §6Real§9Lands§a!";
  	public static String CustomLeaveMessage = "§4%player% §chas left §6Real§9Lands§a!";
  	public static String PvPWhitelistDeny = "§3Je moet helaas een wapen gebruiken om iemand te slaan!";
	public static boolean PvPEnabled = false;
	public static String PvPDisabled = "§cPvp staat uit!";
	public static String NoUnamedBook = "§cBoeken zonder naam kan je niet gooien!";
	
  	//Broadcaster
  	public static ArrayList<String> BroadcastMessages = new ArrayList<String>();
  	public static int BroadcastCounter = 0;
  		
  	//AntiWorldFuckUp
  	public static String DontClickTheTrapdoor = "Je hebt geen toegang om aan deze coole trapdoors te zitten!";
  	public static String AllowDontClickTheTrapdoor = "Omdat jij ook cool bent mag je aan de coole trapdoors zitten.";
  	public static String AntiBuild = "§aJe bent geen bouwer! ga naar het bouwbedrijf.";
  	public static String NoCrafting = "§cJe mag helaas niks craften!";
  	
  	//Bank
  	public static String ToTheBank = "§cJe hebt %message% op de bank gezet.";
  	public static String FromTheBank = "§aJe hebt %message% In je Inventory gekregen.";

  	//ServerList
  	public static String MOTD = "§4§k..§r§b§lReal§6§lLands§4§k..§r §3Kom je mee spelen §f%player%§3?";
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	public static String BanEndMessage = "§5More questions? Ask staff in minecraft or on skype: §6" + Holder.Skype + "\n§5Please include a Screenshot's. Also include why you shouldn't be banned." + "\n§6We look almost every day on our skype: " + Holder.Skype;
	
	public static Color getColor(int i) {
		Color c = null;
		if(i==1){ c=Color.AQUA; }
		if(i==2){ c=Color.BLACK; }
		if(i==3){ c=Color.BLUE; }
		if(i==4){ c=Color.FUCHSIA; }
		if(i==5){ c=Color.GRAY; }
		if(i==6){ c=Color.GREEN; }
		if(i==7){ c=Color.LIME; }
		if(i==8){ c=Color.MAROON; }
		if(i==9){ c=Color.NAVY; }
		if(i==10){ c=Color.OLIVE; }
		if(i==11){ c=Color.ORANGE; }
		if(i==12){ c=Color.PURPLE; }
		if(i==13){ c=Color.RED; }
		if(i==14){ c=Color.SILVER; }
		if(i==15){ c=Color.TEAL; }
		if(i==16){ c=Color.WHITE; }
		if(i==17){ c=Color.YELLOW; }
		return c;
		}
}
