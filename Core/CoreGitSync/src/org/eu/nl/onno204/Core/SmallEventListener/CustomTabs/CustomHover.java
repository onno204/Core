package org.eu.nl.onno204.Core.SmallEventListener.CustomTabs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.event.server.ServerListPingEvent;
import org.eu.nl.onno204.Core.Config.Config;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

public class CustomHover {
	
    public static void onPing(ServerListPingEvent e) {
        List<String> sample = new ArrayList<String>();
        sample.add(Messages.FancyName.GetString());
        sample.add("-------------------------");
        sample.add("New game thing available");
        sample.add("Join for free stuff now!");
        //GameProfile[] samplee = {new GameProfile(new UUID(13, 41), Holder.FancyName), new GameProfile(new UUID(13, 41), Holder.FancyName)};
        
        //e.getReply().setPlayerSample(samplee);
        //e.setOnlinePlayers(Bukkit.getOnlinePlayers().size());
        e.setMaxPlayers(Bukkit.getOnlinePlayers().size() + 3);
       // e.setProtocolName("§b§l" + Holder.RawName);
        String ip = e.getAddress().getHostAddress();
        e.setMotd(Methods.ReplacePlayer(Messages.MOTD.GetString(), GetPlayer(ip)));;
    }

	public static String GetPlayer(String Host){
		String ip = Host;
		String Player = Config.IpRegister.getString(ip);
		
		if(Player == null){
			return "New Player";
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
