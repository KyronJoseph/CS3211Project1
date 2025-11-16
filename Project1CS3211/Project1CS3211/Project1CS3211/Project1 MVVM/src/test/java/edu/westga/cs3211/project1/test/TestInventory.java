package edu.westga.cs3211.project1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project1.model.Inventory;
import edu.westga.cs3211.project1.model.Stock;


class TestInventory {

	@Test
	void testInventoryHasFreeSpace() {
		Inventory inv = new Inventory();
		
		
		boolean actual = inv.hasFreeSpace();
		
		assertTrue(actual);
		
	}
	
	@Test
	void testComparmentOneHasNoFreeSpace() {
		Inventory inv = new Inventory();
		
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock);
		Stock stock2 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock2);
		Stock stock3 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock3);
		Stock stock4 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock4);
		Stock stock5 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock5);
		Stock stock6 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock6);
		Stock stock7 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock7);
		Stock stock8 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock8);
		Stock stock9 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock9);
		Stock stock10 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment1(stock10);
		
		boolean actual = inv.hasFreeSpace();
		
		assertFalse(actual);
	}
	
	@Test
	void testComparmentTwoHasNoFreeSpace() {
		Inventory inv = new Inventory();
		
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock);
		Stock stock2 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock2);
		Stock stock3 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock3);
		Stock stock4 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock4);
		Stock stock5 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock5);
		Stock stock6 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock6);
		Stock stock7 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock7);
		Stock stock8 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock8);
		Stock stock9 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock9);
		Stock stock10 = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		inv.addStockToCompartment2(stock10);
		
		boolean actual = inv.hasFreeSpace();
		
		assertFalse(actual);
	
	}

}
