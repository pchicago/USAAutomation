package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("banana");
		al.add("strawberry");
		al.add("pineapple");
		al.add("apple");
		System.out.println(al.get(3));
		System.out.println("printing list values:");
		Iterator<String> it = al.iterator();
		while ( it.hasNext())
		{
			System.out.println(it.next());
		}	
		
	}

}
