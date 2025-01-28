package day2;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		rotationArray(arr,k,n);
	}
	
	public static void rotationArray(int[] arr,int k, int n) {
		
		//k value larger than the size of array
		
		k=k%n;
		
		reverse(arr, 0, k-1); // Reverse first K position element -> 2 1
		reverse(arr, k, n-1); // Reverse the remaining element from index K-position to n-1  -> 6 5 4 3  => 2 1 6 5 4 3
		reverse(arr, 0, n-1); // Reverse the entire array. -> 3 4 5 6 1 2
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void reverse(int[] arr, int start, int end) {
		
		while(start<end) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
