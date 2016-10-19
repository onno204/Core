package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.Inventorys.InvListener;
import org.eu.nl.onno204.Core.Inventorys.RandomListener;

public class Inventory implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void OnplayerJoinEvent(org.bukkit.event.inventory.InventoryClickEvent e) {
		InvListener.BankClickEvent(e);
		RandomListener.RandomclickEvent(e);
	}

}
