package org.eu.nl.onno204.Core.Inventorys;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Inventorys {
	public static Inventory Bank = Bukkit.createInventory(null, 54, "§bWelkom in de bank");
	public static Inventory Random = Bukkit.createInventory(null, 9, "§bRandom Items");
	public static Inventory BanSelectType = Bukkit.createInventory(null, 9, "§bSelect ban type");
	public static Inventory BanSelectPlayer = Bukkit.createInventory(null, 9, "§bSelect Player");
	public static Inventory BanSelectReason = Bukkit.createInventory(null, 9, "§bSelect Reason");
	public static Inventory BanSelectTime = Bukkit.createInventory(null, 9, "§bSelect Time");
	
	public static void Setup(){
		//1ste rij
		Bank.setItem(0, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(1, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(2, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(3, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(4, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(5, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(6, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(7, ItemStacks.GreenPane.GetItemstack());
		Bank.setItem(8, ItemStacks.GreenPane.GetItemstack());
		//2de rij
		Bank.setItem(9, ItemStacks.TakeDiamond_Block.GetItemstack());
		Bank.setItem(10, ItemStacks.TakeGolden_Block.GetItemstack());
		Bank.setItem(11, ItemStacks.TakeRedstone_Block.GetItemstack());
		Bank.setItem(12, ItemStacks.TakeIron_Block.GetItemstack());
		Bank.setItem(13, ItemStacks.TakeGoldIngot.GetItemstack());
		Bank.setItem(14, ItemStacks.TakeGoldNugget.GetItemstack());
		Bank.setItem(15, ItemStacks.air.GetItemstack());
		Bank.setItem(16, ItemStacks.air.GetItemstack());
		Bank.setItem(17, ItemStacks.air.GetItemstack());
		//3de Rij
		Bank.setItem(18, ItemStacks.TakeFastDiamond_Block.GetItemstack() );
		Bank.setItem(19, ItemStacks.TakeFastGolden_Block.GetItemstack() );
		Bank.setItem(20, ItemStacks.TakeFastRedstone_Block.GetItemstack() );
		Bank.setItem(21, ItemStacks.TakeFastIron_Block.GetItemstack() );
		Bank.setItem(22, ItemStacks.TakeFastGoldIngot.GetItemstack() );
		Bank.setItem(23, ItemStacks.TakeFastGoldNugget.GetItemstack() );
		Bank.setItem(24, ItemStacks.air.GetItemstack());
		Bank.setItem(25, ItemStacks.air.GetItemstack());
		Bank.setItem(26, ItemStacks.air.GetItemstack());
		//4de rij
		Bank.setItem(27, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(28, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(29, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(30, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(31, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(32, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(33, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(34, ItemStacks.RedPane.GetItemstack());
		Bank.setItem(35, ItemStacks.RedPane.GetItemstack());
		//5de rij
		Bank.setItem(36, ItemStacks.DepositDiamond_Block.GetItemstack());
		Bank.setItem(37, ItemStacks.DepositGolden_Block.GetItemstack());
		Bank.setItem(38, ItemStacks.DepositRedstone_Block.GetItemstack());
		Bank.setItem(39, ItemStacks.DepositIron_Block.GetItemstack());
		Bank.setItem(40, ItemStacks.DepositGoldIngot.GetItemstack());
		Bank.setItem(41, ItemStacks.DepositGoldNugget.GetItemstack());
		Bank.setItem(42, ItemStacks.air.GetItemstack());
		Bank.setItem(43, ItemStacks.air.GetItemstack());
		Bank.setItem(44, ItemStacks.air.GetItemstack());
		//6de Rij
		//Bank.setItem(45, ItemStacks.DepositFastDiamond_Block.GetItemstack() );
		Bank.setItem(45, ItemStacks.air.GetItemstack() );
		Bank.setItem(46, ItemStacks.DepositFastGolden_Block.GetItemstack() );
		Bank.setItem(47, ItemStacks.DepositFastRedstone_Block.GetItemstack() );
		Bank.setItem(48, ItemStacks.DepositFastIron_Block.GetItemstack() );
		Bank.setItem(49, ItemStacks.DepositFastGoldIngot.GetItemstack() );
		//Bank.setItem(50, ItemStacks.DepositFastGoldNugget.GetItemstack() );
		Bank.setItem(50, ItemStacks.air.GetItemstack() );
		Bank.setItem(51, ItemStacks.air.GetItemstack());
		Bank.setItem(52, ItemStacks.air.GetItemstack());
		Bank.setItem(53, ItemStacks.air.GetItemstack());

		//Random
		//Random
		//Random
		//Random
		//Random
		//Random
		//Random
		//Random
		//Random
		//Random
		Random.setItem(0, ItemStacks.Book.GetItemstack());
		Random.setItem(1, ItemStacks.air.GetItemstack());
		Random.setItem(2, ItemStacks.air.GetItemstack());
		Random.setItem(3, ItemStacks.air.GetItemstack());
		Random.setItem(4, ItemStacks.air.GetItemstack());
		Random.setItem(5, ItemStacks.air.GetItemstack());
		Random.setItem(6, ItemStacks.air.GetItemstack());
		Random.setItem(7, ItemStacks.air.GetItemstack());
		Random.setItem(8, ItemStacks.air.GetItemstack());
		
	}
	
}
