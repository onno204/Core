package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.Utils.OnlyPermedChat;

public class ChatListener implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerCommandPreprocessEvent(org.bukkit.event.player.PlayerChatEvent e) {
		OnlyPermedChat.PermedChatEvent(e);
	}
}
