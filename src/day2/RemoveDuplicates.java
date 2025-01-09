package day2;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int newLenght=removeDuplictes(arr,n);
		
		for(int i=0; i<newLenght;i++) {
			
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static int removeDuplictes(int[] arr,int n) {
		
		if(n==0||n==1) {
			return n;
		}
		
		int j=0; // unique elements
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				arr[j++] = arr[i];
			}
		}
		
		arr[j++]=arr[n-1];
		
		return j; // length of j will be 4
		
	}

}
