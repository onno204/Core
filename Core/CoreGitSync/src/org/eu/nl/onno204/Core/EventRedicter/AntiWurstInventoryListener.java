package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.eu.nl.onno204.Core.Main.Holder;

public class AntiWurstInventoryListener implements Listener { 
	 
		@EventHandler(priority = EventPriority.LOWEST)
		public void eInventoryCrashController(org.bukkit.event.inventory.InventoryClickEvent e) {
			try{
				if(e.getCurrentItem() == null){ return; }
				if(e.getCurrentItem().getItemMeta() == null){ return; }
				if(e.getCurrentItem().getItemMeta().getDisplayName() == null){ return; }
				if(e.getCurrentItem().getItemMeta().getDisplayName().toLowerCase().contains("crash")){
					e.setCancelled(true);
					InventoryView InventoryView = e.getView();
					Player player = (Player) InventoryView.getPlayer();
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
				}
			}catch(java.lang.NullPointerException exc){ Holder.Console.sendMessage( exc.getMessage() ); }
		}
		
		@EventHandler(priority = EventPriority.LOWEST)
		public void eCrashitemRenameChecker(org.bukkit.event.inventory.InventoryClickEvent e) {
			try{
				if(e.getInventory() instanceof AnvilInventory){
					InventoryView view = e.getView();
					int rawSlot = e.getRawSlot();
					if(rawSlot == view.convertSlot(rawSlot)){
						if((rawSlot == 0) || (rawSlot == 2) ){
							ItemStack item = e.getCurrentItem();
							if(item != null){
								ItemMeta meta = item.getItemMeta();
								if(meta != null){
									if(meta.hasDisplayName()){
										if(meta.getDisplayName().toLowerCase().contains("crash")){
											e.setCancelled(true);
											InventoryView InventoryView = e.getView();
											Player player = (Player) InventoryView.getPlayer();
											player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
											player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
											player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
										}
									}
								}
							}
						}
					}
				}
			}catch(java.lang.NullPointerException exc){ Holder.Console.sendMessage( exc.getMessage() ); }
		}
		 
		@EventHandler(priority = EventPriority.LOWEST)
		public void eCrashDropItem(org.bukkit.event.player.PlayerDropItemEvent e) {
			try{
				if(e.getItemDrop().getItemStack() == null){ return; }
				if(e.getItemDrop().getItemStack().getItemMeta() == null){ return; }
				if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName() == null){ return; }
				if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName().toLowerCase().contains("crash")){
					e.setCancelled(true);
					Player player = e.getPlayer();
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
				}
			}catch(java.lang.NullPointerException exc){ Holder.Console.sendMessage( exc.getMessage() ); }
		}

		@EventHandler(priority = EventPriority.LOWEST)
		public void ePickupCrashItem(org.bukkit.event.player.PlayerPickupItemEvent e) {
			try{
				if(e.getItem().getItemStack() == null){ return; }
				if(e.getItem().getItemStack().getItemMeta() == null){ return; }
				if(e.getItem().getItemStack().getItemMeta().getDisplayName() == null){ return; }
				if(e.getItem().getItemStack().getItemMeta().getDisplayName().toLowerCase().contains("crash")){
					e.setCancelled(true);
					Player player = e.getPlayer();
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
				}
			}catch(java.lang.NullPointerException exc){ Holder.Console.sendMessage( exc.getMessage() ); }
		}
		@EventHandler(priority = EventPriority.LOWEST)
		public void ePickupCrashItem(org.bukkit.event.block.BlockPlaceEvent e) {
			try{
				if(e.getPlayer().getItemInHand() == null){ return; }
				if(e.getPlayer().getItemInHand().getItemMeta() == null){ return; }
				if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName() == null){ return; }
				if(e.getPlayer().getItemInHand().getItemMeta().getDisplayName().toLowerCase().contains("crash")){
					e.setCancelled(true);
					Player player = e.getPlayer();
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
					player.sendMessage(Holder.title + "§c" + Holder.NoCrashItemMessage);
				}
			}catch(java.lang.NullPointerException exc){ Holder.Console.sendMessage( exc.getMessage() ); }
		}
}