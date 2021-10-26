import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
   
    String[] str= s.split(" ");

    String str1 = getBinaryToDecimal(str[0].trim());
    String str2 = getBinaryToDecimal(str[1].trim());
	System.out.println(getDecimalToBinary(Integer.valueOf(str1) + Integer.valueOf(str2)));
	
  }
  
  
  
  public static String getDecimalToBinary(int number){
		String str = "";
		while(number > 0){
			str = number%2 + str;
			number = number/2;
		} 
		return str;
	}
	public static String getBinaryToDecimal(String str){
        double powIndex = 0;
        double sum = 0;
		for(int index = str.length()-1;index>=0;index--){
			Integer val = Character.getNumericValue(str.charAt(index));
			sum = sum + ((double)val)*Math.pow(2, powIndex++);
		}
		
		return Double.valueOf(sum).intValue()+"";
	}
	
	public static String sumTwoBinary(String bin1, String bin2){
		Double iDec1 = Double.valueOf(getBinaryToDecimal(bin1));
		Double iDec2 = Double.valueOf(getBinaryToDecimal(bin2));
		return getDecimalToBinary(iDec1.intValue() + iDec2.intValue());
	}
	
	public static Integer convertBinaryToDecimal(String str){
	
		return 0;
	}
}
