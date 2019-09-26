package com.h2k.abs.factory;

import com.h2k.factory.Shape;

public abstract  class AbstractFactory {
		abstract Color getColor(String color);
	   abstract Shape getShape(String shape) ;
	}

