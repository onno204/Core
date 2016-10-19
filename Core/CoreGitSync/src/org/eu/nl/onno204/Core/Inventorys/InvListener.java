package org.eu.nl.onno204.Core.Inventorys;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Methods;

public class InvListener {

	@SuppressWarnings("deprecation")
	public static void BankClickEvent(org.bukkit.event.inventory.InventoryClickEvent e) {
		  if(e.getInventory().getName() == Inventorys.Bank.getName()){
			  e.setCancelled(true);
			  Player player = ((Player)e.getWhoClicked());
			  if(e.getCurrentItem().equals(ItemStacks.DepositDiamond_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeDiamond_Block.GetItemstack(),ItemStacks.TakeDiamond_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeDiamond_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositDiamond_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositDiamond_Block.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositFastDiamond_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeFastDiamond_Block.GetItemstack(),ItemStacks.TakeFastDiamond_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeFastDiamond_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositFastDiamond_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositFastDiamond_Block.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositFastGolden_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeFastGolden_Block.GetItemstack(),ItemStacks.TakeFastGolden_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeFastGolden_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositFastGolden_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositFastGolden_Block.GetAmount());
				  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositFastGoldIngot.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeFastGoldIngot.GetItemstack(),ItemStacks.TakeFastGoldIngot.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeFastGoldIngot.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositFastGoldIngot.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositFastGoldIngot.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositFastGoldNugget.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeFastGoldNugget.GetItemstack(),ItemStacks.TakeFastGoldNugget.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeFastGoldNugget.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositFastGoldNugget.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositFastGoldNugget.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositFastIron_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeFastIron_Block.GetItemstack(),ItemStacks.TakeFastIron_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeFastIron_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositFastIron_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositFastIron_Block.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositFastRedstone_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeFastRedstone_Block.GetItemstack(),ItemStacks.TakeFastRedstone_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeFastRedstone_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositFastRedstone_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositFastRedstone_Block.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositGolden_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeGolden_Block.GetItemstack(),ItemStacks.TakeGolden_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeGolden_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositGolden_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositGolden_Block.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositGoldIngot.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeGoldIngot.GetItemstack(), ItemStacks.TakeGoldIngot.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeGoldIngot.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositGoldIngot.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositGoldIngot.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositGoldNugget.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeGoldNugget.GetItemstack(),ItemStacks.TakeGoldNugget.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeGoldNugget.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositGoldNugget.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositGoldNugget.GetItemstack().getAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositIron_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeIron_Block.GetItemstack(),ItemStacks.TakeIron_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeIron_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositIron_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositIron_Block.GetAmount());
			  
			  }else if(e.getCurrentItem().equals(ItemStacks.DepositRedstone_Block.GetItemstack()) ){
				  if(!hasAmountAndClear(player, player.getInventory(), ItemStacks.TakeRedstone_Block.GetItemstack(),ItemStacks.TakeRedstone_Block.GetItemstack().getAmount())){ player.sendMessage(Holder.title + "Je hebt het Goede betaalmiddel helaas niet.");return; }
				  player.getInventory().remove(ItemStacks.TakeRedstone_Block.GetItemstack());
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.ToTheBank, ItemStacks.DepositRedstone_Block.GetAmountS()));
				  Holder.economy.depositPlayer(player, ItemStacks.DepositRedstone_Block.GetAmount()); 
			  
			  }
			  
			  if(player.getInventory().contains(new ItemStack(Material.AIR))){ player.sendMessage(Holder.title + "Geen inventory pace vrij!");return; }
				// Take  Take  Take  Take  Take  Take  Take  Take  Take  Take  Take 
				// Take  Take  Take  Take  Take  Take  Take  Take  Take  Take  Take 
				// Take  Take  Take  Take  Take  Take  Take  Take  Take  Take  Take 
				// Take  Take  Take  Take  Take  Take  Take  Take  Take  Take  Take s
			  if(e.getCurrentItem().equals(ItemStacks.TakeDiamond_Block.GetItemstack()) ){ // Take  Take  Take  Take  Take  Take  Take  Take  Take  Take  Take 
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeDiamond_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeDiamond_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeDiamond_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeDiamond_Block.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeFastDiamond_Block.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeFastDiamond_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeFastDiamond_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeFastDiamond_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeFastDiamond_Block.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeFastGolden_Block.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeFastGolden_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeFastGolden_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeFastGolden_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeFastGolden_Block.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeFastGoldIngot.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeFastGoldIngot.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeFastGoldIngot.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeFastGoldIngot.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeFastGoldIngot.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeFastGoldNugget.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeFastGoldNugget.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeFastGoldNugget.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeFastGoldNugget.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeFastGoldNugget.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeFastIron_Block.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeFastIron_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeFastIron_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeFastIron_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeFastIron_Block.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeGolden_Block.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeGolden_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeGolden_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeGolden_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeGolden_Block.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeGoldIngot.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeGoldIngot.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeGoldIngot.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeGoldIngot.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeGoldIngot.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeGoldNugget.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeGoldNugget.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeGoldNugget.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeGoldNugget.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeGoldNugget.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeIron_Block.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeIron_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeIron_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeIron_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeIron_Block.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeRedstone_Block.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeRedstone_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeRedstone_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeRedstone_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeRedstone_Block.GetAmount()); 
			  }else if(e.getCurrentItem().equals(ItemStacks.TakeFastRedstone_Block.GetItemstack()) ){
				  if(Holder.economy.getBalance(player) < ItemStacks.TakeFastRedstone_Block.GetAmount()){ player.sendMessage(Holder.title + "Er staat niet genoeg op je rekening!");return; }
				  player.sendMessage(Holder.title + Methods.ReplaceMessage(Holder.FromTheBank, ItemStacks.TakeFastRedstone_Block.GetAmountS()));
				  player.getInventory().addItem(ItemStacks.TakeFastRedstone_Block.GetItemstack());
				  Holder.economy.withdrawPlayer(player, ItemStacks.TakeFastRedstone_Block.GetAmount()); 
			  }
			  player.updateInventory();
		  }
	}
	
	
	public static boolean hasAmountAndClear(Player p, Inventory inv, ItemStack asd, int amt){
    	if(inv == null){
    		return false;
    	}
    	Material mat = asd.getType();
        int invamt = 0;
            for (ItemStack i : inv) {
            	if(i == null){
            	}else if(i.getType() == mat){
            		invamt = invamt + i.getAmount();
            		if(i.getAmount() >= amt){
            			boolean Remove = removeItems(p, mat, amt);
            			return Remove;
            		}
               } 
            }
            //if(invamt >= amt){ return true;
            //}else{ return false; }
            return false;
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
