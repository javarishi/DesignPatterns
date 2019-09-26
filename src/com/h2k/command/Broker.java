package com.h2k.command;

import java.util.LinkedList;


public class Broker {
   private LinkedList<Order> orderList = new LinkedList<>(); 

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
