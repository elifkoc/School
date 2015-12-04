import java.util.Comparator;

/**
 * This sorts our zip code list by combined injuries + fatalities. 
 * @author elifkoc
 *
 */
public class ZipCodeInjuriesFatalities implements Comparator<ZipCode>

{

	@Override
	public int compare(ZipCode zipcode1, ZipCode zipcode2) {
		if (zipcode1.getNumPersonsInjuredandKilled() > zipcode2.getNumPersonsInjuredandKilled()) {
			return 1;
		} else if (zipcode1.getNumPersonsInjuredandKilled() < zipcode2.getNumPersonsInjuredandKilled()) {
			return -1;
		} else {
			return 0;
		}
	}

}
