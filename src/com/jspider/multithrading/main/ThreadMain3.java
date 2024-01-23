package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.MyThread3;

public class ThreadMain3 {
	public static void main(String args[])
	{
		MyThread3 mythread3=new MyThread3();
//		System.out.println("name of the thread is:" +mythread3.getName());
//		System.out.println("priority of the thread is:" +mythread3.getPriority());
		mythread3.setName("thread3");
		mythread3.setPriority(1);
		
		mythread3.start();
		
	}

}
