package com.nt.test;

import java.util.Scanner;

public class ArraySearch {

	public static boolean Search(int[] arr, int item) {
		for (int i : arr) {
			if (item ==i) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean Search(String[] arr, String item) {
		for (String str : arr) {
			if (item == str) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] noArray = {1,2,3,5,7,11,13,17,23,29};
		String[] StringArray = {"ki","I","Ran"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:" );
		int no = sc.nextInt();
		System.out.println("Enter String:");
		String name =sc.next();
		
		System.out.println("This String is: "+Search(StringArray, name));
		System.out.println("This Integer is "+Search(noArray, no));
	}

}
