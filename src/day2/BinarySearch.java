package day2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		
		System.out.println("Enter elements of the array");
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the target element");
		int target=sc.nextInt();
		
		int res=binarySearch(arr,target);
		
		if(res==-1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Index of the target is: " +res);
		}
	}
	
	public static int binarySearch(int[] arr,int target) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			
			int mid = left +(right-left)/2;
			
			// check target element
			
			if(arr[mid]==target) {
				
				return mid;
			}
			
			if(arr[mid]<target) {
				
				left = mid +1;
			} else {
				
				right = mid -1;
			}
			
		}
		
		return -1;
	}

}
