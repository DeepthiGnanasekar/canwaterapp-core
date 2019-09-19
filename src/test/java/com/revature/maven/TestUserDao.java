package com.revature.maven;
import org.junit.Test;
import exception.DBException;
import validator.UserValidator;



public class TestUserDao {
	UserValidator validator = new UserValidator();
	@Test
	public void testfindByNullName() throws DBException {
		String name="";
		try {
		    validator.validateName(name);
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}	
	}
	
	@Test
	public void testfindByInvalidName() throws DBException {
		String name="sdfg";
		try {
		    validator.validateName(name);
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}	
	}
		
		@Test
		public void testfindByValidName() throws DBException {
			String name="Deeps";
			try {
			    validator.validateName(name);
			} catch (Exception e) {
			    System.out.println(e.getMessage());
			}	
			    
	}

}
