package org.eu.nl.onno204.Core.SmallEventListener.CustomCommands;

public class CommandListenerCC {

	public static void CommandListenerCustomCommands(org.bukkit.event.player.PlayerCommandPreprocessEvent e) {
		if(e.getMessage().replace("/", "").toLowerCase().startsWith("support")){
			CommandsMethods.Support(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("staff")){
			CommandsMethods.Staff(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("rules")){
			CommandsMethods.Rules(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("helpercommands")){
			CommandsMethods.HelperCommands(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("moderatorcommands")){
			CommandsMethods.ModeratorCommands(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("admincommands")){
			CommandsMethods.AdminCommands(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("youtubecommands")){
			CommandsMethods.YoutubeCommands(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("buildercommands")){
			CommandsMethods.BuilderCommands(e.getPlayer());
			e.setCancelled(true);
		}else if(e.getMessage().replace("/", "").toLowerCase().startsWith("commands") || e.getMessage().replace("/", "").toLowerCase().startsWith("help") ){
			CommandsMethods.Commands(e.getPlayer());
			e.setCancelled(true);
		}
	}
}
