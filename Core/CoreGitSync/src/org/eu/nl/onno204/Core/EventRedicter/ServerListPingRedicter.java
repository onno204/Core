package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerListPingRedicter implements Listener {
	
	@EventHandler
    public void onPing(ServerListPingEvent e) {
		org.eu.nl.onno204.Core.SmallEventListener.CustomTabs.HoverHandler.onPing(e);
		org.eu.nl.onno204.Core.SmallEventListener.CustomTabs.CustomHover.onPing(e);
	}
	
}
