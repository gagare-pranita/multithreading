package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.MyThread4;

public class ThreadMain4 {
	public static void main(String args[])
	{
	MyThread4 mythread4=new MyThread4();
	Thread thread=new Thread(mythread4);
	thread.setName("thread3");
	thread.setPriority(2);
	thread.start();
	}

	
			

}
