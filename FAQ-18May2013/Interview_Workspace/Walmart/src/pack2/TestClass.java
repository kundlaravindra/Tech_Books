package pack2;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 	Number swap
 * @author kumadeep
 *
 */
public class TestClass {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		BigDecimal number = in.nextBigDecimal();
		Long numOfSwaps = in.nextLong();
		
		String num = number.toString();
		if(num != null){
			char[] ch = num.trim().toCharArray();
			if(ch.length > 1){
				System.out.println(findMax(ch, numOfSwaps));
			}else{
				System.out.println(ch);
			}
		}
		
	}
	
	private static char[] findMax(char[] ch, Long numOfSwaps){
		
		int max=0;
		int swaps = 0;	
		for (int i = 0; i < numOfSwaps; i++) {
			for (int j = 0; j < ch.length-1; j++) {
				if(j < numOfSwaps && ch[j] > max){
					max = ch[j];
					ch[0] = 0;
					for (int j2 = 1 ; j2 < j; j2++) {
						char temp = ch[j2+1];
						ch[j2]=temp;
					}
					ch[0] = 0;
					swaps = j;
				}
			}
		}
		for (int i = 0; i < numOfSwaps-swaps; i++) {
			for (int j = 0; j < ch.length-1; j++) {
				
				
				
				if(ch[j] < ch[j+1]){
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
					break;
				}
				
				if(j == ch.length-2){
					return ch;
				}
			}
		}
		
		return ch;
	}
	
	
}
