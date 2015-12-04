/**
 * This class models a single collision.
 * 
 * @author elifkoc
 * @version 9/26/2015
 */

public class Collision implements Comparable<Collision> 
{

	// Our instance variables.
	private int zipCode;
	private int numPersonsInjured;
	private int numPersonsKilled;
	private int numCyclistsInjured;
	private int numCyclistsKilled;
	private String factor1;
	private String factor2;
	private String vehicle1;
	private String vehicle2;

	/**
	 * @param zipCode
	 *            The zip code of the collision.
	 * @param numPersonsInjured
	 *            The total number of people injured in the collision.
	 * @param numPersonsKilled
	 *            The total number of people killed in the collision.
	 * @param numCyclistsInjured
	 *            The number of cyclists injured in the collision.
	 * @param numCyclistsKilled
	 *            The number of cyclists killed in the collision.
	 * @param factor1
	 *            The contributing factor of the 1st vehicle.
	 * @param factor2
	 *            The contributing factor of the 2nd vehicle.
	 * @param vehicle1
	 *            The vehicle type of the 1st vehicle.
	 * @param vehicle2
	 *            The vehicle type of the 2nd vehicle.
	 */
	public Collision(int zipCode, int numPersonsInjured, int numPersonsKilled, int numCyclistsInjured,
			int numCyclistsKilled, String factor1, String factor2, String vehicle1, String vehicle2) 
	
	{
		this.zipCode = zipCode;
		this.numPersonsInjured = (numPersonsInjured);
		this.numPersonsKilled = (numPersonsKilled);
		this.numCyclistsInjured = (numCyclistsInjured);
		this.numCyclistsKilled = (numCyclistsKilled);
		this.factor1 = factor1;
		this.factor2 = factor2;
		this.vehicle1 = vehicle1;
		this.vehicle2 = vehicle2;
	}

	public Collision() 
	{
	}

	/**
	 * Gets the collision's zip code.
	 * @return zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the collision's zip code. 
	 * @param zipCode
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Gets the collision's number of people injured.
	 * @return numPersonsInjured
	 */ 
	int getNumPersonsInjured() {
		return numPersonsInjured;
	}

	public void setNumPersonsInjured(int numPersonsInjured) {
		this.numPersonsInjured = numPersonsInjured;
	}
	
	/**
	 * Gets the collision's number of people killed.
	 * @return numPersonsKilled
	 */ 
	public int getNumPersonsKilled() {
		return numPersonsKilled;
	}
	
	/**
	 * Sets the collision's number of people killed.
	 * @param numPersonsKilled
	 */ 
	public void setNumPersonsKilled(int numPersonsKilled) {
		this.numPersonsKilled = numPersonsKilled;
	}
	
	/**
	 * Gets the collision's number of cyclists injured.
	 * @return numCyclistsInjured
	 */ 
	public int getNumCyclistsInjured() {
		return numCyclistsInjured;
	}
	
	/**
	 * Sets the collision's number of cyclists injured.
	 * @param numCyclistsInjured
	 */ 
	public void setNumCyclistsInjured(int numCyclistsInjured) {
		this.numCyclistsInjured = numCyclistsInjured;
	}
	
	/**
	 * Gets the collision's number of cyclists injured.
	 * @return numCyclistsInjured
	 */ 
	public int getNumCyclistsKilled() {
		return numCyclistsKilled;
	}

	/**
	 *Sets the collision's number of cyclists killed.
	 * @return numCyclistsKilled
	 */ 
	public void setNumCyclistsKilled(int numCyclistsKilled) {
		this.numCyclistsKilled = numCyclistsKilled;
	}
	
	/**
	 * Gets the collision's first cause factor.
	 * @return factor1
	 */ 
	public String getFactor1() {
		return factor1;
	}

	/**
	 * Sets the collision's first cause factor.
	 * @return factor1
	 */ 
	public void setFactor1(String factor1) {
		this.factor1 = factor1;
	}
	
	/**
	 * Gets the collision's second cause factor.
	 * @return factor2
	 */ 
	public String getFactor2() {
		return factor2;
	}

	/**
	 * Sets the collision's second cause factor.
	 * @param factor2
	 */ 
	public void setFactor2(String factor2) {
		this.factor2 = factor2;
	}

	/**
	 * Gets the collision's first vehicle type.
	 * @return vehicle1
	 */ 
	public String getVehicle1() {
		return vehicle1;
	}

	/**
	 * Sets the collision's first vehicle type.
	 * @param vehicle1
	 */ 
	public void setVehicle1(String vehicle1) {
		this.vehicle1 = vehicle1;
	}

	/**
	 * Gets the collision's second vehicle type.
	 * @return vehicle2
	 */ 
	public String getVehicle2() {
		return vehicle2;
	}
	
	/**
	 * Sets the collision's second vehicle type.
	 * @param vehicle2
	 */ 
	public void setVehicle2(String vehicle2) {
		this.vehicle2 = vehicle2;
	}

	@Override
	public String toString() {
		return

		"Collision Details: " + "Zipcode: " + zipCode + " People Injured: " + numPersonsInjured + " People Killed: "
				+ numPersonsKilled + " Cyclists injured: " + numCyclistsInjured + " Cyclists Killed: "
				+ numCyclistsKilled;
	}

	@Override
	public int compareTo(Collision c) {
		return (this.zipCode - c.zipCode);
	}

}
