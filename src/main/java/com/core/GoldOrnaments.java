package com.core;

public class GoldOrnaments extends GoldShop{
	
	public static void main ( String [] args) {
		GoldOrnaments ornaments =new GoldOrnaments();
		ornaments.ring();
		ornaments.bracelet();
		ornaments.goldspoon();
	}
	
	public void goldspoon()
	{
		System.out.println("Gold Spoon");
	}
	
	public void bangles()
	{
		System.out.println("Gold Bangles");
	}

	public void chain()
	{
		System.out.println("Gold Chain");
	}
	
	public void bracelet() {
		// TODO Auto-generated method stub
System.out.println("Gold bracelet");	
	}
}

