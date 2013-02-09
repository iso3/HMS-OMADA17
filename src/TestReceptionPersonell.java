import static org.junit.Assert.*;
import junit.framework.TestCase;
import java.util.*;


import org.junit.Test;


public class TestReceptionPersonell extends TestCase {

	
	Customer customer=new Customer();
	Room room=new Room();
	ReceptionPersonell reception=new ReceptionPersonell();
	
	protected void setUp() throws Exception {
		room.setRoomNumber(112);
		room.setRoomType("single");
		customer.setName("Mhtsos");
		
		super.setUp();
	}

	
	public void testGetRoom() {
		assertNotNull(reception.getRoom());
	}

	@Test
	public void testGetCustomer() {
		assertNotNull(reception.getCustomer());
	}
	


	public void testCheckIn() {
		assertTrue(reception.roomAvailability(room));
	}
	
	public void testCheckOut() {
		assertFalse(reception.roomAvailability(room));
	}
	
	public void testAddRoom() {
		Room room2=new Room();
		room2.setRoomNumber(18);
		assertTrue(reception.addRoom(room2));
			
	
	}
	
	
	@Test
	public void testIsCustomerEmpty() {
		assertFalse(reception.isCustomerEmpty());	
	}


	@Test
	public void testIsRoomEmpty() {
		assertFalse(reception.isRoomEmpty());	
	}

	@Test
	public void testRemoveRoom() {
		assertTrue(reception.removeRoom(room));	
		}

	@Test
	public void testClearRoom() {
		reception.clearRoom();
	}
}
