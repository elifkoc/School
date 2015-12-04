
/**
 * @author elifkoc
 *
 */
public class ZipCode implements Comparable<ZipCode>

{
	private int zipcode;
	private int collisions;
	private int numPersonsInjured;
	private int numPersonsKilled;
	private int numPersonsInjuredandKilled;
	private int numCyclistsInjured;
	private int numCyclistsKilled;
	private int numCyclistsInjuredandKilled;

	/**
	 * @param zipcode
	 */
	public ZipCode(int zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the zipcode
	 */
	public int getZipCode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the collisions
	 */
	public int getCollisions() {
		return collisions;
	}

	/**
	 * @param collisions
	 *            the collisions to set
	 */
	public void setCollisions(int collisions) {
		this.collisions = collisions;
	}

	/**
	 * @return the numPersonsInjured
	 */
	public int getNumPersonsInjured() {
		return numPersonsInjured;
	}

	/**
	 * @param numPersonsInjured
	 *            the numPersonsInjured to set
	 */
	public void setNumPersonsInjured(int numPersonsInjured) {
		this.numPersonsInjured = numPersonsInjured;
	}

	/**
	 * @return the numPersonsKilled
	 */
	public int getNumPersonsKilled() {
		return numPersonsKilled;
	}

	/**
	 * @param numPersonsKilled
	 *            the numPersonsKilled to set
	 */
	public void setNumPersonsKilled(int numPersonsKilled) {
		this.numPersonsKilled = numPersonsKilled;
	}

	/**
	 * @return the numPersonsInjuredandKilled
	 */
	public int getNumPersonsInjuredandKilled() {
		return numPersonsInjuredandKilled;
	}

	/**
	 * @param numPersonsInjuredandKilled
	 *            the numPersonsInjuredandKilled to set
	 */
	public void setNumPersonsInjuredandKilled(int numPersonsInjuredandKilled) {
		this.numPersonsInjuredandKilled = numPersonsInjuredandKilled;
	}

	/**
	 * @return the numCyclistsInjured
	 */
	public int getNumCyclistsInjured() {
		return numCyclistsInjured;
	}

	/**
	 * @param numCyclistsInjured
	 *            the numCyclistsInjured to set
	 */
	public void setNumCyclistsInjured(int numCyclistsInjured) {
		this.numCyclistsInjured = numCyclistsInjured;
	}

	/**
	 * @return the numCyclistsKilled
	 */
	public int getNumCyclistsKilled() {
		return numCyclistsKilled;
	}

	/**
	 * @param numCyclistsKilled
	 *            the numCyclistsKilled to set
	 */
	public void setNumCyclistsKilled(int numCyclistsKilled) {
		this.numCyclistsKilled = numCyclistsKilled;
	}

	/**
	 * @return the numCyclistsInjuredandKilled
	 */
	public int getNumCyclistsInjuredandKilled() {
		return numCyclistsInjuredandKilled;
	}

	/**
	 * @param numCyclistsInjuredandKilled
	 *            the numCyclistsInjuredandKilled to set
	 */
	public void setNumCyclistsInjuredandKilled(int numCyclistsInjuredandKilled) {
		this.numCyclistsInjuredandKilled = numCyclistsInjuredandKilled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ZipCode [zipcode=" + zipcode + "]";
	}

	@Override
	public int compareTo(ZipCode z) {
		return this.collisions - z.collisions;
	}
}
