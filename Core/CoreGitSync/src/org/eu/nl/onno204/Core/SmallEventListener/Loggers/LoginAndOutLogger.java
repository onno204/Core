package org.eu.nl.onno204.Core.SmallEventListener.Loggers;

import java.io.IOException;
import java.util.Date;

import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.Config.TxTWriter;

public class LoginAndOutLogger implements Listener {

	@SuppressWarnings("deprecation")
	public static void Join(org.bukkit.event.player.PlayerJoinEvent e) {
		Date d = new Date();
		String prefix = "[" + d.getYear() + "y-" + d.getMonth() + "m-" + d.getDay() + "d-" + d.getHours() + "h-" + d.getMinutes() + "min-" + d.getSeconds()+ "s] {{LOGIN}}: ";
		try { TxTWriter.LogInAndOutLogger.append(System.lineSeparator() + prefix + e.getPlayer().getName());
		} catch (IOException e1) { e1.printStackTrace(); }
	}
	
	@SuppressWarnings("deprecation")
	public static void Leave(org.bukkit.event.player.PlayerQuitEvent e) {
		Date d = new Date();
		String prefix = "[" + d.getYear() + "y-" + d.getMonth() + "m-" + d.getDay() + "d-" + d.getHours() + "h-" + d.getMinutes() + "min-" + d.getSeconds()+ "s] {{LOGOUT}}: ";
		try { TxTWriter.LogInAndOutLogger.append(System.lineSeparator() + prefix + e.getPlayer().getName());
		} catch (IOException e1) { e1.printStackTrace(); }
	}
}
