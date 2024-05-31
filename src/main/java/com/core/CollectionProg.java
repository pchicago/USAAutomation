package com.core;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.common.collect.Iterators;

public class CollectionProg {

	public static void main(String[] args) {
		// TODO Auto-geSTRINGd method stub
ArrayList<String> al=new ArrayList<String>();
al.add("ram");
al.add("krishna");
al.add("sita");
al.add("gopi");
//System.out.println(al);
System.out.println(al.get(3));
al.add("sita");
System.out.println(al);
System.out.println("printing list values:");
Iterator<String> it = al.iterator();
while (it.hasNext())
{
	System.out.println(it.next());
}
	}

}
