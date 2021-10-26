import java.math.BigInteger;

public class BinarySum
{

	public static BigInteger integerfrmbinary(String str)
	{
		BigInteger reallyBig = new BigInteger("0");
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == '1')
			{
				int val = (int) Math.pow(2, str.length() - 1 - i);
				BigInteger temp = new BigInteger(val + "");
				reallyBig = reallyBig.add(temp);
			}

		}
		return reallyBig;
	}

	public static void main(String[] args)
	{
		System.out.println(sum("1001", "111"));
	}

	private static String sum(String num1, String num2)
	{
		if (num1 == null && num2 == null)
			return null;
		if (num1 == null)
			return num2;
		if (num2 == null)
			return num1;

		BigInteger integer1 = integerfrmbinary(num1);
		BigInteger integer2 = integerfrmbinary(num2);
		integer1 = integer1.add(integer2);
		return binaryFromInteger(integer1);
	}

	private static String binaryFromInteger(BigInteger num)
	{
		int binary[] = new int[500];
		String result = "";
		int index = 0;
		while (num.compareTo(new BigInteger("0")) > 0)
		{
			BigInteger remainder = num.remainder((new BigInteger("2")));
			binary[index++] = remainder.intValue();
			num = num.divide(new BigInteger("2"));
		}
		for (int i = index - 1; i >= 0; i--)
		{
			result = result + binary[i];
		}
		return result;
	}
	
	/*bool doOverlap(Point l1, Point r1, Point l2, Point r2)
	{
	    // If one rectangle is on left side of other
	    if (l1.x > r2.x || l2.x > r1.x)
	        return false;
	 
	    // If one rectangle is above other
	    if (l1.y < r2.y || l2.y < r1.y)
	        return false;
	 
	    return true;
	}*/
}