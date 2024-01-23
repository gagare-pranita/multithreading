package com.jspider.multithrading.thread;

import com.jspider.multithreading.resource.Account;

public class Husband extends Thread{
	Account account;
	public Husband(Account account)
	{
		this.account=account;
		
	}
	public void run()
	{
		account.deposit(5000);
		account.withDraw(2000);
	}

}
