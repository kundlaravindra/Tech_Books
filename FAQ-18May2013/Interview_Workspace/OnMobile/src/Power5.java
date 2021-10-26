/**
 * 
 */

/**
 * @author kumadeep
 *
 */
public class Power5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public  int numOfWays(String s){
		int [] bin = new int[s.length() + 1];
		
		bin[0] = 0;
		for (int i = 1; i <= bin.length; i++) {
			bin[i] = Integer.MAX_VALUE-1;
			
			for (int j = 1; j <= i ; j++) {
			
				if(s.charAt(j-1) == '0'){
					continue;
				}
				
				int num = Integer.parseInt(s.substring(j-1, i),2);
				
				if(isPower(num)){
					bin[i] = Math.min(bin[i], bin[j-1] +1 );
				}
			}
			
		}
		if(bin[s.length()] != Integer.MAX_VALUE-1){
			return bin[s.length()];
		}
		return -1;
	}
	
	private boolean isPower(int val){
		if(val == 0){
			return false;
		}
		
		int n = (int)(Math.log(val)/Math.log(5));
		if(Math.pow(5,n) == val){
			return true;
		}else{
			return false;
		}
	}
}
