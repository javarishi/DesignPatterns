package com.h2k.facade;

import com.h2k.factory.Shape;
import com.h2k.factory.ShapeFactory;

public class ShapeMakerFacade {
	
	 private  ShapeFactory factory = null;

   public ShapeMakerFacade() {
       factory = new ShapeFactory();
   }

   public void drawCircle(){
	   factory.getShape(Shape.CIRCLE).draw();  
   }
   public void drawRectangle(){
	   factory.getShape(Shape.RECTANGLE).draw();
   }
   public void drawSquare(){
	   factory.getShape(Shape.SQUARE).draw();
   }

}
