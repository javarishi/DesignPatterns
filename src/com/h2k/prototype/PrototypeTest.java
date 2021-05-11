package com.h2k.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		CompanyPrototype prototype = new CompanyPrototype();
		prototype.loadCache();
		
		Company bestBuy = (Company) prototype.getCompany("retailer").clone();
		bestBuy.setId("BestBuy Inc."); // Change what's different
		bestBuy.complexLogicOfMakingCompany(); // use what's same
		
		Company americanAirline = (Company) prototype.getCompany("airline").clone();
		americanAirline.setId("american"); // Change what's different
		americanAirline.complexLogicOfMakingCompany(); // use what's same

	}

}
