package com.ashrit.FlightBookingSystem;

public abstract class Booking {
  private String bookingID;
  private String firstName;
  private String lastName;
  private String emailID;
  private String phoneNumber;
  private String origin;
  private String destination;
  private int totalCost;
  private String flightNumber;
  public static int objCounter;
  
  

public Booking() {
	super();
}

public Booking(String bookingID, String firstName, String lastName, String emailID, String phoneNumber, String origin,
		String destination, int totalCost, String flightNumber) {
	super();
	this.bookingID = bookingID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailID = emailID;
	this.phoneNumber = phoneNumber;
	this.origin = origin;
	this.destination = destination;
	this.totalCost = totalCost;
	this.flightNumber = flightNumber;
}

public String getBookingID() {
	return bookingID;
}

public void setBookingID(String bookingID) {
	this.bookingID = bookingID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getOrigin() {
	return origin;
}

public void setOrigin(String origin) {
	this.origin = origin;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public int getTotalCost() {
	return totalCost;
}

public void setTotalCost(int totalCost) {
	this.totalCost = totalCost;
}

public String getFlightNumber() {
	return flightNumber;
}

public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
}
  

@Override
public String toString() {
	return "Booking [bookingID=" + bookingID + ", firstName=" + firstName + ", lastName=" + lastName + ", emailID="
			+ emailID + ", phoneNumber=" + phoneNumber + ", origin=" + origin + ", destination=" + destination
			+ ", totalCost=" + totalCost + ", flightNumber=" + flightNumber + "]";
}


}
