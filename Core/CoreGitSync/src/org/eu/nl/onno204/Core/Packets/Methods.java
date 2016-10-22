package org.eu.nl.onno204.Core.Packets;

import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.comphenix.packetwrapper.WrapperPlayServerExplosion;
import com.comphenix.packetwrapper.WrapperPlayServerSpawnEntity;
import com.mojang.authlib.GameProfile;

import net.minecraft.server.v1_8_R3.EntityLightning;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import net.minecraft.server.v1_8_R3.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_8_R3.PacketPlayOutNamedSoundEffect;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityWeather;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import net.minecraft.server.v1_8_R3.PlayerInteractManager;
import net.minecraft.server.v1_8_R3.WorldServer;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo.EnumPlayerInfoAction;

public class Methods {
	

	public static void Ligning(Player p, Location location){
		for(int i=0; i < 10; i++){
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedSoundEffect("ambient.weather.thunder", location.getX(), location.getY(), location.getZ(), 10000.0F, 63));
	        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(new PacketPlayOutSpawnEntityWeather(new EntityLightning(((CraftPlayer) p).getHandle().getWorld(), location.getX(), location.getY(), location.getZ(), false)));
		}
	}
	
	public static void FakeExploison(Player player, Location location){
		WrapperPlayServerExplosion fakeExplosion = new WrapperPlayServerExplosion();
		fakeExplosion.setX(location.getX());
		fakeExplosion.setY(location.getY());
		fakeExplosion.setZ(location.getZ());
		fakeExplosion.setRadius(3);
		fakeExplosion.sendPacket(player);
	}
	
	public static void SpawnFakePlayer(Player Target, String name, Location location1){
		Random rand = new Random();
        int randomx = rand.nextInt((100 - 4) + 1) + 4;
        int randomz = rand.nextInt((100 - 4) + 1) + 4;
        int randomy = rand.nextInt((7 - 1) + 1) + 1;
        int RandomTrueFalse = rand.nextInt((1 - 0) + 1) + 0;
        
        Location location;
        if(RandomTrueFalse == 1){
            location = location1.add(-randomx, -randomy, -randomz);
        }else{
            location = location1.add(randomx, randomy, randomz);
        }
        
		MinecraftServer nmsServer = ((CraftServer) Bukkit.getServer()).getServer();
		WorldServer nmsWorld = ((CraftWorld) location1.getWorld()).getHandle();
		EntityPlayer npc = new EntityPlayer(nmsServer, nmsWorld, new GameProfile(UUID.randomUUID(), name), new PlayerInteractManager(nmsWorld));
		npc.setLocation(location.getX(), location.getY(), location.getZ(), 0F, 0F);
		PlayerConnection connection = ((CraftPlayer) Target).getHandle().playerConnection;
		connection.sendPacket(new PacketPlayOutPlayerInfo(EnumPlayerInfoAction.ADD_PLAYER, npc ));
		connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
	}
	
	
	public static void SpawnObject(Player p, int type1, Location location){

	    //create the "fake" Minecart at the sheep's location
	    WrapperPlayServerSpawnEntity spawnEntityPacket = new WrapperPlayServerSpawnEntity();

		Random rand = new Random();
        int RandID = rand.nextInt(12313123) + 0;
	    spawnEntityPacket.setEntityID(RandID);
	    spawnEntityPacket.setType(type1);
	    //WrapperPlayServerSpawnEntity.ObjectTypes
	    
	    double x = location.getX();
	    double y = location.getY();
	    double z = location.getZ();

	    spawnEntityPacket.setX(x);
	    spawnEntityPacket.setY(y);
	    spawnEntityPacket.setZ(z);

	    spawnEntityPacket.sendPacket(p);
	}
	
	
	
	
}
