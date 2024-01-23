package com.jspider.multithrading.thread;

import com.jspider.multithreading.resource.Pizza;

public class Friends extends Thread {
	private Pizza pizza;
	public Friends(Pizza pizza)
	{
		this.pizza=pizza;
		
	}
	public void run()
	{
		pizza.orderdPizza(5);
	}
	
}
