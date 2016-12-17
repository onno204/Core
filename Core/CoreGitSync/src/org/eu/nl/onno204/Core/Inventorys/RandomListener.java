package org.eu.nl.onno204.Core.Inventorys;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class RandomListener{

	public static void RandomclickEvent(org.bukkit.event.inventory.InventoryClickEvent e) {
		  if(e.getInventory().getName() == Inventorys.Random.getName()){
			  e.setCancelled(true);
			  Player player = (Player) e.getWhoClicked();
			  if(player.getInventory().contains(new ItemStack(Material.AIR))){ player.sendMessage(Messages.title.GetString() + "Geen inventory space vrij!");return; }
			  if(e.getCurrentItem().equals(ItemStacks.Book.GetItemstack())){
				  player.sendMessage(Messages.title.GetString() + "§5Je hebt 3 boeken gekocht voor 50,-");
				  Holder.economy.withdrawPlayer(player, ItemStacks.Book.GetAmount()); 
				  player.getInventory().addItem(new ItemStack(Material.BOOK_AND_QUILL, 3));
				  player.updateInventory();
			  }
		  }
	}
}
