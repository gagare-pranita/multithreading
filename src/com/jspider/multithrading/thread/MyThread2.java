package com.jspider.multithrading.thread;

public class MyThread2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println(" mytread2 running current thread");
		}
		
	}

}
