package sample;

public class ArraySorting {

	public static void main(String[] args) {
int n1[]={55,40,80,65,71};
int n=n1.length;
int i,j;
int b=n-1;
//for(i=0,j=1;  j<n || i<n;  j=j<b?(i++):j++){
	for(i=0,j=1;j<n;j++){
	System.out.println(i+"    "+j);
	if(n1[i]<n1[j]){
		int t=n1[i];
		n1[i]=n1[j];
		n1[j]=t;
	}
	
	
	if(j==b){
		i++;
		j=i;
		
	}
}for(int a=0;a<n;a++){
	System.out.println(n1[a]);
}

	}

}
