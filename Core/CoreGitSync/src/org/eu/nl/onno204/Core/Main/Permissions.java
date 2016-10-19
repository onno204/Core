package org.eu.nl.onno204.Core.Main;

import java.util.ArrayList;

import org.bukkit.permissions.Permission;

public class Permissions {
	
	public static Permission Notify = new Permission(Holder.RawName + ".Notify");
	public static Permission GamemodeBypass = new Permission(Holder.RawName + ".Gamemode.Bypass");
	public static Permission ShowPls = new Permission(Holder.RawName + ".NoPerms.ShowPLs");
	public static Permission Menu = new Permission(Holder.RawName + ".Menu");
	public static Permission AllowChat = new Permission(Holder.RawName + ".AllowChat");
	public static Permission AllowTrapdoor = new Permission(Holder.RawName + ".AllowTrapdoor");

	public static Permission Build = new Permission(Holder.RawName + ".Build");
	public static Permission Prefix = new Permission(Holder.RawName + ".Prefix");
	public static Permission Bank = new Permission(Holder.RawName + ".Bank");
	public static Permission pvp = new Permission(Holder.RawName + ".PvP");
	

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
