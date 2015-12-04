import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program breaks down NYPD's motor collision data based on categories.
 * This class provides the main method.
 * 
 * @author Elif Koc
 * @version Sep 16, 2015
 */

public class CollisionInfo

{

	// Index of terms in the CSV file.
	private static final int ZIP_CODE = 3;
	private static final int PEOPLE_INJURED = 8;
	private static final int PEOPLE_KILLED = 9;
	private static final int CYCLISTS_INJURED = 12;
	private static final int CYCLISTS_KILLED = 13;
	private static final int FACTOR1 = 16;
	private static final int FACTOR2 = 17;
	private static final int VEHICLE1 = 19;
	private static final int VEHICLE2 = 20;
	
	// The two ArrayList classes this program uses.
	private static CollisionList collisions = new CollisionList();
	private static ZipCodeList zipcodes = new ZipCodeList();

	/**
	 * @param command line arguments; this should be the name of the input file.
	 * @throws FileNotFoundException;
	 *             if the file to be opened becomes inaccessible between testing
	 *             for its existence and opening it.
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		///////////////////////
		//OPEN THE INPUT FILE//
		///////////////////////

		// Make sure there is only 1 command line argument.
		if (args.length != 1) 
		{
			// Print a helpful error message.
			System.err.printf("Error: Incorrect usage. %n");
			System.err.printf("Proper Usage: java CollisionInfo inputFile.xxx %n");
			System.exit(1);
		}

		// Create a File object from the argument (input file).
		File collisionFile = new File(args[0]);

		// Make sure the file exists and can be read.
		if (!collisionFile.exists() || !collisionFile.canRead())
		{
			System.err.printf("Error: Cannot read %s. Please enter a different file. %n", args[0]);
			System.exit(1);
		}

		// Open the input file for reading.
		Scanner inputCollision = new Scanner(collisionFile);

		///////////////////////
		//READ THE INPUT FILE//
		///////////////////////

		// Skip the header values.
		inputCollision.nextLine();

		while (inputCollision.hasNext()) 
		{
			// Read the next line from the file.
			String line = inputCollision.nextLine();

			// Split each line at the comma.
			String[] terms = line.split(",");

			// If the line has more/less than the proper amount of commas,
			// ignore the line.
			if (terms.length != 21)
				continue;

			// Create objects of the terms.
			Collision collision = new Collision(Integer.parseInt(terms[ZIP_CODE]),
					Integer.parseInt(terms[PEOPLE_INJURED]), Integer.parseInt(terms[PEOPLE_KILLED]),
					Integer.parseInt(terms[CYCLISTS_INJURED]), Integer.parseInt(terms[CYCLISTS_KILLED]), terms[FACTOR1],
					terms[FACTOR2], terms[VEHICLE1], terms[VEHICLE2]);

			// Add the collisions to our CollisionList.
			collisions.addToCollisionList(collision);

			// Create object of just the zipcodes.
			ZipCode zipcode = new ZipCode(Integer.parseInt(terms[ZIP_CODE]));

			// Add all unique zipcodes to our ZipCodeList.
			if (!(zipcodes.contains(zipcode))) 
			{
				zipcodes.addToZipCodeList(zipcode);
			}
		}

		// Close the input scanner.
		inputCollision.close();

		// Set the rest of the data fields for ZipCode
		for (int i = 0; i < zipcodes.getZipCodeListSize(); i++) 
		{
			ZipCode variableZipCode = zipcodes.getSingleZipCode(i);
			variableZipCode.setCollisions(collisions.collisionsPerZip(variableZipCode));
			variableZipCode.setNumPersonsInjuredandKilled(
					collisions.PersonsKilledPerZip(variableZipCode) + collisions.PersonsInjuredPerZip(variableZipCode));
			variableZipCode.setNumCyclistsInjuredandKilled(collisions.CyclistsKilledPerZip(variableZipCode)
					+ collisions.CyclistsInjuredPerZip(variableZipCode));
		}

		//////////////////////////
		//WRITE THE OUTPUT FILE///
		//////////////////////////

		// This is our desired output filename (input with extension changed to
		// .out)
		String outputName = args[0].substring(0, args[0].lastIndexOf(".")) + ".out";

		// Create an output file (this will override the file if the same named
		// one is present)
		File outputCollision = new File(outputName);

		// otherwise, open the file for writing using the PrintWriter object
		PrintWriter answers = new PrintWriter(outputCollision);

		////////////////////////////////////////////////////////////////////////
		//TASK 1: Find the 3 zipcodes with the highest number of///////////////
		// collisions.//////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		// Sort the zipcodes so that the highest collisions appear first.
		zipcodes.sortListByMostCollisions();
		
		answers.printf("ZIP codes with the largest number of collisions:\n\n");
		
		//Add the answers to the .out file.
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(0).getZipCode(),
				zipcodes.getSingleZipCode(0).getCollisions() + " collisions");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(1).getZipCode(),
				zipcodes.getSingleZipCode(1).getCollisions() + " collisions");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(2).getZipCode(),
				zipcodes.getSingleZipCode(2).getCollisions() + " collisions");
		answers.println();

		////////////////////////////////////////////////////////////////////////
		//TASK 2: Find the 3 zipcodes with the fewest number of ////////////////
		//collisions.///////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		// Sort the zipcodes so that the fewest collisions appear first.
		zipcodes.sortListByLeastCollisions();

		answers.printf("ZIP codes with the fewest number of collisions:\n\n");

		//Add the answers to the .out file.
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(0).getZipCode(),
				zipcodes.getSingleZipCode(0).getCollisions() + " collisions");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(1).getZipCode(),
				zipcodes.getSingleZipCode(1).getCollisions() + " collisions");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(2).getZipCode(),
				zipcodes.getSingleZipCode(2).getCollisions() + " collisions");
		answers.println();

		/////////////////////////////////////////////////////////////////////
		// TASK 3: Find the zipcodes with the highest injuries/fatalities.///
		/////////////////////////////////////////////////////////////////////

		zipcodes.sortListByHarm();

		answers.printf("ZIP codes with most injuries/fatalities:\n\n");

		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(0).getZipCode(),
				zipcodes.getSingleZipCode(0).getNumPersonsInjuredandKilled() + " injuries and fatalities");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(1).getZipCode(),
				zipcodes.getSingleZipCode(1).getNumPersonsInjuredandKilled() + " injuries and fatalities");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(2).getZipCode(),
				zipcodes.getSingleZipCode(2).getNumPersonsInjuredandKilled() + " injuries and fatalities");
		answers.println();

		/////////////////////////////////////////////////////////////////////////////
		// TASK 4: Find the zipcodes with the highest cyclist ///////////////////////
		// injuries/fatalities.//////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////

		zipcodes.sortListByCyclists();

		answers.printf("ZIP codes with most cyclist injuries/fatalities:\n\n");

		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(0).getZipCode(),
				zipcodes.getSingleZipCode(0).getNumCyclistsInjuredandKilled() + " cyclist injuries and fatalities");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(1).getZipCode(),
				zipcodes.getSingleZipCode(1).getNumCyclistsInjuredandKilled() + " cyclist injuries and fatalities");
		answers.printf("%-30.30s  %-30.30s%n", zipcodes.getSingleZipCode(2).getZipCode(),
				zipcodes.getSingleZipCode(2).getNumCyclistsInjuredandKilled() + " cyclist injuries and fatalities");
		answers.println();

		///////////////////////////////////////////////////////////////////////
		//TASK 5: Find the distribution of vehicles involved in collisions.////
		///////////////////////////////////////////////////////////////////////

		answers.printf("Percentage of collisions involving certain vehicle types:\n\n");
		
		//Search the collision lists for the needed keywords.
		int numOfTaxis = collisions.findVehicle(collisions, "TAXI");
		int numOfBuses = collisions.findVehicle(collisions, "BUS");
		int numOfBicycles = collisions.findVehicle(collisions, "BICYCLE");
		int numOfFireTrucks = collisions.findVehicle(collisions, "FIRE TRUCK");
		int numOfAmbulances = collisions.findVehicle(collisions, "AMBULANCE");
		int numOfCollisions = collisions.getCollisionListSize();

		answers.printf("%-30.30s  %d%%", "Taxis", (numOfTaxis * 100 / numOfCollisions));
		answers.println();
		answers.printf("%-30.30s  %d%%", "Buses", (numOfBuses * 100 / numOfCollisions));
		answers.println();
		answers.printf("%-30.30s  %d%%", "Bicycles", (numOfBicycles * 100 / numOfCollisions));
		answers.println();
		answers.printf("%-30.30s  %d%%", "Fire Trucks", (numOfFireTrucks * 100 / numOfCollisions));
		answers.println();
		answers.printf("%-30.30s  %d%%", "Ambulances", (numOfAmbulances * 100 / numOfCollisions));
		answers.println();
		answers.println();

		/////////////////////////////////////////////////////////////////////
		//TASK 6: Find the percentage of driver-related collision causes.////
		/////////////////////////////////////////////////////////////////////

		answers.printf("Percentage of driver-related collision causes \n\n");
		
		//Search the collision lists for the needed keywords.
		int numOfDrugs = collisions.findFactor(collisions, "Prescription Medication");
		int numOfTired = collisions.findFactor(collisions, "Fatigued/Drowsy");
		int numOfInattentive = collisions.findFactor(collisions, "Driver Inattention/Distraction");
		int numOfInexperience = collisions.findFactor(collisions, "Driver Inexperience");

		answers.printf("%-30.30s  %d%%", "Prescription Medication", (numOfDrugs * 100 / numOfCollisions));
		answers.println();
		answers.printf("%-30.30s  %d%%", "Fatigued/Drowsy", (numOfTired * 100 / numOfCollisions));
		answers.println();
		answers.printf("%-30.30s  %d%%", "Driver Inattention/Distraction",
				(numOfInattentive * 100 / numOfCollisions));
		answers.println();
		answers.printf("%-30.30s %d%%", "Inexperience", (numOfInexperience * 100 / numOfCollisions));
		answers.println();

		// Close the output file.
		answers.close();
	}

}
