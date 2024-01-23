package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.Footwear;
import com.jspider.multithrading.thread.Girl;
import com.jspider.multithreading.resource.Sandle;

public class SandleMain {
	public static void main(String args[])
	{
		Sandle sandle=new Sandle();
		Girl girl=new Girl(sandle);
		Footwear footwear=new Footwear(sandle);
		girl.start();
		footwear.start();
		
		}

}
