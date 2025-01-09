package day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sumOfDigits(num));
	}

	public static int sumOfDigits(int num) {
		
		int sum=0;
		while(num!=0) {
			
			sum += num%10; //-> 3 , 2 = 5  , 1 + 5 =6
			num = num/10;  // 12 , 1 
		}
		
		return sum;
	}
}
