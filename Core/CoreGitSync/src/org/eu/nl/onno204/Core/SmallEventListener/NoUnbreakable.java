package org.eu.nl.onno204.Core.SmallEventListener;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class NoUnbreakable { 
	public static ArrayList<Material> AllowedWeapons = new ArrayList<Material>();
	
	
	
		public static void NoUnbreakableEvent(org.bukkit.event.entity.EntityDamageByEntityEvent e) {
			if(e.isCancelled()){ return; }
			if(e.getEntity() == null){ return; }
			if(!(e.getEntity() instanceof Player)){ return; }
			Player dp = (Player) e.getEntity();
			Random rnd = new Random();
			if(rnd.nextBoolean()){
				for (ItemStack item : dp.getInventory()) {
					if(item == null){continue;}
					if(!item.hasItemMeta()){ continue; }
					
					if( item.getItemMeta().spigot().isUnbreakable() ){
						dp.getInventory().remove(item);
						dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
						dp.updateInventory();
						continue;
					}
					for (int Lvl : item.getEnchantments().values()) {
						if(Lvl > 6){
							dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
							dp.getInventory().remove(item);
							dp.updateInventory();
						}
					}
					
				}
				ItemStack item = dp.getInventory().getHelmet();
				Boolean pjenis = true;
				while(pjenis){
					pjenis=false;
					if(item == null){continue;}
					if(!item.hasItemMeta()){ continue; }
					
					if( item.getItemMeta().spigot().isUnbreakable() ){
						dp.getInventory().setHelmet(new ItemStack(Material.AIR));
						dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
						dp.updateInventory();
					}

					for (int Lvl : item.getEnchantments().values()) {
						if(Lvl > 6){
							dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
							dp.getInventory().setHelmet(new ItemStack(Material.AIR));
							dp.updateInventory();
						}
					}
				}
				item = dp.getInventory().getChestplate();
				pjenis = true;
				while(pjenis){
					pjenis=false;
					if(item == null){continue;}
					if(!item.hasItemMeta()){ continue; }
					
					if( item.getItemMeta().spigot().isUnbreakable() ){
						dp.getInventory().setChestplate(new ItemStack(Material.AIR));
						dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
						item.getItemMeta().spigot().setUnbreakable(false);
						dp.updateInventory();
					}

					for (int Lvl : item.getEnchantments().values()) {
						if(Lvl > 6){
							dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
							dp.getInventory().setChestplate(new ItemStack(Material.AIR));
							dp.updateInventory();
						}
					}
				}
				item = dp.getInventory().getLeggings();
				pjenis = true;
				while(pjenis){
					pjenis=false;
					if(item == null){continue;}
					if(!item.hasItemMeta()){ continue; }
					
					if( item.getItemMeta().spigot().isUnbreakable() ){
						dp.getInventory().setLeggings(new ItemStack(Material.AIR));
						dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
						item.getItemMeta().spigot().setUnbreakable(false);
						dp.updateInventory();
					}

					for (int Lvl : item.getEnchantments().values()) {
						if(Lvl > 6){
							dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
							dp.getInventory().setLeggings(new ItemStack(Material.AIR));
							dp.updateInventory();
						}
					}
				}
				item = dp.getInventory().getBoots();
				pjenis = true;
				while(pjenis){
					pjenis=false;
					if(item == null){continue;}
					if(!item.hasItemMeta()){ continue; }
					
					if( item.getItemMeta().spigot().isUnbreakable() ){
						dp.getInventory().setBoots(new ItemStack(Material.AIR));
						dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
						item.getItemMeta().spigot().setUnbreakable(false);
						dp.updateInventory();
					}

					for (int Lvl : item.getEnchantments().values()) {
						if(Lvl > 6){
							dp.sendMessage("Niet toegestane wapens gedetecteerd. Worden nu verwijderd!");
							dp.getInventory().setBoots(new ItemStack(Material.AIR));
							dp.updateInventory();
						}
					}
				}
			}
			
			
			
			
			
		}
}
