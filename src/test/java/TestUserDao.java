
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
		@Test
		public void testfindByNullPassword() throws DBException {
			String name="";
			String password="";
			try {
			    validator.validCheck(name,password);
			} catch (Exception e) {
			    System.out.println(e.getMessage());
			}	
		}
		
		@Test
		public void testfindByInvalidPassword() throws DBException {
			String name="sdfg";
			String password="dfg";
			try {
			    validator.validCheck(name,password);
			} catch (Exception e) {
			    System.out.println(e.getMessage());
			}	
		}
			
			@Test
			public void testfindByValidPassword() throws DBException {
				String name="Deeps";
				String password="Deep@123";
				try {
				    validator.validCheck(name,password);
				} catch (Exception e) {
				    System.out.println(e.getMessage());
				}	
				    
		}

}
