package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.eu.nl.onno204.Core.SmallEventListener.AntiCraft;

public class CraftListener implements Listener{
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void CraftListenerr(CraftItemEvent e) {
		AntiCraft.Craft(e);
	}
	
}
