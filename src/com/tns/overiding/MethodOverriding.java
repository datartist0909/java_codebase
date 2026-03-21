package com.tns.overiding;

public class MethodOverriding {

	public static void main(String[] args) {
		RBI rbi;
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		// TODO Auto-generated method stub

	}

}
