package pack1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Compatibility Difference
 * @author kumadeep
 *
 */
public class TestClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numOfMovies = in.nextInt();
		
		int[] player1 = new int[numOfMovies];
		int[] player2 = new int[numOfMovies];
		
		for (int i = 0; i < numOfMovies; i++) {
			player1[i] = in.nextInt();
		}
		for (int i = 0; i < numOfMovies; i++) {
			player2[i] = in.nextInt();
		}
		if(numOfMovies > 0 && numOfMovies <1000){
			if(isValid(player1,numOfMovies) && isValid(player2,numOfMovies)){
				System.out.println(findCompatibilityDiff(player1, player2));
			}else{
				return;
			}
		}
	}
		
	
	private static int findCompatibilityDiff(int[] player1, int[] player2){
		int compDiff = 0;
		for (int i = 0; i < player1.length; i++) {
			for (int j = 0; j < player2.length; j++) {
				
				if(player1[i] == player2[j]){
					
					int diff = Math.abs(i-j);
					if(compDiff < diff){
						compDiff = diff;
					}
					break;
				}
			}
			
		}
		
		return compDiff;
	}
	
	private static boolean isValid(int[] ch,int numOfMovies){
	
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0 ;i < ch.length;i++){
			if(ch[i] <= numOfMovies){
				if(set.contains(ch[i])){
					return false;
				}else{
					set.add(ch[i]);
				}
			}else{
				return false;
			}
		}
		return true;
	}

}
