package org.eu.nl.onno204.Core.Utils;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;

public class PvPWhitelist { 
	public static ArrayList<Material> AllowedWeapons = new ArrayList<Material>();
	
		public static void PvPWhitelistEvent(org.bukkit.event.entity.EntityDamageByEntityEvent e) {
			if(e.isCancelled()){ return; }
			
			if(e.getEntity() == null){ return; }
			if(!(e.getEntity() instanceof Player)){ return; }
			if(e.getDamager() == null){ return; }
			if(!(e.getDamager() instanceof Player)){ return; }
			Player dp = (Player) e.getDamager();
			if(!Holder.PvPEnabled){ dp.sendMessage(Holder.title + Holder.PvPDisabled); e.setCancelled(true); return; }
			if(!AllowedWeapons.contains(dp.getItemInHand().getType())){
				e.setCancelled(true);
				dp.sendMessage(Holder.title  + Holder.PvPWhitelistDeny);
			}
		}
}
