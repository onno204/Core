package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.SmallEventListener.NoUnbreakable;
import org.eu.nl.onno204.Core.Utils.PvPWhitelist;

public class PvPEvent implements Listener { 
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void DamageByeEvent(org.bukkit.event.entity.EntityDamageByEntityEvent e) {
		PvPWhitelist.PvPWhitelistEvent(e);
		NoUnbreakable.NoUnbreakableEvent(e);
	}
	@EventHandler(priority = EventPriority.LOWEST)
	public void Arrow(org.bukkit.event.entity.EntityShootBowEvent e) {
		PvPWhitelist.PvPWhitelistEvent(e);
	}
	
	
	
}
