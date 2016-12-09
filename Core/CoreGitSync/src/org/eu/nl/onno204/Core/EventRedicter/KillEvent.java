package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillEvent implements Listener{
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void GamemodeKiilEvent(PlayerDeathEvent  e) {
		//GamemodeKiilEvent(e);
	}
}
