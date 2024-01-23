package com.jspider.multithrading.thread;

import com.jspider.multithreading.resource.Resource;

public class Thread2 extends Thread {
	Resource resource;
	public  Thread2(Resource resource)
	{
		this.resource=resource;
	}
	public void run()
	{
		synchronized(resource.res2)
		{
			System.out.println(getName() +" apply th lock " +resource.res2);
			synchronized(resource .res1)
			{
				System.out.println(getName() +" Applay the lock " +resource.res1);
			}
			System.out.println(getName() +"Relese th lock" +resource.res1);
			
		}
		System.out.println(getName() +"Relses the lock" +resource.res2);
	}

}
