package com.nt.test;

import java.util.Scanner;

public class String_multiples {
	
	public static void strNoTimes(String str, int n) {
		String result =" ";
		System.out.println("String "+str);
		System.out.println("No "+n);
		for(int i=0; i<=n; i++) {
			result = result+ str;
		}
		 System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  ");
		String str = sc.nextLine();
		System.out.println("Enter No. of Times");
		int n = sc.nextInt();
		
		System.out.println("OutPut Is:");
		strNoTimes(str, n);


	}

}
