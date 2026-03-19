package com.tns.scannerdemo;

import java.util.Scanner;

public class Persondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		Person obj1 = new Person();
		String name;
		System.out.println("Enter the name:");
		String name1 = obj.next();
		System.out.println(name1);
		System.out.println("Enter the age");
		int age=obj.nextInt();
		System.out.println("Enter the gender");
		String gender=obj.next();
		System.out.println("Enter the tax:");
		int tax = obj.nextInt();
		System.out.println("Enter the income");
		int income=obj.nextInt();
		System.out.println(obj1);

	}

}
