package com.h2k.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		 ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

	     shapeMaker.drawCircle();
	     shapeMaker.drawRectangle();
	     shapeMaker.drawSquare();	

	}

}
