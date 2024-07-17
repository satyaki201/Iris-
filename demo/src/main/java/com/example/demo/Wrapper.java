package com.example.demo;
import java.util.ArrayList;
import java.util.List;
public class Wrapper {
public static void main(String args[])
  {List<String>list=new ArrayList<String>();
  List<Integer>second=new ArrayList<Integer>();
  Integer intobj1=10;Integer intobj2=10;
  // in the interger literal pool hence when the no ranges from -128 to 127 it will check from the integer literal pool and if present it won't create another object and reference to that object and beyond that it will create separate object
  Integer intobj3=1000;Integer intobj4=1000;
  //integer object will be immutable just like string
  //Character, Integer,Byte,Short,Double,Boolean,Float, Void are wrapper class
  list.add("Hi"); 
  System.out.println(intobj1);
  System.out.println(intobj1==intobj2);
  System.out.println(intobj3==intobj4);
}
}
