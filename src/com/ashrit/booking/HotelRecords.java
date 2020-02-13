package com.ashrit.booking;


public class HotelRecords {


	private final String[] hotelNames = { "Hilton", "Hyatt", "Westin" };

	// Fixed array storing fares per person in the FlightRecords

	private final double[] hotelCostPerNight = { 120, 80, 150 };

	private int getHotelIndex(String hotelName) {

		switch (hotelName.toUpperCase()) {
		case "HILTON":
			return 0;
		case "HYATT":
			return 1;
		case "WESTIN":
			return 2;

		default:
			return -1;
		}
	}
	
	public String[] getHotelNames() {
		return hotelNames;
	}

	public double[] getHotelCostPerNight() {
		return hotelCostPerNight;
	}

	public double getHotelCostPerNight(String hotelName) {

		int index = getHotelIndex(hotelName);

		if (index == -1)
			return -1;
		else
			return hotelCostPerNight[index];

	}

	public void displayHotelOptions() 
	{
		for (int i = 0; i < hotelNames.length; i++)
		{
			System.out.println(hotelNames[i] + "   " + hotelCostPerNight[i] + " per night");	
		}
		
	}

}
