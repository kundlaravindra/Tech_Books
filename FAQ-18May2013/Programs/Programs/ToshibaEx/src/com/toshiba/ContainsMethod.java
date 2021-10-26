package com.toshiba;

public class ContainsMethod {
Integer[] a = {10,20,30,40,50,60,null};
	public int find(Object o) {
		//System.out.println(o);
        if (o==null) {
        	//System.out.println("hi---------");
            for (int i=0; i<a.length; i++)
                if (a[i]==null)
                    return i;
        } else {
        	//System.out.println("hi++++++++");
            for (int i=0; i<a.length; i++)
                if (o.equals(a[i])){
                	System.out.println(i+".........");
      //Because if check with equals with null value null pointer exception will be rise
                    return i;}
        }
        return -1;
    }

    public boolean contains(Object o) {
    	//boolean k = find(o) != -1;
    	//System.out.println(k+"/////");
        return find(o) != -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsMethod c = new ContainsMethod();
		boolean b=c.contains(10);
		System.out.println(b+"-----");
		//int i = c.find(20);
		//int i = c.find(null);
		//System.out.println(i);

	}

}
