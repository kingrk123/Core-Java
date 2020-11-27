package com.hk.test;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Creating an ArrayList
		ArrayList al = new ArrayList();
		System.out.println("Initial size Of the Array: "+al.size());
		
		//Add Element to the ArrayList
		al.add("Red");
		al.add("Yellow");
		al.add("Green");
		al.add("Cyan");
		
		System.out.println("\nSize of ArrayList after Additions: "+al.size());
		
		//Display the Array 
		System.out.println("Contents of ArrayList After Add: "+al);
		
		//remove 3th index-element from ArrayList
		al.remove(3);
		System.out.println("After remove 3rd Element: "+al);
		
		//Remove "Yellow" from ArrayList
		al.remove("Yellow");
		System.out.println("After remove Yellow from ArrayList: "+al);
		
		//retrieving 1st element
		String strElement = (String)(al.get(0));
		System.out.println("1st Element in ArrayList: "+strElement);
		
		// inserting at  1st index
		al.add(1, "rose");
		System.out.println("Added at first index: "+al);

	}

}
