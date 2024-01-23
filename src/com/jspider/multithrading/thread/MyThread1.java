package com.jspider.multithrading.thread;

public class MyThread1 extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("mythread1  runnin the current thread");
		}
		
	}
	

}
