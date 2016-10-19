package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.SmallEventListener.NoUnamedBooks;

public class DropItemListener implements Listener {

	@EventHandler(priority = EventPriority.LOWEST)
	public void eCrashDropItem(org.bukkit.event.player.PlayerDropItemEvent e) {
		NoUnamedBooks.UnamedBookDrop(e);
	}

}
