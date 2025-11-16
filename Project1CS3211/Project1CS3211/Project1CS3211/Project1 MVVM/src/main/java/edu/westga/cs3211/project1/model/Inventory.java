package edu.westga.cs3211.project1.model;

import java.util.ArrayList;

/** this class will hold the information for the Inventory
 * @author Kyron Joseph
 * @version 11/9/2025
 */
public class Inventory {
	
    private ArrayList<Stock> comparment1 = new ArrayList<Stock>();
	private ArrayList<Stock> compartment2 = new ArrayList<Stock>();
	
	/**the constructor for Inventory class
	 */
	public Inventory() {

	}
	
	/**
	 * calculates if there is free space in the inventory
	 * @return returns false
	 */
	public boolean hasFreeSpace() {
		return !(this.comparment1.size() >= 10 || this.compartment2.size() >= 10);
		
	}

	/** this will add stock to specific compartment
	 * @param stock takes a param of stock
	 */
	public void addStockToCompartment1(Stock stock) {
		this.comparment1.add(stock);
	}
	
	/** this will add stock to specific compartment
	 * @param stock takes a param of stock
	 */
	public void addStockToCompartment2(Stock stock) {
		this.compartment2.add(stock);
	}
	
}
