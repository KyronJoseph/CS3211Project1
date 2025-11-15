package edu.westga.cs3211.project1.model;

/**this class will hold the information of the user
 * @author Kyron Joseph
 * @version 11/9/2025
 */
public class User {
	
	private String name;
	private String pwd;
	private String role;
	
	/**
	 * this is the constructor for the user class
	 * @param name this is the name
	 * @param pwd this is the password
	 * @param role this is the role
	 */
	public User(String name, String pwd, String role) {
		this.name = name;
		this.pwd = pwd;
		this.role = role;
		
		if (name.isEmpty()) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		
		if (pwd.isEmpty()) {
			throw new IllegalArgumentException("pwd cannot be empty");
		}
		
		if (role.isEmpty()) {
			throw new IllegalArgumentException("role cannot be empty");
		}
		
	}
	
	/**this method will the get the name of user
	 * 
	 * @return returns name
	 */
	public String getName() {
		return this.name;
	}
	
	/**this method will the get the password of user
	 * 
	 * @return returns pwd
	 */
	public String getPwd() {
		return this.pwd;
	}

	/**this method will get the role of the user
	 * 
	 * @return returns role
	 */
	public String getRole() {
		return this.role;
	}
	
}
