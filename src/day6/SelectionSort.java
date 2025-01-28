package day6;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array=new int[n];
		
		// read
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		selectionSort(array);
		displayArray(array);
	}

	private static void displayArray(int[] array) {
		// TODO Auto-generated method stub
		
		for(int value:array) {
			System.out.print(value+" ");
		}
		System.out.println();
	}

	private static void selectionSort(int[] array) {
		// TODO Auto-generated method stub
		
		int n=array.length;
		
		for(int i=0; i<n-1;i++) {
			
			//assume first element is minimum
			int minindex=i;  // array[0] -> 5 2. array[1] -> 3 3. array[2] 4. array[3] 
			
			// compare
			for(int j=i+1;j<n;j++) {
				
				if(array[j]<array[minindex]) {
					minindex=j;
				}
				
			}
			
			//swap
			int temp=array[minindex];
			array[minindex]=array[i];
			array[i]=temp;
		}
	}

}
