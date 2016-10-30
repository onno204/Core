package org.eu.nl.onno204.Core.SmallEventListener.Gamemode;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

public class GamemodeKillEvent { 
	 
		public static void GamemodeKiilEvent(PlayerDeathEvent  e) {
			if(e.getEntity() instanceof Player){
				Player p = e.getEntity();
				if( !(p.getKiller() instanceof Player) ) { return; }
				Player killer = p.getKiller();
				if(killer.getGameMode() == GameMode.CREATIVE){
					Methods.RunConsoleCommand("gamemode survival " + killer.getName());
					Methods.NotifyPlayerWithPerms(Messages.title.GetString() + "§c§l" + Methods.ReplacePlayer( Messages.KillGamemodeMessage.GetString(), killer));
					Methods.NotifyPlayerWithPerms(Messages.title.GetString() + "§c§l" + Methods.ReplacePlayer( Messages.KillGamemodeMessage.GetString(), killer));
				}
			}
		}
}