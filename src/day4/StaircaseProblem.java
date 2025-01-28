package day4;

import java.util.Scanner;

public class StaircaseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		calculateways(n);
	}
	
	public static void calculateways(int n) {
		
		// base case
		
		if(n==0||n==1) {
			
			System.out.println("1");
		}
		int i;
		//create n ways
		int[] ways = new int[n];
		
		ways[0]=1;
		ways[1]=1;
		
		for(i=2; i<n;i++) {
			
			ways[i]=ways[i-1]+ways[i-2];
		}
		
		for(int num:ways) {
			System.out.println(num);
		}
	}

}
