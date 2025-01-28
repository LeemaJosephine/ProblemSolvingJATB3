package day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str1= sc.next();
		String str2 = sc.next();
		
		if(checkAnagram(str1,str2)) {
			
			System.out.println("Anagram");
		} else {
			
			System.out.println("Not Anagram");
		}
	}

	public static boolean checkAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		// sort the array
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// Compare
		
		return Arrays.equals(arr1, arr2);
	}
}
