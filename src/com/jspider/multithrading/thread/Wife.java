package com.jspider.multithrading.thread;

import com.jspider.multithreading.resource.Account;

public class Wife extends Thread{
	Account account;
	public Wife(Account account)
	{
		this.account=account;
	}
	public void run()
	{
		account.deposit(2000);
		account.withDraw(5000);
	}

}
