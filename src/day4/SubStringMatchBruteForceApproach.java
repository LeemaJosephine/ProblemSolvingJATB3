package day4;

import java.util.Scanner;

public class SubStringMatchBruteForceApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String substr= sc.nextLine();
		
		int index=-1; // no matching substring found
		
		//brute force technique
		
		for(int i=0; i<str.length();i++) {
			
			boolean found=true;
			
			for(int j=0;j<substr.length();j++) { // j = w j= o 
				
				if(str.charAt(i+j)!=substr.charAt(j)) {
					//no matching character 
					found=false;
					break;	
				}
			}
			
			if(found) {
				
				index = i; // update the substring matching cahr value
				break;
			}
		}
		
		if(index!=-1) {
			System.out.println(index);
		} else {
			System.out.println("-1");
		}
		
	}

}
