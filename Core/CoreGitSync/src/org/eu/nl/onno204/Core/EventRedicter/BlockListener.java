package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.SmallEventListener.AntiBuild;
import org.eu.nl.onno204.Core.SmallEventListener.TntExlpode;

public class BlockListener implements Listener{
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void PlayerAntiBuild(org.bukkit.event.block.BlockPlaceEvent e) {
		AntiBuild.PlayerAntiBuildPlace(e);
		TntExlpode.TntExplosings(e);
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void PlayerAntiBuild(org.bukkit.event.block.BlockBreakEvent e) {
		AntiBuild.PlayerAntiBuildBreak(e);
	}
	
	
}
