package com.ashrit.booking;

public class FlightBooking extends Booking {

	private FlightRecords flightRecords;
	
	
	
	public FlightBooking() {
		super();
		// TODO Auto-generated constructor stub
		flightRecords = new FlightRecords();
	}



	@Override
	public void calculateTotalCost() {
		// TODO Auto-generated method stub
		double flightCost = flightRecords.getFlightprice(this.getDestination());
		int passengerCount = this.getNumPassengers();
		setTotalCost(passengerCount * flightCost);
		
	}
	
	

	
	
	
}
