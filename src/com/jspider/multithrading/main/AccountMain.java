package com.jspider.multithrading.main;

import com.jspider.multithrading.thread.Husband;
import com.jspider.multithrading.thread.Wife;
import com.jspider.multithreading.resource.Account;

public class AccountMain {
	public static void main(String args[])
	{
		Account account=new Account(10000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
	}

}