package com.deepak.random.strings;

public class SortString {

	public static void main(String[] args) {

		String str = "askfsb nsDSAf SDSLNSND";
		char[] ch = str.toCharArray();
		int a[] = new int[53];
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i] == ' '){
				a[26] = ++a[26];
			}else if(ch[i] >= 'a' && ch[i] <= 'z'){
				int pos = ch[i] - 'a';
				
				a[pos] = ++a[pos];
			}else if(ch[i] >= 'A' && ch[i] <= 'Z'){
				int pos = ch[i] - 'A' +26;
				
				a[pos] = ++a[pos];
			}
		}	
		int j=0;
		char ch1[] = new char[ch.length];
		
			for (int i = 0; i < a.length; i++) {
				if(i < 26){
					while(a[i] > 0){
						ch1[j] = (char) ('a' + i);
						j++;
						a[i]--;
					}
				}else if(i == 26){
					while(a[i] > 0){
						ch1[j] = ' ';
						j++;
						a[i]--;
					}
				}else if(i  > 26){
					while(a[i] > 0){
						ch1[j] = (char) ('A' + i-26);;
						j++;
						a[i]--;
					}
				}
				
			}
			
		System.out.println(ch1);
	}

}
