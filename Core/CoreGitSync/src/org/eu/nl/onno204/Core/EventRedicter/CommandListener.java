package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.SmallEventListener.CommandFormatter;
import org.eu.nl.onno204.Core.SmallEventListener.CustomCommands.CommandListenerCC;
import org.eu.nl.onno204.Core.SmallEventListener.Gamemode.GamemodeCommandListener;
import org.eu.nl.onno204.Core.SmallEventListener.Loggers.CommandListenerLogger;
import org.eu.nl.onno204.Core.Utils.CommandHelperListener;
import org.eu.nl.onno204.Core.Utils.CommandWatcherListener;
import org.eu.nl.onno204.Core.Utils.NoNewPerms;

public class CommandListener implements Listener { 
	 
		@EventHandler(priority = EventPriority.LOWEST)
		public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent e) {
			GamemodeCommandListener.GamemodeListenerCommand(e);
			CommandListenerCC.CommandListenerCustomCommands(e);
			NoNewPerms.NoNewPermsCommandListner(e);
			NoNewPerms.NoSubCommands(e);
			CommandWatcherListener.onPlayerCommandPreprocessEvent(e);
			CommandHelperListener.onPlayerCommandPreprocessEvent(e);
			CommandFormatter.onPlayerCommandPreprocessEvent(e);
			CommandListenerLogger.CommandLogger(e);
		}
		
}
