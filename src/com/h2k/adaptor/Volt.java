package com.h2k.adaptor;


public class Volt { 
 
   private int volts; 
     
   public Volt(int v){ 
       this.volts=v; 
   } 
 
   public int getVolts() { 
	   System.out.println("Voltage :: " + volts);
       return volts; 
   } 
 
   public void setVolts(int volts) { 
       this.volts = volts; 
   } 
     
}