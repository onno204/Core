package org.eu.nl.onno204.Core.Main;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Config.Config;

public enum Messages {	

	AddBivak( Config.DefaultConfig.getString("AddBivak") ),
	AllowDontClickTheTrapdoor( Config.DefaultConfig.getString("AllowDontClickTheTrapdoor") ),
	AntiBuild( Config.DefaultConfig.getString("AntiBuild") ),
	BanAndKickFirstLine( Config.DefaultConfig.getString("BanAndKickFirstLine") ),
	BanAndKickFormattingMessage( Config.DefaultConfig.getString("BanAndKickFormattingMessage") ),
	BanEndMessage( Config.DefaultConfig.getString("BanEndMessage") ),
	BroadcastFormattingMessage( Config.DefaultConfig.getString("BroadcastFormattingMessage") ),
	BroadcastMessages( Config.DefaultConfig.getStringList("BroadcastMessages") ),
	CommandContained( Config.DefaultConfig.getString("CommandContained") ),
	CommandWacherPrefix( Config.DefaultConfig.getString("CommandWacherPrefix") ),
	CoreNoSubCommand( Config.DefaultConfig.getString("CoreNoSubCommand") ),
	CoreOnlyConsole( Config.DefaultConfig.getString("CoreOnlyConsole") ),
	CoreProtectedCommand( Config.DefaultConfig.getString("CoreProtectedCommand") ),
	CustomJoinMessage( Config.DefaultConfig.getString("CustomJoinMessage") ),
	CustomLeaveMessage( Config.DefaultConfig.getString("CustomLeaveMessage") ),
	DisabledCommandWatcher( Config.DefaultConfig.getString("DisabledCommandWatcher") ),
	DontClickTheTrapdoor( Config.DefaultConfig.getString("DontClickTheTrapdoor") ),
	EnabledCommandWatcher( Config.DefaultConfig.getString("EnabledCommandWatcher") ),
	FakePeopleSpawn( Config.DefaultConfig.getString("FakePeopleSpawn") ),
	FancyName( Config.DefaultConfig.getString("FancyName") ),
	FireworkMessage( Config.DefaultConfig.getString("FireworkMessage") ),
	FromTheBank( Config.DefaultConfig.getString("FromTheBank") ),
	GamemodeCheaterMessage( Config.DefaultConfig.getString("GamemodeCheaterMessage") ),
	HasGamemodeMessage( Config.DefaultConfig.getString("HasGamemodeMessage") ),
	GamemodeDenyMessage( Config.DefaultConfig.getString("GamemodeDenyMessage") ),
	KillGamemodeMessage( Config.DefaultConfig.getString("KillGamemodeMessage") ),
	MainCommand( Config.DefaultConfig.getString("MainCommand") ),
	ManuaddCommand( Config.DefaultConfig.getString("ManuaddCommand") ),
	MOTD( Config.DefaultConfig.getString("MOTD") ),
	NoBackPack( Config.DefaultConfig.getString("NoBackPack") ),
	NoCrafting( Config.DefaultConfig.getString("NoCrafting") ),
	NoCrashItemMessage( Config.DefaultConfig.getString("NoCrashItemMessage") ),
	NoSubCommandPublic( Config.DefaultConfig.getString("NoSubCommandPublic") ),
	NotEnoughArgs( Config.DefaultConfig.getString("NotEnoughArgs") ),
	NoUnamedBook( Config.DefaultConfig.getString("NoUnamedBook") ),
	NoValidPlayer( Config.DefaultConfig.getString("NoValidPlayer") ),
	PlayerCrashedPlayer( Config.DefaultConfig.getString("PlayerCrashedPlayer") ),
	PlayerTriedCommand( Config.DefaultConfig.getString("PlayerTriedCommand") ),
	PvPDisabled( Config.DefaultConfig.getString("PvPDisabled") ),
	PvPEnabled( Config.DefaultConfig.getBoolean("PvPEnabled")),
	PvPWhitelistDeny( Config.DefaultConfig.getString("PvPWhitelistDeny") ),
	RawName( Config.DefaultConfig.getString("RawName") ),
	RemoveBivak( Config.DefaultConfig.getString("RemoveBivak") ),
	Skype( Config.DefaultConfig.getString("Skype") ),
	TempBanFirstLine( Config.DefaultConfig.getString("TempBanFirstLine") ),
	title( Config.DefaultConfig.getString("title") ),
	ToTheBank( Config.DefaultConfig.getString("ToTheBank") ),
	WarnKickMessage( Config.DefaultConfig.getString("WarnKickMessage") ),
	;
	//Fix PvPWhitelist Allowed Weapons
	
	String Message;
	List<String> List;
	boolean Boolean;

	Messages(String Message){
		this.Message = Message;
	}
	Messages(List<String> List){
		this.List = List;
	}
	Messages(boolean Boolean){
		this.Boolean = Boolean;
	}
	public String GetString(){
		this.Message = ChatColor.translateAlternateColorCodes('&', Message);
		return this.Message;
	}
	public boolean GetBoolean(){
		return this.Boolean;
	}
	public List<String> GetList(){
		return List;
	}
	public String Replace(String player, String Message){
		String rtn = this.Message;
		rtn = rtn.replace("%player%", player);
		rtn = rtn.replace("%message%", Message);
		this.Message = rtn;
		return rtn;
	}
	public String Replace(Player player, String Message){
		String rtn = this.Message;
		rtn = rtn.replace("%player%", player.getName());
		rtn = rtn.replace("%message%", Message);
		this.Message = rtn;
		return rtn;
	}
	public String ReplaceBanType(String BanType){
		String rtn = this.Message;
		rtn = rtn.replace("%bantype%", BanType);
		this.Message = rtn;
		return rtn;
	}
	
	
	
}
