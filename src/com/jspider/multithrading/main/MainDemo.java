package com.jspider.multithrading.main;

public class MainDemo {
	public static void main(String args[])
	{
		 String str="this is sleep()";
		for(int i=0;i<str.length();i++)
		{
			 
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
		}
	}

}
