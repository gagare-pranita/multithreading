package com.jspider.multithrading.thread;

import com.jspider.multithreading.resource.Pizza;

public class Dominose  extends Thread{
	private  Pizza pizza;
	public Dominose(Pizza pizza)
	{
		this.pizza=pizza;
		
	}
	public void run()
	{
	pizza.bakePizza(5);
	}

}
