package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.MyThread2;

public class ThreadMain2 {
	public static void main(String args[])
	{
		MyThread2 mythread2=new MyThread2();
		Thread thread= new Thread(mythread2);
		thread.start();
		
	}

}
