package org.eu.nl.onno204.Core.SmallEventListener.Loggers;

import java.io.IOException;
import java.util.Date;

import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.Config.TxTWriter;

public class CommandListenerLogger { 
	 
		@SuppressWarnings("deprecation")
		public static void CommandLogger(PlayerCommandPreprocessEvent e) {
			Date d = new Date();
			String prefix = "[" + d.getYear() + "y-" + d.getMonth() + "m-" + d.getDay() + "d-" + d.getHours() + "h-" + d.getMinutes() + "min-" + d.getSeconds()+ "s] " + e.getPlayer().getName() + e.isCancelled() + ": ";
			try { TxTWriter.CommandLogger.append(System.lineSeparator() + prefix + e.getMessage());
			} catch (IOException e1) { e1.printStackTrace(); }
		}
}