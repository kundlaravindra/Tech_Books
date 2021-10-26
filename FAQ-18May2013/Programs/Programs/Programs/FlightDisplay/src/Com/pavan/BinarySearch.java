package Com.pavan;

public class BinarySearch {
	public static int binarySearch(String[] sorted , String key){
		int first =0;
		int last=sorted.length;
		while(first<last){
			int mid =(first+last)/2;
			if(key.compareTo(sorted[mid])<0){
				last=mid;				
			}
			else if(key.compareTo(sorted[mid])>0){
				first=mid+1;
				
			}else{
				return mid;
			}
			
		}
		return -(first+1);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=binarySearch(args, "Helloolleh");
		if (i>0) 
			System.out.println("NOT FOUND");
		else
			System.out.println("Found at "+(i+1)+"location ");
		

	}

}
