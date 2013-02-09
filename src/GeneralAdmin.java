

import java.util.Collection;
import java.util.Iterator;
public class GeneralAdmin {

	public void publishOffers(){
	
	}

	public void viewStatistics(){
	
	}

	/**
 *
 */
private Collection<Room> room;

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

/**
 *
 */
private Collection<Room> room1 = new java.util.ArrayList();

/**
 * Getter of the property <tt>room1</tt>
 *
 * @return Returns the room1.
 * 
 */
public Collection<Room> getRoom1()
{
	return room1;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Room> room1Iterator(){
	return room1.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isRoom1Empty(){
	return room1.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsRoom1(Room room1){
	return this.room1.contains(room1);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllRoom1(Collection<Room> room1){
	return this.room1.containsAll(room1);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int room1Size(){
	return room1.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Room[] room1ToArray(){
	return room1.toArray(new Room[room1.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addRoom1(Room room1){
	return this.room1.add(room1);
}

/**
 * Setter of the property <tt>room1</tt>
 *
 * @param room1 the room1 to set.
 *
 */
public void setRoom1(Collection<Room> room1){
	this.room1 = room1;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeRoom1(Room room1){
	return this.room1.remove(room1);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearRoom1(){
	this.room1.clear();
}

}

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
// * Setter of the property <tt>room</tt>
// *
// * @param room The room to set.
// *
// */
//public void setRoom(Room room ){
//	this.room = room;
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
// * Setter of the property <tt>room</tt>
// *
// * @param room the room to set.
// *
// */
//public void setRoom(Collection<Room> room){
//	this.room = room;
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
// * Removes all of the elements from this collection (optional operation).
// *
// * @see	java.util.Collection#clear()
// *
// */
//public void clearRoom(){
//	this.room.clear();
//}