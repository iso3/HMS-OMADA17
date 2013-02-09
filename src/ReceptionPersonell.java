

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
public class ReceptionPersonell {

	public void checkIn(Room room){
	
	}

	public void checkOut(Room room){
	
	}

	public void paymentConfirmarion(){
	
	}

	public void expensesRegister(){
	
	}

	public void billPrint(){
	
	}

	public boolean roomAvailability(Room room){
		return false;
	
	}

	public void bookingDate(java.util.Date date){
		
		
		
	
	}

	public void sendReminderEmail(){
	
	}

	/**
 *
 */
private Collection<Customer> customer = new java.util.ArrayList();

/**
 * Getter of the property <tt>customer</tt>
 *
 * @return Returns the customer.
 * 
 */
public Collection<Customer> getCustomer()
{
	return customer;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Customer> customerIterator(){
	return customer.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isCustomerEmpty(){
	return customer.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsCustomer(Customer customer){
	return this.customer.contains(customer);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllCustomer(Collection<Customer> customer){
	return this.customer.containsAll(customer);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int customerSize(){
	return customer.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Customer[] customerToArray(){
	return customer.toArray(new Customer[customer.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addCustomer(Customer customer){
	return this.customer.add(customer);
}

/**
 * Setter of the property <tt>customer</tt>
 *
 * @param customer the customer to set.
 *
 */
public void setCustomer(Collection<Customer> customer){
	this.customer = customer;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeCustomer(Customer customer){
	return this.customer.remove(customer);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearCustomer(){
	this.customer.clear();
}

/**
 *
 */
private Collection<Room> room = new java.util.ArrayList();

/**
 * Getter of the property <tt>room</tt>
 *
 * @return Returns the room.
 * 
 */
public Collection<Room> getRoom()
{
	return room;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Room> roomIterator(){
	return room.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isRoomEmpty(){
	return room.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsRoom(Room room){
	return this.room.contains(room);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllRoom(Collection<Room> room){
	return this.room.containsAll(room);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int roomSize(){
	return room.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Room[] roomToArray(){
	return room.toArray(new Room[room.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addRoom(Room room){
	return this.room.add(room);
}

/**
 * Setter of the property <tt>room</tt>
 *
 * @param room the room to set.
 *
 */
public void setRoom(Collection<Room> room){
	this.room = room;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeRoom(Room room){
	return this.room.remove(room);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearRoom(){
	this.room.clear();
}

}

///**
// * Setter of the property <tt>room</tt>
// *
// * @param room The room to set.
// *
// */
//public void setRoom(Room room ){
//	this.room = room;
//}
///**
// * Getter of the property <tt>room</tt>
// *
// * @return Returns the room.
// * 
// */
//public Room getRoom()
//{
//	return room;
//}
///**
// * Returns <tt>true</tt> if this collection contains all of the elements
// * in the specified collection.
// *
// * @param elements collection to be checked for containment in this collection.
// * @see	java.util.Collection#containsAll(Collection)
// *
// */
//public boolean containsAllRoom(Collection<Room> room){
//	return this.room.containsAll(room);
//}
///**
// * Returns <tt>true</tt> if this collection contains the specified element. 
// *
// * @param element whose presence in this collection is to be tested.
// * @see	java.util.Collection#contains(Object)
// *
// */
//public boolean containsRoom(Room room){
//	return this.room.contains(room);
//}
///**
// * Returns all elements of this collection in an array.
// *
// * @return an array containing all of the elements in this collection
// * @see	java.util.Collection#toArray()
// *
// */
//public Room[] roomToArray(){
//	return room.toArray(new Room[room.size()]);
//}
///**
// * Returns an iterator over the elements in this collection. 
// *
// * @return an <tt>Iterator</tt> over the elements in this collection
// * @see	java.util.Collection#iterator()
// * 
// */
//public Iterator<Room> roomIterator(){
//	return room.iterator();
//}
///**
// * Returns <tt>true</tt> if this collection contains no elements.
// *
// * @return <tt>true</tt> if this collection contains no elements
// * @see	java.util.Collection#isEmpty()
// *
// */
//public boolean isRoomEmpty(){
//	return room.isEmpty();
//}
///**
// * Removes all of the elements from this collection (optional operation).
// *
// * @see	java.util.Collection#clear()
// *
// */
//public void clearRoom(){
//	this.room.clear();
//}
///**
// * Removes a single instance of the specified element from this
// * collection, if it is present (optional operation).
// *
// * @param element to be removed from this collection, if present.
// * @see	java.util.Collection#add(Object)
// *
// */
//public boolean removeRoom(Room room){
//	return this.room.remove(room);
//}
///**
// * Returns the number of elements in this collection.
// *
// * @return the number of elements in this collection
// * @see	java.util.Collection#size()
// *
// */
//public int roomSize(){
//	return room.size();
//}
///**
// * Setter of the property <tt>room</tt>
// *
// * @param room the room to set.
// *
// */
//public void setRoom(Collection<Room> room){
//	this.room = room;
//}
///**
// * Getter of the property <tt>room</tt>
// *
// * @return Returns the room.
// * 
// */
//public Collection<Room> getRoom()
//{
//	return room;
//}
///**
// * Ensures that this collection contains the specified element (optional
// * operation). 
// *
// * @param element whose presence in this collection is to be ensured.
// * @see	java.util.Collection#add(Object)
// *
// */
//public boolean addRoom(Room room){
//	return this.room.add(room);
//}