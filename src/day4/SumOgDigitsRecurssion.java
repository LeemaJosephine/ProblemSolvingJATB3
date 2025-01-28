package day4;

import java.util.Scanner;

public class SumOgDigitsRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				System.out.println(sumOfDigits(num));
			}

			public static int sumOfDigits(int num) {
				
				if(num==0)
					return 0;
				
				return (num % 10 + sumOfDigits(num/10) );
				
	}
			
			// Step by step explanation:
			/*
			 * 123
			 * 
			 * Step 1 -> 123 %10 -> 3 + 123/10 
			 * Step 2 -> 12 % 10 -> 2 + 12 /10
			 * Step 3 -> 1 % 10 -> 1 + 1/10 
			 */

}
