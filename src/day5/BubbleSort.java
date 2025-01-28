package day5;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] array=new int[n];
		
		for(int i=0;i<n;i++) {
			
			array[i]=sc.nextInt();
		}
		
		displayarray(array); // before
		bubbleSort(array);
		displayarray(array); // after
	}

	private static void displayarray(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i:array) {
			System.out.print(i+" ");
		} 
		System.out.println();
	}

	private static void bubbleSort(int[] array) {
		// TODO Auto-generated method stub
		
		int n=array.length;
		boolean swapped; 
		
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					swapped=true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}

}
