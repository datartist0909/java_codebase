package com.tns.threadsexample;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread obj = new ChildThread(5,"hello");
		ChildThread obj1 = new ChildThread(10,"hello Weeeee");
	
		obj.start();
		obj1.start();
	
		
		System.out.println(".........End main.............");
		
		// TODO Auto-generated method stub

	}

}
