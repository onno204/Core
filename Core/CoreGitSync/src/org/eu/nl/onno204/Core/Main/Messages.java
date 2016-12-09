package org.eu.nl.onno204.Core.Main;

import java.io.File;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public enum Messages {	
	
	AddBivak( "Messages_AddBivak", "Your now wearing a hat!"),
	AllowDontClickTheTrapdoor( "Messages_AllowDontClickTheTrapdoor", "Since u have perms for these trapdoors u can change them."),
	AntiBuild( "Messages_AntiBuild", "Your not allowed to build!"),
	BanAndKickFirstLine( "Messages_BanAndKickFirstLine", "You have been %bantype% by %player%!"),
	BanAndKickFormattingMessage( "Messages_BanAndKickFormattingMessage", "Formatting the message to our custom kick/ban command!"),
	BanEndMessage( "Messages_BanEndMessage", "&5More questions? Ask staff in minecraft or on skype: &6Live:RealLandsServer\n &5Please include a Screenshots. Also include why you shouldnt be banned.\n& We look almost every day on our skype: Live:RealLandsServer"),
	BroadcastFormattingMessage( "Messages_BroadcastFormattingMessage", "Formatting the message to our custom broadcast command!"),
	BroadcastMessages( "Messages_BroadcastMessages", main.BC ),
	CommandContained( "Messages_CommandContained", "The command contained: %message%"),
	CommandWacherPrefix( "Messages_CommandWacherPrefix", "&7[&8RLWatcher&7]&f"),
	CoreNoSubCommand( "Messages_CoreNoSubCommand", "Im sorry, but Sub commands containing : are not allowed!"),
	CoreOnlyConsole( "Messages_CoreOnlyConsole", "Only the console can execute this Command."),
	CoreProtectedCommand( "Messages_CoreProtectedCommand", "Im sorry, but this command is blocked by the core."),
	CustomJoinMessage( "Messages_CustomJoinMessage", "&2%player% &ajoined &6Real&9Lands&a!"),
	CustomLeaveMessage( "Messages_CustomLeaveMessage", "&4%player% &chas left &6Real&9Lands&a!"),
	DisabledCommandWatcher( "Messages_DisabledCommandWatcher", "Command watcher disabled."),
	DontClickTheTrapdoor( "Messages_DontClickTheTrapdoor", "Your not allowed to click this awesom trapdoor!"),
	EnabledCommandWatcher( "Messages_EnabledCommandWatcher", "Command watcher enabled."),
	FakePeopleSpawn( "Messages_FakePeopleSpawn", "%player% Spawned fake people at %message%"),
	FancyName( "Messages_FancyName", "&4&k..&r&b&lReal&6&lLands&4&k..&r"),
	FireworkMessage( "Messages_FireworkMessage", "Enjoy some firework :D"),
	FromTheBank( "Messages_FromTheBank", "&aJe hebt %message% In je Inventory gekregen."),
	GamemodeCheaterMessage( "Messages_GamemodeCheaterMessage", "&c&lEnjoy your gamemode cheater!"),
	HasGamemodeMessage( "Messages_HasGamemodeMessage", "%player% Has gamemode! Its getting taken away now..."),
	GamemodeDenyMessage( "Messages_GamemodeDenyMessage", "Gamemode is only for the console!"),
	KillGamemodeMessage( "Messages_KillGamemodeMessage", "%player% Has gamemode and killed someone! Its getting taken away now..."),
	MainCommand( "Messages_MainCommand", "RealLandsCore"),
	ManuaddCommand( "Messages_ManuaddCommand", "The player %player% was moved to the kingdom %message%"),
	MOTD( "Messages_MOTD", "&3Do you want to play with us &f%player%&3?"),
	NoBackPack( "Messages_NoBackPack", "&9No backpack found!"),
	NoCrafting( "Messages_NoCrafting", "&cYour not allowed to craft!!"),
	NoCrashItemMessage( "Messages_NoCrashItemMessage", "Your not allowed to have crash items!"),
	NoSubCommandPublic( "Messages_NoSubCommandPublic", "%player% tried a subcommand of a plugin: %message%!"),
	NotEnoughArgs( "Messages_NotEnoughArgs", "Not all args included."),
	NoUnamedBook( "Messages_NoUnamedBook", "&cYou cant trow unnamed books!"),
	NoValidPlayer( "Messages_NoValidPlayer", "%message% is not a valid player!"),
	PlayerCrashedPlayer( "Messages_PlayerCrashedPlayer", "%player% crashed %message%"),
	PlayerTriedCommand( "Messages_PlayerTriedCommand", "%player% tried the command: %message%!"),
	PvPDisabled( "Messages_PvPDisabled", "&cPvp is disabled!"),
	PvPEnabled( "Messages_PvPEnabled", true),
	PvPWhitelistDeny( "Messages_PvPWhitelistDeny", "&3You have to use a weapon!"),
	RawName( "Messages_RawName", "RealLandsCore"),
	RemoveBivak( "Messages_RemoveBivak", "Your now stopping wearing a hat!"),
	Skype( "Messages_Skype", "Live:RealLandsServer"),
	TempBanFirstLine( "Messages_TempBanFirstLine", "You have been %bantype% by %player%!"),
	title( "Messages_title", "&8[&6Real&9Lands&8]&f"),
	ToTheBank( "Messages_ToTheBank", "&cJe hebt %message% op de bank gezet."),
	WarnKickMessage( "Messages_WarnKickMessage", "You have been warned 3 times!" ) ;
	//Fix PvPWhitelist Allowed Weapons

	String Message;
	String Path;
	List<String> List;
	boolean Boolean;

    private static YamlConfiguration MessagesCnf;
    private static File MessagesFile;
    
    
	Messages(String path, String Message){
		this.Message = Message;
		this.Path = path;
	}
	Messages(String path, List<String> List){
		this.List = List;
		this.Path = path;
	}
	Messages(String path, boolean Boolean){
		this.Boolean = Boolean;
		this.Path = path;
	}
	

	public String GetString(){ return Format(); }
	public String toString(){ return Format(); }
	public String GetDefaultS(){ return Message; }
	public List<String> GetDefaultL(){ return List; }
	public Boolean GetDefaultB(){ return Boolean; }
	
	public boolean GetBoolean(){ return this.Boolean; }
	public List<String> GetList(){ return this.List; }
	public String GetPath(){ return this.Path; }
    public static void setCnfFile(YamlConfiguration config) { MessagesCnf = config; }
    public static void setFile(File configFile) { MessagesFile = configFile; }
    public static YamlConfiguration GetCnfFile() { return MessagesCnf; }
    public static File GetFile(){ return MessagesFile; }
	

    public String GetType(){ 
    	if(this.Boolean){ return "Boolean";
    	}else if (this.List != null){ return "List"; 
    	} return "String"; 
    }
    
	public String Replace(String player, String Message){
		String rtn = Format();
		rtn = rtn.replace("%player%", player);
		rtn = rtn.replace("%message%", Message);
		return rtn;
	}
	public String Replace(Player player, String Message){
		String rtn = Format();
		rtn = rtn.replace("%player%", player.getName());
		rtn = rtn.replace("%message%", Message);
		return rtn;
	}
	public String ReplaceBanType(String BanType){
		String rtn = Format();
		rtn = rtn.replace("%bantype%", BanType);
		return rtn;
	}
	
	public String Format(){ 
		String CnfS = null;
		if(MessagesCnf.getString(this.Path) == null){ CnfS = GetDefaultS(); System.out.println("[Core]Using default Settings");
		}else{ CnfS = MessagesCnf.getString(this.Path); }
		return ChatColor.translateAlternateColorCodes('&', CnfS); 
	}
	
	
	
	
	
}
