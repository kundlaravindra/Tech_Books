
import org.apache.commons.lang3.StringUtils;



/**
 * 
 */

/**
 * @author kumadeep
 *
 */
public class SAmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String strActual = "East Bengal";
		String strFake = "West Bengal";
		System.out.println(StringUtils.getJaroWinklerDistance(strActual, strFake));
		
	}

}
