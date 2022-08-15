package com.JavaTask;

public class MyAddress extends Square {
	static void indiaCountry()
	{
		System.out.println("Chennai");
	}

	public static void main(String[] args)
    {
    	MyAddress m=new MyAddress();
    	indiaCountry();
    	m.companyName(1);
    	m.numberLoop();
    	m.name();
    	
    	System.out.println(m.squareSalary(100));
    
    	
    }
}