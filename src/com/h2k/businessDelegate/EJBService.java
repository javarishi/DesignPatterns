package com.h2k.businessDelegate;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing Done by EJB Service.");
	}

}
