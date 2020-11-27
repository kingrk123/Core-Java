package com.hk.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassDemo {

	public static void main(String[] args) {
		
		//set Creation
		HashSet  hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts  = new TreeSet();
		
		//printing initial size of collection object
		System.out.println("hs size :"+hs.size());
		System.out.println("lhs size:"+lhs.size());
		System.out.println("ts size :"+ts.size());
		
		//Adding Elements to hs
		System.out.println("is 20 added in hs: "+hs.add(Integer.toString(20)));
		System.out.println("is a added in hs:"+hs.add(new Character('a')));
		System.out.println("is b added in hs:"+hs.add(new Character('b')));
		
		System.out.println("is abc added in hs: "+hs.add("abc"));
		System.out.println("is Abc added in hs: "+hs.add("Abc"));
		System.out.println("is abc added in hs: "+hs.add("abc"));
		System.out.println("is abc added in hs: "+hs.add(new String("abc")));
		System.out.println("is Example added in hs: "+hs.add(new Example()));
		System.out.println("is Example added in hs: "+hs.add(new Example()));
		
		
		//Adding null in hs
		System.out.println("is null added in hs: "+hs.add(null));
		System.out.println("is null added in hs: "+hs.add(null));
		System.out.println();
		
		System.out.println("hs size :"+hs.size());
		System.out.println("hs size :"+hs);
		
		
		
		//adding elements in lhs
		System.out.println("is 20 added in lhs: "+lhs.add(Integer.toString(20)));
		System.out.println("is a added in lhs:"+lhs.add(new Character('a')));
		System.out.println("is b added in lhs:"+lhs.add(new Character('b')));
		
		System.out.println("is abc added in lhs: "+lhs.add("abc"));
		System.out.println("is Abc added in lhs: "+lhs.add("Abc"));
		System.out.println("is abc added in lhs: "+lhs.add("abc"));
		System.out.println("is abc added in lhs: "+lhs.add(new String("abc")));
		System.out.println("is Example added in lhs: "+lhs.add(new Example()));
		System.out.println("is Example added in lhs: "+lhs.add(new Example()));
		
		System.out.println("lhs size :"+lhs.size());
		System.out.println("lhs size :"+lhs);
		
		//adding homogeneous element in ts
		System.out.println("is abc added : "+ts.add("abc"));
		System.out.println("is xyz added : "+ts.add("xyz"));
		System.out.println("is bbc added : "+ts.add("bbc"));
		System.out.println("is pqr added : "+ts.add(new String("pqr")));		
		
		//adding null element to ts
	/**	System.out.println("is abc added : "+ts.add(null));
		System.out.println("is abc added : "+ts.add(null));*/
		
		//printing ts modified size and elements
		System.out.println(ts.size());
		System.out.println(ts);
		
		
		

		
	}

}
