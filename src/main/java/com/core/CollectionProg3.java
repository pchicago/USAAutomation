package com.core;

import java.util.HashSet;

public class CollectionProg3 {

	public static void main(String[] args) {

		HashSet<String> HS= new HashSet<String>();
		HS.add("mango");
		HS.add("banana");
		HS.add("strawberry");
		HS.add("pineapple");
		HS.add("apple");
	//	System.out.println(HS);
		
		HS.add("grapes");     
		HS.add("mango");
		HS.add("kiwi");
		System.out.println(HS);
	}
}
