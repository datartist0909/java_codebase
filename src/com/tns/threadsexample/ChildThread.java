package com.tns.threadsexample;

public class ChildThread extends Thread {
	private int n;
	private String msg;
	
	public  ChildThread (int n,String msg) {
		this.n=n;
		this.msg=msg;
	}
	
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.println("Thread got interrupted"+ e.getMessage());
			}
			System.out.println(msg+i+" "+Thread.currentThread().getName());
		}
	}

}
