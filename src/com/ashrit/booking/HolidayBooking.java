package com.ashrit.booking;

import java.util.Date;

import com.ashrit.booking.FlightRecords;

public class HolidayBooking extends Booking {

	String hotelName;
	int numNights;
	Date checkinDate;
	FlightRecords flightRecords;
	HotelRecords hotelRecords;

	public HolidayBooking() {
		// TODO Auto-generated constructor stub
		super();
		flightRecords = new FlightRecords();
		hotelRecords = new HotelRecords();
		
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumNights() {
		return numNights;
	}

	public void setNumNights(int numNights) {
		this.numNights = numNights;
	}

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	@Override
	public void calculateTotalCost() {
		// TODO Auto-generated method stub
		double flightCostPerPerson = flightRecords.getFlightprice(this.getDestination());
		int passengerCount = this.getNumPassengers();
		double totalFlightCost = passengerCount * flightCostPerPerson;
		
		double hotelCostperNight = hotelRecords.getHotelCostPerNight(hotelName);
		double totalHotelCost = numNights * hotelCostperNight;
		
		
		setTotalCost(totalFlightCost + totalHotelCost);

	}

}
