package com.h2k.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Company company = new Company();
		
		HigherManagement mgmt = new HigherManagement();
		StakeHolder stake = new StakeHolder();
		mgmt.setCompany(company);
		stake.setCompany(company);
		
		company.attach(stake);
		company.attach(mgmt);
		
			
		System.out.println("Share Price Drop by $1");	
		company.setNews("Share Price Drop by $1");
		
	    System.out.println("Comapny cancelled Promotions this year");	
	    company.setNews("Comapny cancelled Promotions this year");
		

	}

}
