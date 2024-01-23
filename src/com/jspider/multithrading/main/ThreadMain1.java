package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.MyThread1;

public class ThreadMain1 {
	public static void main(String args[])
	{
		MyThread1 thread =new MyThread1();
		thread.start();
	}

}
