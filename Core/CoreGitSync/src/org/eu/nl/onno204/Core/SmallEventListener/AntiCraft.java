package org.eu.nl.onno204.Core.SmallEventListener;

import org.bukkit.Material;
import org.eu.nl.onno204.Core.Main.Messages;

public class AntiCraft {
	
	public static void Craft(org.bukkit.event.inventory.CraftItemEvent e) {
		if(e.isCancelled()){ return; }
		if(e.getCurrentItem().getType().equals(Material.WRITTEN_BOOK)) { return; }
		e.setCancelled(true);
		e.getWhoClicked().sendMessage(Messages.title.GetString() + Messages.NoCrafting.GetString());
	}
	
}
