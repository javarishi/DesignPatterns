package com.h2k.observer;

public class StakeHolder extends Observer{
	
	private Company company;
	
	
	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}


	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}


	@Override
	public void update(String news) {
		System.out.println("Thank you StakeHolder received news " + news);
	}

}
