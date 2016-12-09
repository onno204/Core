package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

import me.onno204.MinetopiaUpgrade.main.main;

public class TntExlpode {

	static HashMap<Player, Integer> ItemStealTimer = new HashMap<Player, Integer>();
	public static void TntExplosings(org.bukkit.event.block.BlockPlaceEvent e) { 
		ItemStack item = e.getPlayer().getItemInHand() ;
		Player p = e.getPlayer();
		if(item == null){ return; }
		if(item.getType() == null){ return; }
		Location Clicked = e.getBlock().getLocation();
		if(item.getType() != Material.TNT) { return; }
		if(!Holder.TntEnabled){ e.getPlayer().sendMessage(Messages.title.toString() + "Tnt staat momenteel uit"); }
		if(ItemStealTimer.keySet().contains(p)){
			if(ItemStealTimer.keySet().contains(p)){
				int Current = ((int)System.currentTimeMillis());
				int Last = ItemStealTimer.get(p);
				if(Last >= Current-920000 ){
					e.setCancelled(true);
					p.sendMessage(main.title + "Je kan maar 1 tnttje plaatsen in de zoveel tijd!");
					return;
				}
			}
			ItemStealTimer.remove(p);
			ItemStealTimer.put(p, ((int)System.currentTimeMillis()) );
		}else{
			ItemStealTimer.put(p, ((int)System.currentTimeMillis()) );
		}
		if(!removeItems(e.getPlayer(), Material.TNT, 1)){ return; }
		e.setCancelled(true);
		Methods.RunConsoleCommand("Summon PrimedTnt " + Clicked.getX() + " " + Clicked.getY() + " " + Clicked.getZ());
	}
	
    @SuppressWarnings("deprecation")
	public static boolean removeItems(Player p, Material type, int amount) {
        if (amount <= 0) return false;
        int size = p.getInventory().getSize();
        for (int slot = 0; slot < size; slot++) {
            ItemStack is = p.getInventory().getItem(slot);
            if (is == null) continue;
            if (type == is.getType()) {
                int newAmount = is.getAmount() - amount;
                if (newAmount >= 0) {
                    p.getInventory().clear(slot);;
                    is.setAmount(newAmount);
                    if(newAmount == 10){
                        p.getInventory().addItem(new ItemStack(type, 10));
                    }else{
                    	if(newAmount == 1){ newAmount = 1; }
                        p.getInventory().addItem(new ItemStack(type, newAmount));
                    }
                    p.updateInventory();
                    return true;
                }
            }
        }
		return false;
    }
	
}
