# ProblemSet3

package edu.monmouth.problemSet3;

import edu.monmouth.campusvehicle.CampusVehicle;
import edu.monmouth.campusvehicle.Color; 

public class ProblemSet3 {

	public static void main(String[] args) {
		
		// Test 1: Default constructor 
		
		System.out.println("TEST 1 - Default constructor");
		
		CampusVehicle vehicle1 = new CampusVehicle();
		
		System.out.println("ID: " + vehicle1.getId());
		System.out.println("Location: " + vehicle1.getLocation());
		System.out.println("Available: " + vehicle1.isAvailable());
		System.out.println("Color: " + vehicle1.getColor());
		
		System.out.println();
		
		// Test 2: Set all four attributes 
		System.out.println("TEST 2 - Four mutators");
		
		vehicle1.setId("MU123456");
		vehicle1.setLocation("LIBRARY");
		vehicle1.setAvailable(true);
		vehicle1.setColor(Color.GREEN);
		
		System.out.println("ID: " + vehicle1.getId());
		System.out.println("Location: " + vehicle1.getLocation());
		System.out.println("Available: " + vehicle1.isAvailable());
		System.out.println("Color: " + vehicle1.getColor());
		
		
		System.out.println();
		
		// Test 3: Four-parameter constructor
		System.out.println("TEST 3 - Four-parameter constructor"); 
		
		CampusVehicle vehicle2 = new CampusVehicle("MU987654", "PARKING LOT", true, Color.RED);
		
		System.out.println("ID: " + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Available: " + vehicle2.isAvailable());
		System.out.println("Color: " + vehicle2.getColor());
		
		System.out.println();
		
		// Test 4: Change vehicle color 
		
		System.out.println("TEST 4 - Change vehicle color");
		
		vehicle2.setColor(Color.BLUE);
		
		System.out.println("ID: " + vehicle2.getId()); 
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Available: " + vehicle2.isAvailable());
		System.out.println("Color: " + vehicle2.getColor());
		
		System.out.println();
		
		// Test 5: Three-parameter constructor
		
		System.out.println("TEST 5 - Three-parameter constructor");
		
		CampusVehicle vehicle3 = new CampusVehicle("MU112233", "Spruce Hall", true);
		
		System.out.println("ID: " + vehicle3.getId());
		System.out.println("Location: " + vehicle3.getLocation());
		System.out.println("Available: " + vehicle3.isAvailable());
		System.out.println("Color: " + vehicle3.getColor());
		
		System.out.println();
		
		// Test checkout and returnVehicle
		
		vehicle3.checkOut();
		
		System.out.println("After checkOut(): " + vehicle3.isAvailable());
		
		vehicle3.returnVehicle();
		
		System.out.println("After returnVehicle(): " + vehicle3.isAvailable());
		System.out.println();
		
		// Test 6:Minimum valid ID length 
		System.out.println("TEST 6 - Minimum valid ID");
		
		CampusVehicle vehicle4 = new CampusVehicle("MU1234", "laurel Hall", false, Color.WHITE);
		
		System.out.println("ID: " + vehicle4.getId());
		System.out.println("Location: " + vehicle4.getLocation());
		System.out.println("Available: " + vehicle4.isAvailable());
		System.out.println("Color: " + vehicle4.getColor());
		
		System.out.println();
		
		// Test 7: Maximum valid ID length 
		System.out.println("TEST 7 - Maximum valid ID");
		
		CampusVehicle vehicle5 = new CampusVehicle("MU1234567890123456", "University Bluffs", true, Color.YELLOW);
		
		System.out.println("ID: " + vehicle5.getId());
		System.out.println("Location: " + vehicle5.getLocation());
		System.out.println("Available: " + vehicle5.isAvailable());
		System.out.println("Color: " + vehicle5.getColor());
		
		System.out.println();
		
		// Test 8: Invalid ID and location
		
		System.out.println("TEST 8 - Invalid attributes");
		
		CampusVehicle vehicle6 = new CampusVehicle("MU123", "GYM", true, Color.BLACK);
		
		System.out.println("ID: " + vehicle6.getId());
		System.out.println("Location: " + vehicle6.getLocation());
		System.out.println("Available: " + vehicle6.isAvailable());
		System.out.println("Color: " + vehicle6.getColor());
		
		System.out.println();
		
		// Test 9: ID longer than 18 characters 
		System.out.println("TEST 9 - ID too long"); 
		
		vehicle5.setId("MU12345678901234567");
		
		System.out.println("ID: " + vehicle5.getId());
		System.out.println("Location: " + vehicle5.getLocation());
		System.out.println("Available: " + vehicle5.isAvailable());
		System.out.println("Color: " + vehicle5.getColor());
		
		System.out.println();
		
		// Test 10: Null attributes 
		System.out.println("TEST 10 - Null attributes");
		
		CampusVehicle vehicle7 = new CampusVehicle(null, null, false, null);
		
		System.out.println("ID: " + vehicle7.getId());
		System.out.println("Location: " + vehicle7.getLocation());
		System.out.println("Available: " + vehicle7.isAvailable());
		System.out.println("Color: " + vehicle7.getColor());
		
		System.out.println();
		
		// Test 11: Invalid ID prefix 
		System.out.println("TEST 11 - Invalid ID prefix");
		
		vehicle7.setId("AB123456");
		
		System.out.println("ID: " + vehicle7.getId());
	}

}
