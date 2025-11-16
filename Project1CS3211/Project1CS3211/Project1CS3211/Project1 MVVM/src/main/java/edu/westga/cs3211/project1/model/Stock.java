package edu.westga.cs3211.project1.model;

/** this class will hold information about the stock
 * @author Kyron Joseph
 * @version 11/9/2025
 */
public class Stock {
	
	private String size;
	private String specialQuals;
	private String name;
	private String condition;
	private String expirationDate;
	
	/**
	 * this is the constructor for the Stock class
	 * @param size takes a param of size
	 * @param specialQuals takes a param of specialQuals
	 * @param name takes a param of name
	 * @param condition takes a param of condition 
	 * @param expirationDate takes of param of expirationDate
	 */
	public Stock(String size, String specialQuals, String name, String condition, String expirationDate) {
		
		this.size = size;
		this.specialQuals = specialQuals;
		this.name = name;
		this.condition = condition;
		this.expirationDate = expirationDate;
		
	}
	
	/**
	 * this method will get the size
	 * @return returns size
	 */
	public String getSize() {
		return this.size;
	}
	
	/**
	 * this method will get the specialQuals
	 * @return returns specialQuals
	 */
	public String getSpecialQuals() {
		return this.specialQuals;
	}
	
	/**
	 * this method will get the name 
	 * @return returns name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * this method will get the condition 
	 * @return returns condition 
	 */
	public String getCondition() {
		return this.condition;
	}
	
	/**
	 * this method will get the expiration Date
	 * @return returns expiration Date
	 */
	public String getExpirationDate() {
		return this.expirationDate;
	}
	
	/**
	 * this method will return a to String representation of stock
	 * @return returns a string of item
	 */
	public String toString() {
		return this.name + ", " + this.condition;
	}

}
