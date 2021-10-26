import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;


/**
 * 
 */

/**
 * @author kumadeep
 *
 */
public class BinaryUtils {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

    /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
      System.out.println(s);
    }*/
    String s = "1 1";
    String[] str= s.split(" ");

    int iDec1 = Integer.valueOf(str[0].trim());
    int iDec2 = Integer.valueOf(str[1].trim());
    String str1 = getDecimalToBinary(iDec1);
    String str2 = getDecimalToBinary(iDec2);
	System.out.println(sumTwoBinary(str1, str2));
	System.out.println(findOverLap());
	}
	
	public static Rectangle findOverLap(){
		Rectangle rect1 = new Rectangle(100, 100, 200, 240);
		Rectangle rect2 = new Rectangle(120, 80, 80, 120);
		Rectangle intersection = rect1.intersection(rect2);
		return intersection;
	}
	
	public static String getDecimalToBinary(int number){
		String str = "";
		while(number > 0){
			str = number%2 + str;
			number = number/2;
		} 
		return str;
	}
	
	public static String removeLeadingZeroes(String value) {
	     while (value.length() > 1 && value.indexOf("0")==0)
	         value = value.substring(1);
	         return value;
	}
	
	public static String getBinaryToDecimal(String str){
        double powIndex = 0;
        double sum = 0;
		for(int index = str.length()-1;index>=0;index--){
			Integer val = Character.getNumericValue(str.charAt(index));
			sum = sum + ((double)val)*Math.pow(2, powIndex++);
		}
		//System.out.println(sum);
		return Double.valueOf(sum).intValue()+"";
	}

	
	public static String sumTwoBinary(String bin1, String bin2){
		Double iDec1 = Double.valueOf(getBinaryToDecimal(bin1));
		Double iDec2 = Double.valueOf(getBinaryToDecimal(bin2));
		return getDecimalToBinary(iDec1.intValue() + iDec2.intValue());
	}


}
