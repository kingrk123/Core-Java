package com.nt.test;

import java.util.Arrays;

public class Array_Sort {

	public static void main(String[] args) {
		int[] intNumber = {
				10,19,16,2
		} ;
		
		String[] Str = {
			"Java", "Python", "C", "JavaScript"	
		};
		
		System.out.println("ToString: "+Arrays.toString(intNumber));
		Arrays.sort(intNumber);
		System.out.println("sorted: "+Arrays.toString(intNumber));
		
		System.out.println("ToString : "+Arrays.toString(Str));
		Arrays.sort(Str);
		System.out.println("Sorted: "+ Arrays.toString(Str));
	}

}
