package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.eu.nl.onno204.Core.Inventorys.BlockListener;
import org.eu.nl.onno204.Core.SmallEventListener.NoTrapdoorChange;

public class InteractEvent implements Listener{
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void CraftListenerr(PlayerInteractEvent e) {
		NoTrapdoorChange.NoTrapdoorFuck(e);
		BlockListener.BankListener(e);
		BlockListener.RandomSignListener(e);
	}
	
}
