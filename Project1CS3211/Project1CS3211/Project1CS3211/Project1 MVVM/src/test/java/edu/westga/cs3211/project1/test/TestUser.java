package edu.westga.cs3211.project1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project1.model.User;

class TestUser {

	@Test
	void testGetUserName() {
		User user = new User("Duchess", "Leader", "QuarterMaster");
		
		String actual = user.getName();
		
		assertEquals(actual, "Duchess");
		
	}
	
	@Test
	void testGetUserPassword() {
		User user = new User("Duchess", "Leader", "QuarterMaster");
		
		String actual = user.getPwd();
		
		assertEquals(actual, "Leader");
	}
	
	@Test
	void testGetUserRole() {
		User user = new User("Duchess", "Leader", "QuarterMaster");
		
		String actual = user.getRole();
		
		assertEquals(actual, "QuarterMaster");
	}
	
	@Test
	void testUserNameisEmpty() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			 new User("", "Leader", "QuarterMaster");;
		});
	}
	
	@Test
	void testUserPassswordisEmpty() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			 new User("Duchess", "", "QuarterMaster");;
		});
	}
	
	@Test
	void testUserRoleisEmpty() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			 new User("Duchess", "Leader", "");;
		});
	}

}
