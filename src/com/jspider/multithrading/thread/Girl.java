package com.jspider.multithrading.thread;

import com.jspider.multithreading.resource.Sandle;

public class Girl  extends Thread{
	private Sandle sandle;
	public Girl(Sandle sandle)
	{
		this.sandle=sandle;
		
	}
	public void  run()
	{
		sandle.orderdSandle(3);
		
	}

}
