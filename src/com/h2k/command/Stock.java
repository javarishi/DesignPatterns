package com.h2k.command;

public class Stock {
	
	private String name = "ABC";
	private int quantity = 0;
	private int defaultQuantity = 10;
	
	public Stock(int quantity) {
		this.quantity = quantity;
	}
	
	public Stock() {
		this.quantity = defaultQuantity;
	}
	
 
   public void buy(){
      System.out.println("Stock [ Name: "+name+" Quantity: " + quantity +" ] bought");
   }
   
   public void sell(){
      System.out.println("Stock [ Name: "+name+"Quantity: " + quantity +" ] sold");
   }

}
