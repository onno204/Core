package org.eu.nl.onno204.Core.SmallEventListener;

import org.bukkit.Material;
import org.bukkit.event.block.SignChangeEvent;

public class SignReplacer {
	
	public static void SignReplacerr(SignChangeEvent e) {
		if(e.isCancelled()){ return; }
		if(e.getBlock().getType().equals(Material.SIGN) || e.getBlock().getType().equals(Material.WALL_SIGN) || e.getBlock().getType().equals(Material.SIGN_POST)){
			if(e.getLine(0).toLowerCase().contains("items")){
				e.setLine(0, "§7[§6Items§7]");
			}
		}
	}
}
