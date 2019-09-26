package com.h2k.command;

public class CommandPatternDemo {
	   public static void main(String[] args) {
	      Stock abcStock = new Stock(5);

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);
	      BuyStock buyStockOrder2 = new BuyStock(abcStock);
	      SellStock sellStockOrder2 = new SellStock(abcStock);
	
	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);
	      broker.takeOrder(buyStockOrder2);
	      broker.takeOrder(sellStockOrder2);
	
	      broker.placeOrders();
	   }
	}