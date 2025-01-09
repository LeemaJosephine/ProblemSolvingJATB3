package day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(checkPrime(num)) {
			
			System.out.println("It's a prime number");
		} else {
			
			System.out.println("Not a prime");
		}
	}
	
	
	public static boolean checkPrime(int num) {
		
		if(num<=0) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			
			if(num %i == 0) {
				return false;
			}
		}
		return true;
		
	}

}


// Time complexity O(sqrt(n) -> O(log n)
// Space complexity - O(1)




