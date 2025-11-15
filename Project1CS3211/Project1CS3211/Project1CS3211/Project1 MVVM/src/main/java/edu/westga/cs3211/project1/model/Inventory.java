package edu.westga.cs3211.project1.model;

import java.util.ArrayList;

/** this class will hold the information for the Inventory
 * @author Kyron Joseph
 * @version 11/9/2025
 */
public class Inventory {
	
	ArrayList<Stock> comparment1 = new ArrayList<Stock>();
	ArrayList<Stock> compartment2 = new ArrayList<Stock>();
	
	
	/**
	 * the constructor for Inventory class
	 * @param compartments takes param of compartments
	 */
	public Inventory() {
		//this.compartments = compartments;
		//if (compartments.isEmpty()) {
		//	throw new IllegalArgumentException("cannot have 0 compartments");
		//}
		

	}
	
	/**
	 * calculates if there is free space in the inventory
	 * @return returns false
	 */
	public boolean hasFreeSpace() {
		return !(this.comparment1.size() >= 10 && this.compartment2.size() >= 10);
		
	}

	/** this will add stock to specific compartment
	 * @param stock takes a param of stock
	 */
	public void addStock(Stock stock) {
		this.comparment1.add(stock);
		this.compartment2.add(stock);
	}
	
}
