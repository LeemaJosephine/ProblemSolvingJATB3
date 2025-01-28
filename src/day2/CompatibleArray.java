package day2;

import java.util.Scanner;

public class CompatibleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// create 2 arrays of n size
		int[] array1=new int[n];
		int[] array2=new int[m];
		
		// read values for the first array
		for(int i=0;i<n;i++) {
			array1[i]=sc.nextInt();
		}
		
		//read values for second array
		for(int i=0;i<n;i++) {
			array2[i]=sc.nextInt();
		}
		
		boolean result = checkCompatibility(array1,array2);
		
		if(result) {
			
			System.out.println("Compatible");
		} else {
			System.out.println("Not compatible");
		}
	}

	public static boolean checkCompatibility(int[] array1, int[] array2) {
		
		if(array1.length!=array2.length) {
			return false;
		}
		
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]>=array2[i]) {
				return true;
			}
		}
		 return false;
	}
}
