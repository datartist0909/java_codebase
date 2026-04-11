package com.tns.genericsex;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> obj = new GenericClass<>();
		obj.setData("Hello");
		System.out.println(obj.getData());
		
		GenericClass<Integer> obj1 = new GenericClass<>();
		obj1.setData(50);
		System.out.println(obj1.getData());

	}

}
