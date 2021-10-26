package com.toshiba.reflection;

import java.lang.reflect.*;  

public class ReflectionTest {  
    public static void main(String[] args) throws Exception{  
        String classname=args[0];  
        String methodname=args[1];  
                  
        Class c=Class.forName("com.toshiba.reflection.Test1.java");  
        Object o=c.newInstance();  
        Method m=c.getDeclaredMethod(methodname);  
        //uncomment the following statement to access the private method  
         //m.setAccessible(true);  
        Object result=m.invoke(o);  
        //if method to invoke has arguments we want to use a two argument method invoke(object, Object[]) the second argument Object[] describes the arguments  
  
        System.out.println(result); 
    }  
}  