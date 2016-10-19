package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.eu.nl.onno204.Core.SmallEventListener.AntiJordy;
import org.eu.nl.onno204.Core.SmallEventListener.JoinAndLeaveMessage;
import org.eu.nl.onno204.Core.SmallEventListener.ScoreboardFunctions;
import org.eu.nl.onno204.Core.SmallEventListener.Gamemode.GamemodeJoinEvent;
import org.eu.nl.onno204.Core.SmallEventListener.Loggers.LoginAndOutLogger;

public class LoginAndOut implements Listener{
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void QuitEventHandler(PlayerQuitEvent e) {
		ScoreboardFunctions.Setup(e.getPlayer(), true);
		JoinAndLeaveMessage.CustomLeaveMessage(e);
		LoginAndOutLogger.Leave(e);
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void JoinEventHandler(PlayerJoinEvent e) {
		GamemodeJoinEvent.OnPlayerJoinEvent(e);
		ScoreboardFunctions.Setup(null, false);
		AntiJordy.AntiJordyJoinEvent(e);
		JoinAndLeaveMessage.CustomJoinMessage(e);
		LoginAndOutLogger.Join(e);
	}
}
