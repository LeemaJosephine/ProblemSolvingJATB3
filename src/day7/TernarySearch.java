package day7;

import java.util.Scanner;

public class TernarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array=new int[n];
		
		//read
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		// target element
		int key=sc.nextInt();
		
		int targetindex = ternarySearch(array,0,n-1,key);
		
		if(targetindex==-1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at the index: " +targetindex);
		}
	}

	private static int ternarySearch(int[] array, int left, int right, int key) {
		// TODO Auto-generated method stub
		
		if(right>=left) {
			
			// find 2 mid points
			int mid1=left+(right-left)/3; // mid1
			int mid2=right-(right-left)/3; // mid 2
			
			//compare with target key
			if(array[mid1]==key) {
				return mid1;
			}
			
			if(array[mid2]==key) {
				return mid2;
			}
			
			//Key is smaller than mid
			if(key<array[mid1]) {
				return ternarySearch(array, left, mid1-1, key);
			} else if(key>array[mid2]) {
				return ternarySearch(array, mid2+1, right, key);
			} else {
				
				return ternarySearch(array, mid1+1, mid2-1, key);
			}
			
			
		}
		
		return -1;
	}

}
