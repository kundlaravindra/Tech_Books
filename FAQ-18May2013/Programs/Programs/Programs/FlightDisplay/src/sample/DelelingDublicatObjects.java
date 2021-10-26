package sample;

public class DelelingDublicatObjects {
	int i=1;
	public int fib(int n){
		if(n>0){			
			i=i*n;
			n--;
			fib(n);
			
			}
		
	return i;	
	}
	static String s1=new String();
	public static void main(String[] args) {
		/*CollectionExp c=new CollectionExp(1,"Raja");
		CollectionExp c1=new CollectionExp(2,"Raj");
		List l=new ArrayList();
		l.add(c);
		l.add(c1);
		Set s=new TreeSet<CollectionExp>(new CollectionExp());
		s.add(new CollectionExp(1,"Raja"));
		s.add(new CollectionExp(1,"Raja"));*/
		DelelingDublicatObjects d=new DelelingDublicatObjects();
		//int j=d.fib(4);
		System.out.println(d.fib(5));
		String s="Rajashekar";
		int n=s.length();
		 
		for(int i=n-1;i>=0;i--){
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		
		}

	
	

}
