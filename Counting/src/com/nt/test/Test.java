package com.nt.test;

import java.util.Scanner;

public class Test {

	static void getOccurrence(String data) {
		
		int[] count = new int[256];
		//length of String
		int length =data.length();
		//initialized count array
		for(int i=0; i<length; i++) 
			count[data.charAt(i)]++;
		//create array string sized
			char ch[] = new char[length];
			for(int i=0; i<length; i++) {
				//store char in the array
				ch[i] = data.charAt(i);
				int find = 0;
				for(int j=0; j<=i; j++) {
					//check any matches are found
					if(data.charAt(i)==ch[j]) 
						find++;
				}
	            if (find == 1)  
	                System.out.println("Number of Occurrence of " + 
	                 data.charAt(i) + " is:" + count[data.charAt(i)]); 
			}
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String :");
		String data = sc.nextLine();
		int length =data.length();
		System.out.println("Inserted String : "+data);
		System.out.println("String Length : "+length);
		getOccurrence(data);	
		}
	}

