package eprism;
	public class Mya  
	{	
		static int t,a,j;
	
	
	public static void main(String args[]){
		int[] i=new int[7];	
		i[0]=7;
		i[1]=9;
		i[2]=4;
		i[3]=5;
		i[4]=2;
		i[5]=3;
		i[6]=8;
		
		for(a=0;a<7;a++){
          for (j=a+1;j<7;j++){
        	  if(i[a]>i[j]){
        		  t=i[a];
        		    i[a]=i[j];
        		    i[j]=t;
        	
        	  }
          }
      	 	  
      }
		for (int k=0;k<7;k++){
			System.out.println(i[k]);
		}
	
		
	}
}
