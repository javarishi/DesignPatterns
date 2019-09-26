package com.h2k.factory;

public class ShapeFactory {

	//use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase(Shape.CIRCLE)){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase(Shape.RECTANGLE)){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase(Shape.SQUARE)){
	         return new Square();
	      }
	      
	      return null;
	   }
	
	
}
