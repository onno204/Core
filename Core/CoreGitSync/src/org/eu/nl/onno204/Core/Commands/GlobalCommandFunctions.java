package org.eu.nl.onno204.Core.Commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.eu.nl.onno204.Core.Main.Holder;

import com.comphenix.packetwrapper.WrapperPlayServerSpawnEntity;

import net.minecraft.server.v1_8_R3.PacketPlayOutNamedSoundEffect;

public class GlobalCommandFunctions {
	
	public static void FireWork(){
		for(Player p : Bukkit.getOnlinePlayers()){
            Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
            FireworkMeta fwm = fw.getFireworkMeta();
            Random r = new Random();   
            int rt = r.nextInt(3) + 1;
            Type type = Type.BALL;       
            if (rt == 1) type = Type.BALL;
            if (rt == 2) type = Type.BALL_LARGE;
            //if (rt == 3) type = Type.BURST;
            //if (rt == 4) type = Type.CREEPER;
            if (rt == 3) type = Type.STAR;
            
            int r1i = r.nextInt(17) + 1;
            int r2i = r.nextInt(17) + 1;
            int r3i = r.nextInt(17) + 1;
            int r4i = r.nextInt(17) + 1;
            int r5i = r.nextInt(17) + 1;
            Color c1 = Holder.getColor(r1i);
            Color c2 = Holder.getColor(r2i);
            Color c3 = Holder.getColor(r3i);
            Color c4 = Holder.getColor(r4i);
            Color c5 = Holder.getColor(r5i);
            
            FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c1).withColor(c5).withFade(c2).withFade(c3).withFade(c4).with(type).trail(r.nextBoolean()).build();
            fwm.addEffect(effect);
            int rp = r.nextInt(2) + 1;
            fwm.setPower(rp);
            fw.setFireworkMeta(fwm);  
		}
	}
	
	public static void Crash(Player p, CommandSender sender){
		for(int i=0; i < 1200; i++){
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, sender.getName(), p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "henkdepotviss", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "AstrumDeus", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "ShanoPlays", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "onno204", p.getLocation());
		}
		for(int i=0; i < 1200; i++){
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = p.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = p.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.Ligning(p, location);
		}
		for(int i=0; i < 1200; i++){
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = p.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = p.getLocation().add(-randomx, -randomy, -randomz); }
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("mob.silverfish.kill", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("mob.wither.death", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("mob.zombie.death", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("random.wood_click", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("tile.piston.in", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("random.anvil_land", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("random.anvil_use", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("random.burp", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("random.door_open", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("random.drink", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
		}
		for(int i=0; i < 500; i++){
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = p.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = p.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.FakeExploison(p, location);
		}
		for(int i=0; i < 500; i++){
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = p.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = p.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.SpawnObject(p, WrapperPlayServerSpawnEntity.ObjectTypes.FALLING_BLOCK, location);
		}
		for(int i=0; i < 500; i++){
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = p.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = p.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.SpawnObject(p, WrapperPlayServerSpawnEntity.ObjectTypes.FALLING_DRAGON_EGG, location);
		}
		for(int i=0; i < 500; i++){
			Random rand = new Random();
	        int randomx = rand.nextInt((3 - 1) + 1) + 1;
	        int randomz = rand.nextInt((3 - 1) + 1) + 1;
	        int randomy = rand.nextInt((4 - 1) + 1) + 1;
	        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
	        
	        Location location = p.getLocation().add(randomx, randomy, randomz);
	        if(RandomTrueFalse == 1){ location = p.getLocation().add(-randomx, -randomy, -randomz); }
	        org.eu.nl.onno204.Core.Packets.Methods.SpawnObject(p, WrapperPlayServerSpawnEntity.ObjectTypes.FIREWORK, location);
		}
	}
	
	public static void FakePlayers(Player p, CommandSender sender){
		for(int i=0; i < 10; i++){
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, sender.getName(), p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, sender.getName(), p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, sender.getName(), p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, sender.getName(), p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "henkdepotviss", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "AstrumDeus", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "ShanoPlays", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "onno204", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "AntiHack", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "AntiHack", p.getLocation());
			org.eu.nl.onno204.Core.Packets.Methods.SpawnFakePlayer(p, "AntiHack", p.getLocation());
		}
	}
	
	
	
}
