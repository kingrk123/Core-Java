package com.nt.test;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int[] AddNumber = {
				10, 20, 30, 40
		}; 
		String[] AddString = {
				"KI", "NG", "RK"
		};
		int sum = 0; 
		String Add = "";
		for (int i : AddNumber) {
			sum +=i;
		}
		System.out.println(sum);
		
		for (String str : AddString) {
			 Add +=str;
		}
		System.out.println(Add);
	}

}
