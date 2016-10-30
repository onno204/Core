package org.eu.nl.onno204.Core.Main;

import java.util.ArrayList;

import org.bukkit.permissions.Permission;

public class Permissions {
	
	public static Permission Notify = new Permission(Messages.RawName.GetString() + ".Notify");
	public static Permission GamemodeBypass = new Permission(Messages.RawName.GetString() + ".Gamemode.Bypass");
	public static Permission ShowPls = new Permission(Messages.RawName.GetString() + ".NoPerms.ShowPLs");
	public static Permission Menu = new Permission(Messages.RawName.GetString() + ".Menu");
	public static Permission AllowChat = new Permission(Messages.RawName.GetString() + ".AllowChat");
	public static Permission AllowTrapdoor = new Permission(Messages.RawName.GetString() + ".AllowTrapdoor");

	public static Permission Build = new Permission(Messages.RawName.GetString() + ".Build");
	public static Permission Prefix = new Permission(Messages.RawName.GetString() + ".Prefix");
	public static Permission Bank = new Permission(Messages.RawName.GetString() + ".Bank");
	public static Permission pvp = new Permission(Messages.RawName.GetString() + ".PvP");
	

	public static ArrayList<Permission> Perms = new ArrayList<Permission>();
	
	public static ArrayList<Permission> AllPerms(){
		Perms.clear();
		Perms.add(Notify);
		Perms.add(ShowPls);
		Perms.add(Menu);
		Perms.add(AllowChat);
		Perms.add(AllowTrapdoor);
		Perms.add(Build);
		Perms.add(Bank);
		Perms.add(pvp);
		return Perms;
	}
}
