package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.Dominose;
import com.jspider.multithrading.thread.Friends;
import com.jspider.multithreading.resource.Pizza;

public class PizzaMain {
	public static void main(String args[])
	{
		Pizza pizza=new Pizza();
		Friends friend=new Friends(pizza);
		Dominose dominose=new Dominose(pizza);
		friend.start();
		dominose.start();
	
		
	}

}
