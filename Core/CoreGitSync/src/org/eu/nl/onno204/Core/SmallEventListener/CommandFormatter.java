package org.eu.nl.onno204.Core.SmallEventListener;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.eu.nl.onno204.Core.Main.Messages;
import org.eu.nl.onno204.Core.Main.Methods;

public class CommandFormatter { 
	 
		public static void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent e) {
			Player p = e.getPlayer();
			String cmd = e.getMessage().toLowerCase();
			
			if(cmd.startsWith("/bank")){
				return;
			}
			
			
			
			if( cmd.startsWith("/kick") || cmd.startsWith("/ban")){
				p.sendMessage(Messages.title.GetString() + "§c" + Messages.BanAndKickFormattingMessage.GetString());
				String[] Splitted = e.getMessage().split(" ");
				String Player = Splitted[1];
				String Reason = "";
				for(int i=2; i < ( Splitted.length ); i++ ){ Reason = Reason + " " + Splitted[i]; }
				if(!Reason.endsWith(".")){ Reason = Reason + "."; }
				String CustomCommand = Splitted[0].replace("/", "");
				if(CustomCommand.equalsIgnoreCase("kick")){ CustomCommand = "kicked"; 
				}else if(CustomCommand.equalsIgnoreCase("ban")){ CustomCommand = "banned"; 
				}
				String StartMessage = "\n" + Messages.title.GetString() + "§l§4"+ Methods.ReplaceBanType(Methods.ReplacePlayer(Messages.BanAndKickFirstLine.GetString(), p), CustomCommand);
				String MiddleMessage = "§b" + Reason ;
				String FinalMessage = Splitted[0] + " " + Player + " " + StartMessage + "\n\n" + MiddleMessage + "\n\n" + Messages.BanEndMessage.GetString();
				e.setMessage(FinalMessage);
			}else if(cmd.startsWith("/tempban")){
				p.sendMessage(Messages.title.GetString() + "§c" + Messages.BanAndKickFormattingMessage.GetString());
				String[] Splitted = e.getMessage().split(" ");
				String Player = Splitted[1];
				String Time = Splitted[2];
				String Reason = "";
				for(int i=3; i < ( Splitted.length ); i++ ){ Reason = Reason + " " + Splitted[i]; }
				if(!Reason.endsWith(".")){ Reason = Reason + "."; }
				String CustomCommand = Splitted[0].replace("/", "");
				if(CustomCommand.equalsIgnoreCase("tempban")){ CustomCommand = "tempbaned"; }
				String StartMessage = "\n" + Messages.title.GetString() + "§l§4"+ Methods.ReplaceBanType(Methods.ReplacePlayer(Messages.BanAndKickFirstLine.GetString(), p), CustomCommand);
				String MiddleMessage = "§b" + Reason ;
				String FinalMessage = Splitted[0] + " " + Player + " " + Time + " " + StartMessage + "\n\n" + MiddleMessage + "\n\n" + Messages.BanEndMessage.GetString();
				e.setMessage(FinalMessage);
			}else if( cmd.startsWith("/bc") || cmd.startsWith("/broadcast")){
				p.sendMessage(Messages.title.GetString() + "§c" + Messages.BroadcastFormattingMessage.GetString());
				String[] Splitted = e.getMessage().split(" ");
				String Reason = "";
				for(int i=1; i < ( Splitted.length ); i++ ){ Reason = Reason + " " + Splitted[i]; }
				if(!Reason.endsWith(".")){ Reason = Reason + "."; }
				String FinalMessage = "/mkc broadcast" + Reason;
				e.setMessage(FinalMessage);
			}
		}
		
		
		
		
}