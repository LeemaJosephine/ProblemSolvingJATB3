package day6;

import java.util.Scanner;

public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array=new int[n];
		
		//read
		for(int i=0;i<n;i++) {
			
			array[i]=sc.nextInt();
		}
		
		countSort(array);
		displayArray(array);
	}

	private static void displayArray(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i:array) {
			System.out.print(i+" ");
		} System.out.println();
	}

	private static void countSort(int[] array) {
		// TODO Auto-generated method stub
		
		//find the maxmimum element in array
		
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		//create a count array -> max array + 1 size
		
		int[] count=new int[max+1];
		
		//count the frequency
		
		for(int i=0; i<array.length; i++) {
			count[array[i]]++;
		}
		
		//update the original array based on count array
		int index=0;
		for(int i=0;i<count.length;i++) {
			while(count[i]>0) {
				array[index++] = i; // place element and move to next position
				count[i]--; // decrement this count -> we place all element based on frequency. 
			}
		}
		
	}

}
