import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class TestMain {

	public static void main(String[] args) {

		Parser par = new Parser();
		
		System.out.println(par.checkParenthesisBalance("[]{{}}()"));
		System.out.println(par.checkParenthesisBalance("[]{{}}("));
		
		Power5 p = new Power5();
		//System.out.println(p.numOfWays("10101101"));
		System.out.println(is_Palindrome("aaababbb"));
	}
	
	 public static String is_Palindrome(String s) {

		 char ch[] = s.toCharArray();
		 Map<String, Integer>  map = new HashMap<>();
		 for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i]+"")){
				map.put(ch[i] + "" , map.get(ch[i]+"") + 1);
			}else{
				map.put(ch[i] + "" , 1);
			}
		}
		
		 int count = 0;
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			
			if(entry.getValue() % 2 != 0){
				 count++;
			 }
		 }
		
		if(count > 1){
			return "NO";
		}
		return "YES";

	 }

}
class FoodFactory {
    
	public Food getFood(String str){
			System.out.println(str);
			return new Food(str);
	}
}

class Food extends 	 {
    String str;
    
    public Food(String str) {
    	this.str = str;
    }
	 public void serveFood(){
		 System.out.println("I'm serving " + this.str	);
	 }
}