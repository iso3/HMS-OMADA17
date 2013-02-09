

import java.util.Date;
public class Customer {

	/*
 * (non-javadoc)
 */
private String name;
 
/**
 * Getter of the property <tt>name</tt>
 *
 * @return Returns the name.
 * 
 */
public String getName()
{
	return name;
}

/**
 * Setter of the property <tt>name</tt>
 *
 * @param name The name to set.
 *
 */
public void setName(String name ){
	this.name = name;
}

/*
 * (non-javadoc)
 */
private Date bookingDate;
 
/**
 * Getter of the property <tt>bookingDate</tt>
 *
 * @return Returns the bookingDate.
 * 
 */
public Date getBookingDate()
{
	return bookingDate;
}

/**
 * Setter of the property <tt>bookingDate</tt>
 *
 * @param bookingDate The bookingDate to set.
 *
 */
public void setBookingDate(Date bookingDate ){
	this.bookingDate = bookingDate;
}

public void acceptReceipt(){

}

public void roomType(Room[] room){

}

public void bookingConfirmation(){

}

public void payForRoom(){

}

/*
 * (non-javadoc)
 */
private String email;
 
/**
 * Getter of the property <tt>email</tt>
 *
 * @return Returns the email.
 * 
 */
public String getEmail()
{
	return email;
}

/**
 * Setter of the property <tt>email</tt>
 *
 * @param email The email to set.
 *
 */
public void setEmail(String email ){
	this.email = email;
}

/*
 * (non-javadoc)
 */
private int phoneNumber;
 
/**
 * Getter of the property <tt>phoneNumber</tt>
 *
 * @return Returns the phoneNumber.
 * 
 */
public int getPhoneNumber()
{
	return phoneNumber;
}

/**
 * Setter of the property <tt>phoneNumber</tt>
 *
 * @param phoneNumber The phoneNumber to set.
 *
 */
public void setPhoneNumber(int phoneNumber ){
	this.phoneNumber = phoneNumber;
}

/*
 * (non-javadoc)
 */
private ReceptionPersonell receptionPersonell = new ReceptionPersonell();
 
/**
 * Getter of the property <tt>receptionPersonell</tt>
 *
 * @return Returns the receptionPersonell.
 * 
 */
public ReceptionPersonell getReceptionPersonell()
{
	return receptionPersonell;
}

/**
 * Setter of the property <tt>receptionPersonell</tt>
 *
 * @param receptionPersonell The receptionPersonell to set.
 *
 */
public void setReceptionPersonell(ReceptionPersonell receptionPersonell ){
	this.receptionPersonell = receptionPersonell;
}

}
