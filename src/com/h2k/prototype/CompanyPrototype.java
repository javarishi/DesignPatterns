package com.h2k.prototype;

import java.util.HashMap;

public class CompanyPrototype {
	
	private HashMap<String, Company> companyCache = new HashMap<String, Company>();
	
	public Company getCompany(String id){
		if(id != null){
			if(companyCache.containsKey(id)){
				return companyCache.get(id);
			}
		}
		return null;
	}

	
	public void loadCache(){
		Walmart walmart = new Walmart();
		walmart.setId("WalMart");
		companyCache.put(walmart.getId(), walmart);
		
		DeltaAirlines delta = new DeltaAirlines();
		delta.setId("Delta");
		companyCache.put(delta.getId(), delta);
		
	}
	
	
	
}
