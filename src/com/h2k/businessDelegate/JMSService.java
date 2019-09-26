package com.h2k.businessDelegate;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing Done by JMS Service");

	}

}
