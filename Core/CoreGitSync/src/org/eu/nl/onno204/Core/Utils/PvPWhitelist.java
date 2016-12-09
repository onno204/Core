package org.eu.nl.onno204.Core.Utils;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class PvPWhitelist { 
	public static ArrayList<Material> AllowedWeapons = new ArrayList<Material>();
	
		public static void PvPWhitelistEvent(org.bukkit.event.entity.EntityDamageByEntityEvent e) {
			if(e.isCancelled()){ return; }
			
			if(e.getEntity() == null){ return; }
			if(!(e.getEntity() instanceof Player)){ return; }
			if(e.getDamager() == null){ return; }
			if(!(e.getDamager() instanceof Player)){ return; }
			Player dp = (Player) e.getDamager();
			//if(!Messages.PvPEnabled.GetBoolean()){ dp.sendMessage(Messages.title.GetString() + Messages.PvPDisabled.GetString()); e.setCancelled(true); return; }
			if(!Holder.PvPEnabled){ dp.sendMessage(Messages.title.GetString() + Messages.PvPDisabled.GetString()); e.setCancelled(true); return; }
			if(!AllowedWeapons.contains(dp.getItemInHand().getType())){
				e.setCancelled(true);
				dp.sendMessage(Messages.title.GetString()  + Messages.PvPWhitelistDeny.GetString());
			}
		}
		
		public static void PvPWhitelistEvent(org.bukkit.event.entity.EntityShootBowEvent e) {
			if(e.isCancelled()){ return; }
			
			if(e.getEntity() == null){ return; }
			if(!(e.getEntity() instanceof Player)){ return; }
			Player p = (Player) e.getEntity();
			//if(!Messages.PvPEnabled.GetBoolean()){ p.sendMessage(Messages.title.GetString() + Messages.AddBivak.GetString()); e.setCancelled(true); return; }
			if(!Holder.PvPEnabled){ p.sendMessage(Messages.title.GetString() + Messages.PvPDisabled.GetString()); e.setCancelled(true); return; }
			if(!AllowedWeapons.contains(p.getItemInHand().getType())){
				e.setCancelled(true);
				p.sendMessage(Messages.title.GetString()  + Messages.PvPWhitelistDeny.GetString());
			}
		}
		
}
