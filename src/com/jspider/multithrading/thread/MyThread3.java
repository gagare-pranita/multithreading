package com.jspider.multithrading.thread;

public class MyThread3 extends Thread {
	public void run()
	{
//		System.out.println("running the current thread");
		System.out.println("name is:" +getName());
		System.out.println("priority is:" +getPriority());
		
	}

}
