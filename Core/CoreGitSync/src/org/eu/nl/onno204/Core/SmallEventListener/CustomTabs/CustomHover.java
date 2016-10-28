package org.eu.nl.onno204.Core.SmallEventListener.CustomTabs;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.eu.nl.onno204.Core.Config.Config;

public class CustomHover implements Listener{

	@EventHandler
	public void onServerListPing(final ServerListPingEvent e){
		e.setMotd("§4§k..§r§b§lReal§6§lLands§4§k..§r §3Kom je mee spelen §f"+ GetPlayer(e) + "§3?");
		e.setMaxPlayers(Bukkit.getOnlinePlayers().size() + 3);
		
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
