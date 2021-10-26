package bobTech;

public class Example4 {
	public static void main(String[] args) {
		String s="good",s1="bad";
		String s3="good" + "bab";
		String s4="good" +s1;
		String s5=s+"bad";
		if(s3==s4)
			System.out.println("yes");
		if(s3==s5)
			System.out.println("no");
		if(s4==s5)
			System.out.println("yesno");
		else
			System.out.println("I know");
	}



}
