package com.ashrit.booking;


import java.util.ArrayList;
import java.util.Date;

public abstract class Booking {

	private int bookingID;
	ArrayList<Passenger> passengers;
	private String origin;
	private String destination;
	private double totalCost;
	private String flightNumber;
	public static int objCounter = 1;
	private int numPassengers;
	private Date depDate;
	private static int invoiceCounter = 1001;
	private int invoiceNum;

	public Booking() {
		super();
		passengers = new ArrayList<Passenger>();
		objCounter++;
		invoiceCounter++;
		bookingID = objCounter;
		invoiceNum = invoiceCounter;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
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

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public static int getObjCounter() {
		return objCounter;
	}

	public static void setObjCounter(int objCounter) {
		Booking.objCounter = objCounter;
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public static int getInvoiceCounter() {
		return invoiceCounter;
	}

	public static void setInvoiceCounter(int invoiceCounter) {
		Booking.invoiceCounter = invoiceCounter;
	}

	public int getInvoiceNum() {
		return invoiceNum;
	}

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", passengers=" + passengers + ", origin=" + origin
				+ ", destination=" + destination + ", totalCost=" + totalCost + ", flightNumber=" + flightNumber
				+ ", numPassengers=" + numPassengers + ", depDate=" + depDate + ", invoiceNum=" + invoiceNum + "]";
	}

	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
   
	public void addPassenger(Passenger p) {
		passengers.add(p);
	}
	
	public abstract void calculateTotalCost();

}
