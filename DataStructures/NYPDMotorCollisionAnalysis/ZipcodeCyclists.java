import java.util.Comparator;

/**
 * This sorts our zip code list by combined cyclist injuries + fatalities. 
 * @author elifkoc
 *
 */
public class ZipCodeCyclists implements Comparator<ZipCode>

{

	@Override
	public int compare(ZipCode zipcode1, ZipCode zipcode2) {
		if (zipcode1.getNumCyclistsInjuredandKilled() > zipcode2.getNumCyclistsInjuredandKilled()) {
			return 1;
		} else if (zipcode1.getNumCyclistsInjuredandKilled() < zipcode2.getNumCyclistsInjuredandKilled()) {
			return -1;
		} else {
			return 0;
		}
	}

}
