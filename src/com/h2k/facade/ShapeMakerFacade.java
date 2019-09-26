package com.h2k.facade;

import com.h2k.factory.Circle;
import com.h2k.factory.Rectangle;
import com.h2k.factory.Shape;
import com.h2k.factory.Square;

public class ShapeMakerFacade {
	
	 private Shape circle;
	 private Shape rectangle;
	 private Shape square;

   public ShapeMakerFacade() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
      
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }

}
