package com.core;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="hello";
System.out.println(name.length());
char ch[]=name.toCharArray();
for ( int i=name.length()-1;i>=0;i--)
{
	System.out.print(ch[i]);
}
	}

}
