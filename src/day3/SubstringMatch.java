package day3;

import java.util.Scanner;

public class SubstringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.next(); // helloworld  - 10 
		String substr = sc.next();  //world - 5 
		
		int result= getSubstring(str,substr);
		
		if(result!=-1) {
			System.out.println(result);
		} else {
			System.out.println("-1");
		}
	}
	
	public static int getSubstring(String str, String substr) {
		
		for(int i =0; i<=str.length()-substr.length();i++) {
			
			if(str.substring(i, i+substr.length()).equals(substr)) {
				return i; 
				
			}
		}
		
		return -1;
	}

}
