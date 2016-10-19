package org.eu.nl.onno204.Core.Utils;

import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Permissions;

public class OnlyPermedChat {

	@SuppressWarnings("deprecation")
	public static void PermedChatEvent(org.bukkit.event.player.PlayerChatEvent e) {
		if(e.isCancelled()){ return; }
		if(!e.getPlayer().hasPermission(Permissions.AllowChat)){
			e.setCancelled(true);
			e.getPlayer().sendMessage(Holder.title + "§4§lAls het belangerijk is ga je maar naar onze skype! §c" + Holder.Skype);
		}
	}
}
