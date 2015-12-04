
/**
 * This class sorts our zipcode objects into a single lists and provides functionality for our tasks. 
 * @author elifkoc
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class ZipCodeList

{

	public ArrayList<ZipCode> zipcodes;

	/**
	 * @param zipcodes
	 */
	public ZipCodeList() {
		zipcodes = new ArrayList<ZipCode>();
	}
	
	/**
	 * This method returns all of the zipcode objects stored in ZipCodeList.
	 * 
	 * @return Returns all of the Collision objects stored in CollisionList.
	 */
	public ArrayList<ZipCode> getZipCodeList() {
		return zipcodes;
	}

	/**
	 * This method adds a zip code to our zip code list.
	 * 
	 * @param Collision x, the collision we add. 
	 */
	public void addToZipCodeList(ZipCode zipcode) {
		zipcodes.add(zipcode);
	}

	/**
	 * This method sees if a zipcode already exists in our list
	 * 
	 * @param zipcode in question
	 * @return boolean
	 */
	public boolean contains(ZipCode zipcode) {
		for (int i = 0; i < zipcodes.size(); i++) {
			if (zipcodes.get(i).getZipCode() == zipcode.getZipCode()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method returns a specific zipcode from our zipcode list. 
	 * 
	 * @return Returns a specific zip code.
	 */
	public ZipCode getSingleZipCode(int position) {
		for (int i = 0; i < zipcodes.size(); i++) {
			if (i == position) {
				return zipcodes.get(i);
			}
		}
		return null;
	}

	public ArrayList<ZipCode> sortListByMostCollisions() {
		Collections.sort(zipcodes, Collections.reverseOrder());
		return zipcodes;
	}

	public ArrayList<ZipCode> sortListByLeastCollisions() {
		Collections.sort(zipcodes);
		return zipcodes;
	}

	public ArrayList<ZipCode> sortListByHarm() {
		Collections.sort(zipcodes, new ZipCodeInjuriesFatalities());
		return zipcodes;
	}

	public ArrayList<ZipCode> sortListByCyclists() {
		Collections.sort(zipcodes, new ZipCodeCyclists());
		return zipcodes;
	}

	public int getZipCodeListSize() {
		return zipcodes.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ZipCodeList [zipcodes=" + zipcodes + "]";
	}

}
