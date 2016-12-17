package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.eu.nl.onno204.Core.Main.Messages;

import me.onno204.MinetopiaUpgrade.main.main;

public class Drugs {

	static HashMap<Player, Integer> ItemStealTimer = new HashMap<Player, Integer>();
	public static void DrugsUse(org.bukkit.event.player.PlayerInteractEvent e) { 
		ItemStack item = e.getPlayer().getItemInHand() ;
		Player p = e.getPlayer();
		if(!((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK))){ return; }
		if(item == null){ return; }
		if(item.getType() == null){ return; }
		if(item.getType() == Material.SUGAR) { 
			if(!TimerCheck(p)){ return; }
			if(!removeItems(e.getPlayer(), Material.SUGAR, 1)){ return; }
			e.setCancelled(true);
			PotionEffect potion = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 30, 1);
			p.addPotionEffect(potion);
			p.sendMessage(Messages.FancyName.toString() + "Je hebt drugs gebruikt!");
			
		}else if(item.getType() == Material.SNOW_BLOCK) {
			if(!TimerCheck(p)){ return; } 
			if(!removeItems(e.getPlayer(), Material.SNOW_BLOCK, 1)){ return; }
			e.setCancelled(true);
			PotionEffect potion = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 90, 2);
			p.addPotionEffect(potion);
			p.sendMessage(Messages.FancyName.toString() + "Je hebt drugs gebruikt!");
			
		}else if(item.getType() == Material.SEEDS) { 
			if(!TimerCheck(p)){ return; }
			if(!removeItems(e.getPlayer(), Material.SEEDS, 1)){ return; }
			e.setCancelled(true);
			PotionEffect potion = new PotionEffect(PotionEffectType.SPEED, 60, 1);
			p.addPotionEffect(potion);
			p.sendMessage(Messages.FancyName.toString() + "Je hebt drugs gebruikt!");
			
		}else if(item.getType() == Material.COCOA) { 
			if(!TimerCheck(p)){ return; }
			if(!removeItems(e.getPlayer(), Material.COCOA, 1)){ return; }
			e.setCancelled(true);
			PotionEffect potion = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 90, 2);
			p.addPotionEffect(potion);
			PotionEffect potion2 = new PotionEffect(PotionEffectType.SLOW, 1, 60);
			p.addPotionEffect(potion2);
			p.sendMessage(Messages.FancyName.toString() + "Je hebt drugs gebruikt!");
			
		}
	}
	
	public static Boolean TimerCheck(Player p){
		if(ItemStealTimer.keySet().contains(p)){
			if(ItemStealTimer.keySet().contains(p)){
				int Current = ((int)System.currentTimeMillis());
				int Last = ItemStealTimer.get(p);
				if(Last >= Current-600 ){
					p.sendMessage(main.title + "Om drugs spam te voorkomen kan je niet zo snel klikken!");
					return false;
				}
			}
			ItemStealTimer.remove(p);
			ItemStealTimer.put(p, ((int)System.currentTimeMillis()) );
		}else{
			ItemStealTimer.put(p, ((int)System.currentTimeMillis()) );
		}
		return true;
		
	}
	
	
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
