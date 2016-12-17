package org.eu.nl.onno204.Core.EventRedicter;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class ChestOpenEvent implements Listener { 
	 
		@EventHandler(priority = EventPriority.LOWEST)
		public void onPlayerCommandPreprocessEvent(org.bukkit.event.inventory.InventoryOpenEvent e) {

			Random rnd = new Random();
			if(rnd.nextBoolean()){
				for (ItemStack item : e.getInventory()) {
					if(item == null){continue;}
					if(!item.hasItemMeta()){ continue; }
					Player p = (Player) e.getPlayer();
					if( item.getItemMeta().spigot().isUnbreakable() ){
						e.getInventory().remove(item);
						p.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
						continue;
					}
					for (int Lvl : item.getEnchantments().values()) {
						if(Lvl > 6){
							p.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
							e.getInventory().remove(item);
						}
					}
					
				}
			}
		}

}
