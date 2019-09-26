package com.h2k.prototype;

public abstract class Company implements Cloneable {
	 
	private String id;
	protected String type;
	private String name;
	private String taxsAndOtherInfo;
	 
	public abstract void complexLogicOfMakingCompany();
	 
	 
	 public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


}
