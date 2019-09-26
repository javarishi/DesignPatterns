package com.h2k.singleton;

public class SingleObject {
	
	   //create an object of SingleObject
	   private static SingleObject instance = null;

	   //make the constructor private so that this 
	   //class cannot be instantiated from other class
	   private SingleObject(){
		   System.out.println("This is Private Constructor");
		   // Populate HashMap here
	   }

	   //Get the only object available
	   public static synchronized SingleObject getInstance(){
		   if(instance == null){
			   instance = new SingleObject();
		   }
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }

}
