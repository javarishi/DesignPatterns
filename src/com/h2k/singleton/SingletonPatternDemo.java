package com.h2k.singleton;

public class SingletonPatternDemo {
	 public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();
		 
		 
		 SingleObject object1 = SingleObject.getInstance();
		 SingleObject object2 = SingleObject.getInstance();
		 
		 object1.showMessage();
		 
		 if(object1.equals(object2)){
			 System.out.println("These are same or equal objects");
		 }
	 
	   }

}
