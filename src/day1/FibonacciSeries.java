package day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		findFibonacci(num);
		
	}
	
	public static void findFibonacci(int num) {
		
		int ft=0, st=1;
		
		for(int i=1;i<=num;i++) {
			
			System.out.print(ft+" ");
			// calcuate next num
			
			int nx= ft + st;
			ft=st;
			st=nx;
		}
		
		//nested loop 
	}

}

//Time complexity -> O(n) -> Linear search
//Space complexity -> O(1)


