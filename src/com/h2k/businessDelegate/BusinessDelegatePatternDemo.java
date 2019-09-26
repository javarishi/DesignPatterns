package com.h2k.businessDelegate;

public class BusinessDelegatePatternDemo {

	 public static void main(String[] args) {

	      BusinessDelegate businessDelegate = new BusinessDelegate();
	      businessDelegate.setServiceType("EJB");

	      // half layer separation
	     //businessDelegate.doTask();
	      
	      
	      Client client = new Client(businessDelegate);
	      client.doTask();

	      businessDelegate.setServiceType("JMS");
	      client.doTask();
	   }

}
