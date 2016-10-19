package org.eu.nl.onno204.Core.Inventorys;

import org.bukkit.inventory.ItemStack;

public enum ItemStacks {

	air(SetupItemstacks.air, 0, "0"),
	RedPane(SetupItemstacks.RedStainedGlass, 0, "0"),
	GreenPane(SetupItemstacks.GreenStainedGlass, 0, "0"),
	DepositDiamond_Block(SetupItemstacks.DepositBlockDia, 5000, "5000"),
	DepositGolden_Block(SetupItemstacks.DepositBlockGold, 2500, "2500"),
	DepositRedstone_Block(SetupItemstacks.DepositBlockRedstone, 1000, "1000"),
	DepositIron_Block(SetupItemstacks.DepositBlockIron, 500, "500"),
	DepositGoldIngot(SetupItemstacks.DepositGoldIngot, 100, "100"),
	DepositGoldNugget(SetupItemstacks.DepositGoldNugget, 50, "50"), //Fast
	DepositFastDiamond_Block(SetupItemstacks.DepositFastBlockDia, 50000, "50000"),
	DepositFastGolden_Block(SetupItemstacks.DepositFastBlockGold, 25000, "25000"),
	DepositFastRedstone_Block(SetupItemstacks.DepositFastBlockRedstone, 10000, "10000"),
	DepositFastIron_Block(SetupItemstacks.DepositFastBlockIron, 5000, "5000"),
	DepositFastGoldIngot(SetupItemstacks.DepositFastGoldIngot, 1000, "1000"),
	DepositFastGoldNugget(SetupItemstacks.DepositFastGoldNugget, 500, "500"),//   Take
	TakeDiamond_Block(SetupItemstacks.TakeBlockDia, 5000, "5000"),
	TakeGolden_Block(SetupItemstacks.TakeBlockGold, 2500, "2500"),
	TakeRedstone_Block(SetupItemstacks.TakeBlockRedstone, 1000, "1000"),
	TakeIron_Block(SetupItemstacks.TakeBlockIron, 500, "500"),
	TakeGoldIngot(SetupItemstacks.TakeGoldIngot, 100, "100"),
	TakeGoldNugget(SetupItemstacks.TakeGoldNugget, 50, "50"), //Fast
	TakeFastDiamond_Block(SetupItemstacks.TakeFastBlockDia, 50000, "50000"),
	TakeFastGolden_Block(SetupItemstacks.TakeFastBlockGold, 25000, "25000"),
	TakeFastRedstone_Block(SetupItemstacks.TakeFastBlockRedstone, 10000, "10000"),
	TakeFastIron_Block(SetupItemstacks.TakeFastBlockIron, 5000, "5000"),
	TakeFastGoldIngot(SetupItemstacks.TakeFastGoldIngot, 1000, "1000"),
	TakeFastGoldNugget(SetupItemstacks.TakeFastGoldNugget, 500, "500"),
	
	
	Book(SetupItemstacks.Book, 50, "50");
	
	
	
	
	
	private ItemStack itemstack;
	private int amount;
	private String amountS;
	
	ItemStacks(ItemStack itemstack, int amount, String amountS){
		this.amount = amount;
		this.itemstack = itemstack;
		this.amountS = amountS;
	}
	
	public ItemStack GetItemstack(){
		return itemstack;
	}
	
	public int GetAmount(){
		return amount;
	}
	public String GetAmountS(){
		return amountS;
	}
	
	
	
	
}
