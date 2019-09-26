package com.h2k.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		CompanyPrototype prototype = new CompanyPrototype();
		prototype.loadCache();
		
		Walmart walmart = (Walmart) prototype.getCompany("WalMart");
		walmart.complexLogicOfMakingCompany();
		DeltaAirlines airline = (DeltaAirlines) prototype.getCompany("Delta");
		airline.complexLogicOfMakingCompany();
		
		
		Company bestBuy = (Company) walmart.clone();
		bestBuy.setId("BestBuy Inc.");
		bestBuy.complexLogicOfMakingCompany();
		
		Company americanAirline = (Company) airline.clone();
		americanAirline.setId("american");
		americanAirline.complexLogicOfMakingCompany();

	}

}
