package com.jspider.multithrading.thread;

public class MyThread4 implements Runnable{
	public void run()
	{
		System.out.println("name is" +Thread.currentThread().getName());
		System.out.println("pripoety is " +Thread.currentThread().getPriority());
		System.out.println("run yhese thread");
	}
	

}
