package day4;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//array to store fibonacci series
		int[] fib=new int[num];
		
		//Base
		fib[0]=0;
		fib[1]=1;
		
		
		//fill-in next level using result of
		for(int i=2;i<num;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
	
		for(int num1: fib) {
			
			System.out.println(num1);
		}
	}

}
