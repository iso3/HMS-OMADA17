import junit.framework.TestCase;
import java.util.*;

public class TestRoom extends TestCase {

	Room room=new Room();
	ReceptionPersonell reception=new ReceptionPersonell();
	
	protected void setUp() throws Exception {
		
		room.setRoomNumber(56);
		room.setRoomType("single");
		room.setRoomAvailability(true);
		
		super.setUp();
	}

	public void testGetRoomNumber() {
		assertNotNull(room.getRoomNumber());	}

	public void testGetRoomAvailability() {
		assertTrue(room.getRoomAvailability());
	}

	public void testGetRoomType() {
		assertNotNull(room.getRoomType());	}
	}



