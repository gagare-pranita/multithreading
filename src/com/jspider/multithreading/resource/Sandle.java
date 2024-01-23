package com.jspider.multithreading.resource;

public class Sandle {
	private int Avaliablesandle=1;
	private String sandledColor="white";
	public synchronized void orderdSandle(int orderd)
	{
		System.out.println("trying to get  the sandle");
		if(Avaliablesandle<orderd)
		{
		System.out.println(orderd  +"ored sandle it will be not avaliable you will be please wait");
		try {
			this.wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		Avaliablesandle-=orderd;
		System.out.println("get the sandle" +orderd);
		System.out.println("avaliablesandle " +Avaliablesandle);
	}
	
		
		public synchronized void factory(int forderd)
		{
	
			Avaliablesandle+=forderd;
			System.out.println("oreder sanlde :=" +forderd);
			System.out.println("avalainblesanlde" +Avaliablesandle);
	this.notifyAll();
		}
			
	}


