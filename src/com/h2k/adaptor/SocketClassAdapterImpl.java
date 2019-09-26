package com.h2k.adaptor;


public class SocketClassAdapterImpl extends Socket implements SocketAdaptor{ 
 
   @Override
   public Volt get120Volt() { 
       return getVolt(); 
   } 
 
   @Override
   public Volt get12Volt() { 
       Volt v= getVolt(); 
       return convertVolt(v,10); 
   } 
 
   @Override
   public Volt get3Volt() { 
       Volt v= getVolt(); 
       return convertVolt(v,40); 
   } 
   
   public Volt get6Volt(){
	   Volt v = getVolt();
	   return convertVolt(v, 20);
   }
   
     
   public Volt get10Volt(){
	   Volt v = getVolt();
	   return convertVolt(v, 12);
   }
   
   
   private Volt convertVolt(Volt v, int i) { 
       return new Volt(v.getVolts()/i); 
   } 
 
}