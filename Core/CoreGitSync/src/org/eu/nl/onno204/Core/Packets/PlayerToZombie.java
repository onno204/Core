package org.eu.nl.onno204.Core.Packets;

import org.bukkit.event.Listener;
import org.eu.nl.onno204.Core.Main.Holder;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;

public class PlayerToZombie implements Listener { 
	
	public static void Start(){
		Holder.protocolManager.addPacketListener(
		          new PacketAdapter(Holder.pl, PacketType.Play.Client.CHAT) {
		              // Note that this is executed asynchronously
		              @Override
		            public void onPacketReceiving(PacketEvent event) {
		                PacketContainer packet = event.getPacket();
		                if(packet.getType() ==  PacketType.Play.Client.BLOCK_PLACE){

		            	    //WrapperPlayClientBlockPlace BlockPacket = new WrapperPlayClientBlockPlace();
		            	    //BlockPacket.setLocation(packet.get);
		                }
		            }
		        });
	}
	
	
	
	
	
	
	public static void Start123(){
		Holder.protocolManager.addPacketListener(
		          new PacketAdapter(Holder.pl, PacketType.Play.Client.CHAT) {
		              // Note that this is executed asynchronously
		              @Override
		            public void onPacketReceiving(PacketEvent event) {
		                PacketContainer packet = event.getPacket();
		                if(packet.getType() ==  PacketType.Play.Client.BLOCK_PLACE){}
		                String message = packet.getStrings().read(0);
		 
		                if (message.contains("shit") || message.contains("fuck")) { 
		                    event.setCancelled(true);
		                    event.getPlayer().sendMessage("Bad manners!");
		                }
		            }
		        });
	}
}
