package org.eu.nl.onno204.Core.SmallEventListener.Gamemode;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;
import org.eu.nl.onno204.Core.Main.Permissions;

public class GamemodeJoinEvent {

	public static void OnPlayerJoinEvent(org.bukkit.event.player.PlayerJoinEvent e) {
		  Player p = e.getPlayer();
		  if(p.getGameMode() != GameMode.SURVIVAL){
			  if(!p.hasPermission(Permissions.GamemodeBypass)){
				  Methods.RunConsoleCommand("gamemode survival " + p.getName());
				  p.setFlying(false);
				  Methods.NotifyPlayerWithPerms(Messages.title.GetString() + "§c§l" + Methods.ReplacePlayer(Messages.HasGamemodeMessage.toString(), p));
				  Methods.NotifyPlayerWithPerms(Messages.title.GetString() + "§c§l" + Methods.ReplacePlayer(Messages.HasGamemodeMessage.toString(), p));
			  }
		  }
		}
}
