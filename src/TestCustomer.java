import static org.junit.Assert.*;
import junit.framework.TestCase;
import java.util.*;
import org.junit.Test;

public class TestCustomer {
	
	Customer customer=new Customer();
	

	public void setUp() throws Exception {
		customer.setName("Haris");
		customer.setEmail("koukou@gmail.com");
		customer.setPhoneNumber(69323456);
		
	}

	@Test
	public void testGetName() {
		assertNotNull(customer.getName());
		}



	@Test
	public void testGetEmail() {
		assertNotNull(customer.getEmail());
	}



	@Test
	public void testGetPhoneNumber() {
		assertNotNull(customer.getPhoneNumber());
	}



}
