package com.jspider.multithrading.thread;

import com.jspider.multithreading.resource.Sandle;

public class Footwear extends Thread {
	private Sandle sandle;
	public Footwear(Sandle sandle)
	{
		this.sandle=sandle;
	}
	public void run() {
		sandle.factory(3);
	}

}
