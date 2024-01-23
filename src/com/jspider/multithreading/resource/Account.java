package com.jspider.multithreading.resource;

public class Account {
	int balance;
	
  public Account(int balance)
	{
		this.balance=balance;
	}
	public int checkBalance()
	{
		return balance;
	}
	
	public  synchronized void deposit(int amount)
	{
		System.out.println("Trying to deposite " +amount+ "Rs");
		balance+=amount;
		System.out.println("deposite successfully");
		System.out.println("account balance:=" +checkBalance());
		
	}
	public  synchronized void   withDraw(int amount)
	{
		System.out.println("trying to withdraw " +amount+ "Rs");
		if(balance>=amount)
		{
			balance-=amount;
		System.out.println("withdraw successfully");
		System.out.println("account balance:=" +checkBalance());
		}
		else
		{
			System.out.println("insufficoent balance");
		}
	}

}
