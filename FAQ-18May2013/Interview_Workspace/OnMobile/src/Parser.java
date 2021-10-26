import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 */

public class Parser {

	Map<Character, Character> parenthesisMap = new HashMap<Character, Character>();
	
	public Parser() {
		this.parenthesisMap.put(')', '(');
		this.parenthesisMap.put('}', '{');
		this.parenthesisMap.put(']', '[');
		this.parenthesisMap.put('>', '<');
	}

	public boolean checkParenthesisBalance(String inputString){
		
		Stack<Character> st = new Stack<Character>();
		st.add('$');
		for (int i = 0; i < inputString.length(); i++) {
			
			if(parenthesisMap.containsValue(inputString.charAt(i))){
				st.push(inputString.charAt(i));
			}
			
			if(parenthesisMap.containsKey(inputString.charAt(i))){
				if(!st.pop().equals(this.parenthesisMap.get(inputString.charAt(i)))){
					return false;
				}
			}
		}
		if(st.size() >1){
			return false;
		}
		
		return true;
	}
	
	
}
