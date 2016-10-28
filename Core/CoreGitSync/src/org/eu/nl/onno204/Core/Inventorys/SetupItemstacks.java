package org.eu.nl.onno204.Core.Inventorys;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SetupItemstacks {

	@SuppressWarnings("deprecation")
	public static ItemStack air = new ItemStack(0);
	public static ItemStack RedStainedGlass;
	public static ItemStack GreenStainedGlass;
	
	//Take
	public static ItemStack TakeBlockGold;
	public static ItemStack TakeBlockRedstone;
	public static ItemStack TakeBlockIron;
	public static ItemStack TakeBlockDia;
	public static ItemStack TakeGoldIngot;
	public static ItemStack TakeGoldNugget;
	
	//Fast Take
	public static ItemStack TakeFastBlockGold;
	public static ItemStack TakeFastBlockRedstone;
	public static ItemStack TakeFastBlockIron;
	public static ItemStack TakeFastBlockDia;
	public static ItemStack TakeFastGoldIngot;
	public static ItemStack TakeFastGoldNugget;
	
	//Deposit
	public static ItemStack DepositBlockGold;
	public static ItemStack DepositBlockRedstone;
	public static ItemStack DepositBlockIron;
	public static ItemStack DepositBlockDia;
	public static ItemStack DepositGoldIngot;
	public static ItemStack DepositGoldNugget;
	//Fast Deposit
	public static ItemStack DepositFastBlockGold;
	public static ItemStack DepositFastBlockRedstone;
	public static ItemStack DepositFastBlockIron;
	public static ItemStack DepositFastBlockDia;
	public static ItemStack DepositFastGoldIngot;
	public static ItemStack DepositFastGoldNugget;
	
	//Utils
	public static ItemStack Book;

	//BanMenu
	public static ItemStack SelectTime;
	public static ItemStack SelectTypeBan;
	public static ItemStack SelectTypeKick;
	public static ItemStack SelectTypeKickall;
	public static ItemStack SelectPlayer;
	
	
	
	
	public static void Setup(){
		ItemMeta meta;
		ItemStack itemstack;
		
		//BanMenu
		itemstack = new ItemStack(Material.SKULL, 0);
		meta = itemstack.getItemMeta();
		meta.setDisplayName("§4§lKickAll.");
		itemstack.setItemMeta(meta);
		SelectPlayer = itemstack;
		
		itemstack = new ItemStack(Material.SKULL, 0);
		meta = itemstack.getItemMeta();
		meta.setDisplayName("§4§lKickAll.");
		itemstack.setItemMeta(meta);
		SelectTypeBan = itemstack;
		
		itemstack = new ItemStack(Material.SKULL, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName("§4§lKickAll.");
		itemstack.setItemMeta(meta);
		SelectTypeKickall = itemstack;
		
		itemstack = new ItemStack(Material.SKULL, 2);
		meta = itemstack.getItemMeta();
		meta.setDisplayName("§4§lKickAll.");
		itemstack.setItemMeta(meta);
		SelectTypeKick = itemstack;
		
		itemstack = new ItemStack(Material.WATCH, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName("§4§lKickAll.");
		itemstack.setItemMeta(meta);
		itemstack.addUnsafeEnchantment(Enchantment.LUCK, 1);
		//itemstack.addUnsafeEnchantment(Enchantment.LUCK, -10);
		SelectTime = itemstack;
		
		
		
		
		
		
		
		
		
		
		
		itemstack = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(ChatColor.YELLOW + "§cVeilig op de bank.");
		itemstack.setItemMeta(meta);
		RedStainedGlass = itemstack;
		
		itemstack = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
		meta = itemstack.getItemMeta();
		meta.setDisplayName("§aLekker handje contantje.");
		itemstack.setItemMeta(meta);
		GreenStainedGlass = itemstack;
		
		//Deposit
		//Deposit
		//Deposit
		//Deposit
		itemstack = new ItemStack(Material.DIAMOND_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€5000,-");
		itemstack.setItemMeta(meta);
		DepositBlockDia = itemstack;

		itemstack = new ItemStack(Material.GOLD_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€2500,-");
		itemstack.setItemMeta(meta);
		DepositBlockGold = itemstack;

		itemstack = new ItemStack(Material.REDSTONE_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€1000,-");
		itemstack.setItemMeta(meta);
		DepositBlockRedstone = itemstack;

		itemstack = new ItemStack(Material.IRON_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€500,-");
		itemstack.setItemMeta(meta);
		DepositBlockIron = itemstack;

		itemstack = new ItemStack(Material.GOLD_INGOT, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€100,-");
		itemstack.setItemMeta(meta);
		DepositGoldIngot = itemstack;

		itemstack = new ItemStack(Material.GOLD_NUGGET, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€50,-");
		itemstack.setItemMeta(meta);
		DepositGoldNugget = itemstack;
		//fast
		//fast
		//fast
		//fast
		//fast

		itemstack = new ItemStack(Material.DIAMOND_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€ 5000,-");
		itemstack.setItemMeta(meta);
		DepositFastBlockDia = itemstack;

		itemstack = new ItemStack(Material.GOLD_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€2500,-");
		itemstack.setItemMeta(meta);
		DepositFastBlockGold = itemstack;

		itemstack = new ItemStack(Material.REDSTONE_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€1000,-");
		itemstack.setItemMeta(meta);
		DepositFastBlockRedstone = itemstack;

		itemstack = new ItemStack(Material.IRON_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€500,-");
		itemstack.setItemMeta(meta);
		DepositFastBlockIron = itemstack;

		itemstack = new ItemStack(Material.GOLD_INGOT, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€100,-");
		itemstack.setItemMeta(meta);
		DepositFastGoldIngot = itemstack;

		itemstack = new ItemStack(Material.GOLD_NUGGET, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §c€50,-");
		itemstack.setItemMeta(meta);
		DepositFastGoldNugget = itemstack;
		
		
		
		//Take
		//Take
		//Take
		//Take
		itemstack = new ItemStack(Material.DIAMOND_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€ 5000,-");
		itemstack.setItemMeta(meta);
		TakeBlockDia = itemstack;

		itemstack = new ItemStack(Material.GOLD_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€2500,-");
		itemstack.setItemMeta(meta);
		TakeBlockGold = itemstack;

		itemstack = new ItemStack(Material.REDSTONE_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€1000,-");
		itemstack.setItemMeta(meta);
		TakeBlockRedstone = itemstack;

		itemstack = new ItemStack(Material.IRON_BLOCK, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€500,-");
		itemstack.setItemMeta(meta);
		TakeBlockIron = itemstack;

		itemstack = new ItemStack(Material.GOLD_INGOT, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€100,-");
		itemstack.setItemMeta(meta);
		TakeGoldIngot = itemstack;

		itemstack = new ItemStack(Material.GOLD_NUGGET, 1);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€50,-");
		itemstack.setItemMeta(meta);
		TakeGoldNugget = itemstack;
		//fast
		//fast
		//fast
		//fast
		//fast

		itemstack = new ItemStack(Material.DIAMOND_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€ 5000,-");
		itemstack.setItemMeta(meta);
		TakeFastBlockDia = itemstack;

		itemstack = new ItemStack(Material.GOLD_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€2500,-");
		itemstack.setItemMeta(meta);
		TakeFastBlockGold = itemstack;

		itemstack = new ItemStack(Material.REDSTONE_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€1000,-");
		itemstack.setItemMeta(meta);
		TakeFastBlockRedstone = itemstack;

		itemstack = new ItemStack(Material.IRON_BLOCK, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€500,-");
		itemstack.setItemMeta(meta);
		TakeFastBlockIron = itemstack;

		itemstack = new ItemStack(Material.GOLD_INGOT, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€100,-");
		itemstack.setItemMeta(meta);
		TakeFastGoldIngot = itemstack;

		itemstack = new ItemStack(Material.GOLD_NUGGET, 10);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€50,-");
		itemstack.setItemMeta(meta);
		TakeFastGoldNugget = itemstack;

		//Utils
		//Utils
		//Utils
		//Utils
		//Utils
		//Utils
		//Utils
		//Utils
		//Utils
		//Utils


		itemstack = new ItemStack(Material.BOOK_AND_QUILL, 3);
		meta = itemstack.getItemMeta();
		meta.setDisplayName(" §a€50,-");
		itemstack.setItemMeta(meta);
		Book = itemstack;
	    
	    
	}
	
	
	
}
