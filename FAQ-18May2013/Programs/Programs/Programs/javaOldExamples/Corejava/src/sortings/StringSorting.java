package sortings;
import java.io.*;
public class StringSorting {
static String arr[]=new String[10];

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for (int i=0;i<5;i++){
	 arr[i]=br.readLine();
}
for (int j=0;j<arr.length;j++){
	for(int a=j+1;a<arr.length;a++){
		if(arr[j].compareTo(arr[a]) < 0){
			String t=arr[j];
			arr[j]=arr[a];
			arr[a]=t;
			
		}
	}
	System.out.println(j);
}

	}

}
