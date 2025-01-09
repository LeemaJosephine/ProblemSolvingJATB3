package day1;

import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		long result = factorial(num);
		System.out.println(result);
	}

	
	public static long factorial(int num) {
		
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		return fact;
	}
}

//Time complexity -> O(n!)
//Space complexity -> O(1)