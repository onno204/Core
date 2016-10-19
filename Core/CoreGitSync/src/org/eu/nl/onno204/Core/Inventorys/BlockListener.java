package org.eu.nl.onno204.Core.Inventorys;

import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.eu.nl.onno204.Core.Main.Holder;

public class BlockListener {
	
	public static void BankListener(org.bukkit.event.player.PlayerInteractEvent e) {
		if (e.getAction().toString().equalsIgnoreCase("RIGHT_CLICK_BLOCK")){
			if(e.getClickedBlock().getType().equals(Material.DROPPER)){
				e.getPlayer().sendMessage(Holder.title + "§6De bank word nu geopent!");
				e.setCancelled(true);
				e.getPlayer().openInventory(org.eu.nl.onno204.Core.Inventorys.Inventorys.Bank);
			}
		}
	}
	
	public static void RandomSignListener(org.bukkit.event.player.PlayerInteractEvent e) {
		if (e.getAction().toString().equalsIgnoreCase("RIGHT_CLICK_BLOCK")){
			if(e.getClickedBlock().getType().equals(Material.SIGN) || e.getClickedBlock().getType().equals(Material.WALL_SIGN) || e.getClickedBlock().getType().equals(Material.SIGN_POST)){
				Sign sign = (Sign) e.getClickedBlock().getState();
				if(sign.getLine(0).contains("Items")){
					e.getPlayer().sendMessage(Holder.title + "§6De item menu word nu geöpent!");
					e.getPlayer().openInventory(Inventorys.Random);
				}
			}
		}
	}
}
