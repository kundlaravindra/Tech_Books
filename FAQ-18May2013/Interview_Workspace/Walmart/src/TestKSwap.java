
public class TestKSwap {

	public static void main(String[] args) {

		
		
	}
	
	private static char[] findMax(char[] ch, int k, int start){
		int max = 0;
		for (int i = start; i < k+1; i++) {
			if(ch[i] > max){
				max = ch[i];
			}
		}
		
		return ch;
	}

}
