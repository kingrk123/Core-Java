package com.nt.test;

public class ArrayAverage {

	public static void main(String[] args) {
		int [] no= {
				10,20,30,40,50
		};
		int sum = 0;
		for (int i : no) {
			sum = sum+i;
		}
		double Avg = sum /no.length;
		System.out.println("Sum of Array: "+sum);
		System.out.println("Average Of Array: "+Avg);
	}

}
