package com.h2k.prototype;

public class Walmart extends Company {
	
	public Walmart() {
		System.out.println( " Walmart Constructor");
	}
	
	
	@Override
	public void complexLogicOfMakingCompany() {
		System.out.println("Complex Logic of creating retailer Rules " + getId());

	}

}
