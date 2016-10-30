package org.eu.nl.onno204.Core.SmallEventListener;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class NoUnamedBooks implements Listener { 
	 
		public static void UnamedBookDrop(org.bukkit.event.player.PlayerDropItemEvent e) {
			if(e.isCancelled()){ return; }
			try{
				if(e.getItemDrop().getItemStack() == null){ return; }
				if(e.getItemDrop().getItemStack().getItemMeta() == null){ return; }
				if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName() == null){ return; }
				if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName().toLowerCase().contains("book and quill")){
					e.setCancelled(true);
					Player player = e.getPlayer();
					player.sendMessage(Messages.title.GetString() + "§c" + Messages.NoUnamedBook.GetString());
				}
			}catch(java.lang.NullPointerException exc){ Holder.Console.sendMessage( exc.getMessage() ); }
		}
}