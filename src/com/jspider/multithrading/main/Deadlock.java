package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.Thread1;
import com.jspider.multithrading.thread.Thread2;
import com.jspider.multithreading.resource.Resource;

public class Deadlock {
	public static void main(String args[])
	{
		Resource resource=new Resource();
		Thread1 thread1=new Thread1(resource);
		Thread2 thread2=new Thread2(resource);
		thread1.setName("T1");
		thread2.setName("T2");
		thread1.start();
		thread2.start();
		
		
	}

}
