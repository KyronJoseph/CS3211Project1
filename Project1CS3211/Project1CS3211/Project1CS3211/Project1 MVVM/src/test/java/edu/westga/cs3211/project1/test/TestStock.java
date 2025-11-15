package edu.westga.cs3211.project1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project1.model.Stock;

class TestStock {

	@Test
	void testGetStockSize() {
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		
		String actual = stock.getSize();
		
		assertEquals(actual, "10");
	}
	
	@Test
	void testGetStockSpecialQuals() {
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		
		String actual = stock.getSpecialQuals();
		
		assertEquals(actual, "flammable");
	}
	
	@Test
	void testGetStockName() {
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		
		String actual = stock.getName();
		
		assertEquals(actual, "Apple");
	}
	
	@Test
	void testGetStockCondition() {
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		
		String actual = stock.getCondition();
		
		assertEquals(actual, "Good");
	}
	
	@Test
	void testGetStockExpirationDate() {
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		
		String actual = stock.getExpirationDate();
		
		assertEquals(actual, "12/25/2025");
	}
	
	@Test
	void testGetStockToString() {
		Stock stock = new Stock("10", "flammable", "Apple", "Good", "12/25/2025");
		
		String actual = stock.toString();
		
		assertEquals(actual, "Apple, Good");
	}

}
