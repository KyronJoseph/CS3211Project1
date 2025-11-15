package edu.westga.cs3211.project1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project1.model.Authenticator;

class TestAuthenticator {

	@Test
	void testIsUserACrewmate() {
		Authenticator auth = new Authenticator();
		
		boolean actual = auth.isCrewmate("Wylder", "Scavenger");
		
		assertTrue(actual);
	}
	
	@Test
	void testUserIsNotACrewmate() {
		Authenticator auth = new Authenticator();
		
		boolean actual = auth.isCrewmate("Raider", "Scavenger");
		
		assertFalse(actual);
	}
	
	@Test
	void testIsUserAQuarterMaster() {
		Authenticator auth = new Authenticator();
		
		boolean actual = auth.isQuarterMaster("Duchess", "Leader");
		
		assertTrue(actual);
	}
	
	@Test
	void testIsNotAQuarterMaster() {
		Authenticator auth = new Authenticator();
		
		boolean actual = auth.isQuarterMaster("Wylder", "Scavenger");
		
		assertFalse(actual);
	}
	

}
