package day3;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		str = str.replaceAll(" ", "%20");
		
		System.out.println(str);
		
	}

}
