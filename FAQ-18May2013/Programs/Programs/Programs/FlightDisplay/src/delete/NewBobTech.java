package delete;

public class NewBobTech extends BobTech {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewBobTech b=new NewBobTech();
	//String s=new StringBuffer("hello").append("raju").toString();
		/*String s=new Integer("10").toString();
	System.out.println(s);
*//*
		String str1 = "Hello Java";
		  String str2 = new StringBuffer("Hello").append(" Java").toString();
		  String str3 = str2.intern();
		    System.out.println("str1 == str2 " + (str1 == str2));
		  System.out.println("str1 == str3 " + (str1 == str3));
Class c=Class.class;
Object o=c.getInterfaces();
System.out.println(o);*/
		/*String str1 = new String("Java is a wonderful language");
		  String str2 = new String("It is an object-oriented language");
		  boolean result = str1.regionMatches(2, str2, 7,7); 
		  System.out.println(result);
		  String s = "Java is a wonderful language";
		  System.out.println(s);
		  System.out.println("lastIndexOf(ful, 18) = " 
		  + s.lastIndexOf("ful", 18));*/
		String str = "This is my new string";
		  char[] content = str.toCharArray();
		 java.util.Arrays.sort(content);
		  String sorted = new String(content);
		  System.out.println(content);



	}

}
