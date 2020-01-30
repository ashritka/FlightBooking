package com.ashrit.booking;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * Sample Menu driven program for Assignment 3: SP3-2019
 * 
 * Class BookingManagementSystem
 * 
 * Implements functionality for a basic Booking Management System where 
 * users interact with the system to make bookings, view invoice, itinerary, and 
 * update bookings 
 */

import java.util.Scanner;

public class BookingManagementSystem {

	private static FlightRecords fr = new FlightRecords();
	
	private static ArrayList<Booking> bookingList = new ArrayList<Booking>();
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		String selection;

		do {

			// display menu options
			System.out.println("   ***** Company XYZ Booking System *****");
			System.out.println("A. Booking a Flight");
			System.out.println("B. Booking for a Holiday");
			System.out.println("C. View Invoice");
			System.out.println("D. View Itinerary");
			System.out.println("E. View Bookings");
			System.out.println("F. Update Check-in Details");
			System.out.println("X. Exit the program");
			System.out.println();

			// prompt user to enter selection
			System.out.print("Enter selection: ");
			selection = sc.next();

			System.out.println();

			// validate selection input length
			if (selection.length() != 1) {
				System.out.println("Error - invalid selection!");
			} else {

				// process user's selection
				switch (selection.toUpperCase()) {

				case "A":
					bookAFlight();
					break;
				case "B":
					bookAHoliday();
					break;
				case "C":
					viewInvoice();
					break;
				case "D":
					viewItinerary();
					break;
				case "E":
					viewBookings();
					break;
				case "F":
					updateCheckinDate();
					break;

				case "X":
					System.out.println("Exiting the program...");
					break;

				default:
					System.out.println("Error - invalid selection!");
				}
			}
			System.out.println();

		} while (!selection.equalsIgnoreCase("X"));

	}

	private static Booking findABooking(String bId) {
		/*
	       * Optional - you can implement code to search for a booking and return it
	       * here (after which the relevant methods below can call this method when
	       * they need to locate a specific booking).
	       * 
	       * NOTE: It is also acceptable to implement (repeat) your search code inside each
	       *       of the methods below which need to locate a specific booking.
	       * 
	       */
		   return null;
	}

	private static void bookAFlight() {
		/*
	       * Implement application level code to facilitate booking for a flight here.
	       * 
	       * Note that the array in which the collection of Booking objects is being stored 
	       * needs to be declared. A Scanner reference called 'sc' have been declared at the 
	       * top of the class and you can refer to it here inside this method as required.
	       */
		
		Booking booking = new FlightBooking();
		
		System.out.println("Please enter the number of Passengers");
		int num = sc.nextInt();
		booking.setNumPassengers(num);
		
		for (int i = 0; i < num; i++) {
			
			System.out.println("Please enter firstname for passenger" + (i + 1));
			String fname = sc.next();
			
			System.out.println("Please enter last name for passenger" + (i + 1));
			String lname = sc.next();
			
			Passenger p = new Passenger(fname, lname);
			booking.addPassenger(p);
			
		}
		
		System.out.println("Please enter destination");
		String d = sc.next();
		
		if (fr.checkFlightDestination(d) == false) {
			System.out.println("We don't fly to that destination. Please select another destination");
			return;
		}
		
		booking.setDestination(d);
		String flightNum = fr.getFlightNumber(d);
	    booking.setFlightNumber(flightNum);
	    
	    System.out.println("Please enter departure date (mm/dd/yyyy)");
	    
	    String dateStr = sc.next();
	    Date depDate;
		try {
			depDate = new SimpleDateFormat("MM/dd/yyyy").parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter date in the correct format MM/dd/yyyy");
			return;
		}  
	   
	    booking.setDepDate(depDate);
	    
	    System.out.println("Booking completed with booking id = " + booking.getBookingID());
	    
	    
	    bookingList.add(booking);
	    

	}

	private static void bookAHoliday() {
	/*
	       * Implement application level code to facilitate booking for a Holiday here.
	       * 
	       * Note that the array in which the collection of Booking objects is being stored 
	       * needs to be declared. A Scanner reference called 'sc' have been declared at the 
	       * top of the class and you can refer to it here inside this method as required.
	       */	
	
	}

	private static void viewItinerary() {
		/*
	       * Implement application level code to facilitate viewing of Itinerary here.
	       * 
	       * Note that the array in which the collection of Booking objects is being stored 
	       * needs to be declared. A Scanner reference called 'sc' have been declared at the 
	       * top of the class and you can refer to it here inside this method as required.
	       */
		   
		   
	}

	private static void viewBookings() {
		
		/*
	       * Implement application level code to facilitate viewing of current bookings 
	       * in the system here.
		   *
	       * Note that the array in which the collection of Booking objects is being stored 
	       * needs to be declared. A Scanner reference called 'sc' have been declared at the 
	       * top of the class and you can refer to it here inside this method as required.
	       */
		   
		
		for (Booking b : bookingList) {
			System.out.println(b);
		}

	}

	
	
	
	
	
	
	
	private static void updateCheckinDate() {
		/*
	       * Implement application level code to facilitate check-in updates
		   * ( changing number of stay days) here.
	       * 
	       * Note that the array in which the collection of Booking objects is being stored 
	       * needs to be declared. A Scanner reference called 'sc' have been declared at the 
	       * top of the class and you can refer to it here inside this method as required.
	       */
		   

	}

	private static void viewInvoice() {
		/*
	       * Implement application level code to facilitate viewing of Invoice here.
	       * 
	       * Note that the array in which the collection of Booking objects is being stored 
	       * needs to be declared. A Scanner reference called 'sc' have been declared at the 
	       * top of the class and you can refer to it here inside this method as required.
	       */
		   

}
} 