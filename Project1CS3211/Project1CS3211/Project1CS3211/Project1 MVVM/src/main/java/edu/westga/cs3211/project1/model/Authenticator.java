package edu.westga.cs3211.project1.model;

/** this class will hold the authentication for user logging in
 * @author Kyron Joseph
 * @version 11/9/2025
 */
public class Authenticator {
	
	/** if the name is a specific type of name they are a crewmmate
	 * @param username takes a param username
	 * @param pwd takes a param password
	 * @return true is user a crewmate false if not
	 */
	public boolean isCrewmate(String username, String pwd) {
		return username.equals("Wylder") && pwd.equals("Scavenger");
	}
	
	/**
	 * if the name is a specific type of name they are a quatermaster
	 * @param username takes a param username
	 * @param pwd takes a param password
	 * @return returns true if user is a quartermaster false if not
	 */
	public boolean isQuarterMaster(String username, String pwd) {
		return username.equals("Duchess") && pwd.equals("Leader");
	}

}
