package com.tns.genericsex;

public class GenericMethod {
	public static <E> void displayArrayElements(E [] arr) {
		for(E k: arr) {
			System.out.println("element is " +k);
		}
	}

}
