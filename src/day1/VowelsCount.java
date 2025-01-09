package day1;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(countVowels(str));
	}

	public static int countVowels(String str) {
		
		int count =0;
		str=str.toLowerCase();
		for(int i =0;i<str.length();i++) {
			
			char ch =str.charAt(i);
			if(ch=='a' || ch == 'e' || ch=='i' || ch == 'o' || ch =='u') {
				count = count+1;
			}
		}
		return count;
	}
}
