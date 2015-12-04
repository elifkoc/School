import java.util.ArrayList;
import java.util.Collections;

/**
 * This class sorts our collision objects into a single lists and provides functionality for our tasks. 
 * @author elifkoc
 *
 */

public class CollisionList

{
	//Instantiate the datafield.
	ArrayList<Collision> collisions;

	public CollisionList() {
		collisions = new ArrayList<Collision>();
	}

	/**
	 * This method returns all of the Collision objects stored in CollisionList.
	 * 
	 * @return Returns all of the Collision objects stored in CollisionList.
	 */
	public ArrayList<Collision> getCollisionList() {
		return collisions;
	}

	/**
	 * This method adds a collision to our collision list.
	 * 
	 * @param Collision x, the collision we add. 
	 */
	public void addToCollisionList(Collision x) {
		collisions.add(x);
	}

	/**
	 * This method returns the size of ArrayList<Collision>.
	 * 
	 * @return Returns collisions.size()
	 */
	public int getCollisionListSize() {
		return collisions.size();
	}

	/**
	 * This method returns a specific collision from our collision list. 
	 * 
	 * @return Returns a specific collision from our collision list. 
	 */
	public Collision getSingleCollision(int i) {
		Collision single = collisions.get(i);
		return single;
	}
	
	/**
	 * This method sorts the collision list. 
	 * 
	 * @return Returns a sorted collision list.
	 */
	public ArrayList<Collision> sortListByZip() {
		Collections.sort(collisions);
		return collisions;
	}

	/**
	 * This method returns how many collisions are in a single zip code.
	 * 
	 * @return Returns how many collisions are in a single zip code.
	 */
	public int collisionsPerZip(ZipCode zipcode) {
		int collisionCounter = 0;
		for (int i = 0; i < collisions.size(); i++) {
			if (collisions.get(i).getZipCode() == zipcode.getZipCode()) {
				collisionCounter++;
			}
		}
		return collisionCounter;
	}

	public int PersonsInjuredPerZip(ZipCode zipcode) {
		int personsInjuredCounter = 0;
		for (int i = 0; i < collisions.size(); i++) {
			if (collisions.get(i).getNumPersonsInjured() == zipcode.getZipCode()) {
				personsInjuredCounter++;
			}
		}
		return personsInjuredCounter;
	}

	public int PersonsKilledPerZip(ZipCode zipcode) {
		int personsKilledCounter = 0;
		for (int i = 0; i < collisions.size(); i++) {
			if (collisions.get(i).getNumPersonsKilled() == zipcode.getZipCode()) {
				personsKilledCounter++;
			}
		}
		return personsKilledCounter;
	}

	public int CyclistsKilledPerZip(ZipCode zipcode) {
		int cyclistsKilledCounter = 0;
		for (int i = 0; i < collisions.size(); i++) {
			if (collisions.get(i).getNumCyclistsKilled() == zipcode.getZipCode()) {
				cyclistsKilledCounter++;
			}
		}
		return cyclistsKilledCounter;
	}

	public int CyclistsInjuredPerZip(ZipCode zipcode) {
		int cyclistsInjuredCounter = 0;
		for (int i = 0; i < collisions.size(); i++) {
			if (collisions.get(i).getNumCyclistsInjured() == zipcode.getZipCode()) {
				cyclistsInjuredCounter++;
			}
		}
		return cyclistsInjuredCounter;
	}

	public int harmPerZip(ZipCode zipcode) {
		int harmCounter = 0;
		for (int i = 0; i < collisions.size(); i++) {
			if (collisions.get(i).getZipCode() == zipcode.getZipCode()) {
				harmCounter += (collisions.get(i).getNumPersonsInjured() + collisions.get(i).getNumPersonsKilled());
			}
		}
		return harmCounter;
	}

	public int cyclistHarmPerZip(ZipCode zipcode) {
		int cyclistHarmCounter = 0;
		for (int i = 0; i < collisions.size(); i++) {
			if (collisions.get(i).getZipCode() == zipcode.getZipCode()) {
				cyclistHarmCounter += (collisions.get(i).getNumCyclistsInjured()
						+ collisions.get(i).getNumCyclistsKilled());
			}
		}
		return cyclistHarmCounter;
	}

	/**
	 * This method finds out how many vehicle types are in the collision list.
	 * 
	 * @return int of vehicles in collision list.
	 */
	public int findVehicle(CollisionList collisions, String vehicle) {
		int vehiclecounter = 0;

		for (int i = 0; i < collisions.getCollisionListSize(); i++) {
			if (collisions.getSingleCollision(i).getVehicle1().contains(vehicle)) {
				vehiclecounter++;
			} else if (collisions.getSingleCollision(i).getVehicle2().contains(vehicle)) {
				vehiclecounter++;
			}
		}
		return vehiclecounter;
	}

	
	public int findFactor(CollisionList collisions, String factor) {
		int factorcounter = 0;

		for (int i = 0; i < collisions.getCollisionListSize(); i++) {
			if (collisions.getSingleCollision(i).getFactor1().contains(factor)) {
				factorcounter++;
			} else if (collisions.getSingleCollision(i).getFactor2().contains(factor)) {
				factorcounter++;
			}
		}
		return factorcounter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CollisionList [collisions=" + collisions + "]";
	}

}
