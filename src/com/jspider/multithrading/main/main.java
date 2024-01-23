package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.MyThread1;
import com.jspider.multithrading.thread.MyThread2;

public class main {
	public static void main(String args[])
	{
		MyThread1 mythread1=new MyThread1();
		MyThread2 mythread2=new MyThread2();
		Thread thread=new Thread(mythread2);
		thread.start();
		mythread1.start();
		
		
		
	}

}
