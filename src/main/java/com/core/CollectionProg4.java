package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs= new HashSet<String>();
hs.add("a");
hs.add("b");
hs.add("c");
hs.add("d");
hs.add("e");
System.out.println(hs);

hs.add("f");
hs.add("c");
hs.add("c");
hs.add("g");
System.out.println(hs);
System.out.println("Print list values");

Iterator<String> it= hs.iterator();
while (it.hasNext())
{
	System.out.println(it.next());
}

	}

}
