package org.surya.action;

public class ReverseString {

	public static void main(String[] args) {

		String s="surya";
		for(int i=s.length()-1;i>=0;i--){
			char a=s.charAt(i);
			if(i>=0){
				System.out.print(a);
			}
			
		}
	}

}
