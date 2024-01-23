package com.jspider.multithreading.resource;
public class Pizza {
	private int avaliablepizza;
	
public synchronized void orderdPizza(int orderdpizza)
{
	System.out.println("trying to orderd the pizza" );
	if(avaliablepizza<orderdpizza)
	{
		
		System.out.println("pizza are not avalibale you can be wait for further time");
try {
	this.wait();
   }
catch (InterruptedException e) 
{	
	e.printStackTrace();

}
	}
	avaliablepizza-=orderdpizza;
	System.out.println("deliverd pizza" +orderdpizza);
	System.out.println("avalible pizza" +avaliablepizza);
}	
	

public synchronized  void bakePizza(int bakepizza)
{
	System.out.println("trying to baked the pizza");
avaliablepizza+=bakepizza;
System.out.println("baked pizza");
System.out.println("avalible pizza" +avaliablepizza);
this.notifyAll();
}
}

	

