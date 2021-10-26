package com.toshiba;
import java.util.ArrayList;
@SuppressWarnings("unused")
public class CommandLine {
	
	//static String[] s = { "raja", "shekar", "vinod", "reddy", "kumar", "karthik"};
		
		public static void main(String[] args) {
			ArrayList l = new ArrayList();
			l.add(9);
			l.add(8);
			l.add(1,5);
			System.out.println(l);
			// TODO Auto-generated method stub
			//System.out.println(s.length);
			//Scanner sc = new Scanner(System.in);
			String[] s = new String[args.length];
			System.out.println(s.length);
			for (int k = 0; k < args.length;k++){
				s[k]= args[k]; 
			}
			
			//System.out.println(s1.);
			for (int i=0; i < s.length;i++){
				for (int j = i+1; j<s.length;j++){
					if(s[j].compareTo(s[i]) < 0){
					String t = s[i];
					s[i] = s[j];
					s[j] = t;
					}
				}
				System.out.println(s[i]);
			}
		}
	}

