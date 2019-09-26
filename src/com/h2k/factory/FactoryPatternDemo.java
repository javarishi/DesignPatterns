package com.h2k.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape(Shape.CIRCLE);
		shape.draw();
		
		shape = factory.getShape(Shape.RECTANGLE);
		shape.draw();
		
		shape = factory.getShape(Shape.SQUARE);
		shape.draw();

		
		
	}

}
