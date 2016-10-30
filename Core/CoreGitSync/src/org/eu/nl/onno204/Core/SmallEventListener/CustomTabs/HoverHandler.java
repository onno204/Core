package org.eu.nl.onno204.Core.SmallEventListener.CustomTabs;

import org.bukkit.event.server.ServerListPingEvent;
import org.eu.nl.onno204.Core.Config.Config;

public class HoverHandler {
	
    public static void onPing(ServerListPingEvent e) {
		e.setMotd(e.getAddress().getHostAddress());
	}
	
	public static String GetPlayer(ServerListPingEvent e){
		String ip = e.getAddress().getHostAddress();
		String Player = Config.IpRegister.getString(ip);
		
		if(Player == null){
			return "Nieuwe speler";
		}else{
			return Player;
		}
	}
	public static void RegisterPlayerAtIP(org.bukkit.event.player.PlayerJoinEvent e) {
		String ip = e.getPlayer().getAddress().getAddress().getHostAddress();
		String player = e.getPlayer().getName();
		Config.IpRegister.set(ip, player);
	}
	
}
