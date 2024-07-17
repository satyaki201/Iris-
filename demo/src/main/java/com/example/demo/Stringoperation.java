package com.example.demo;

public class Stringoperation {
    public static void main(String[] args) {
        // java hides and facility to make string object as if it is primitive but it is necessarily an object
        // string is immutable object //concept of string pool
        String h="Hello";//h=h.toUpperCase(); will change the ref
        String h2="Hello"; 
        System.out.println(h==h2);

        String k=new String("trump card");
        String k2=new String("trump card");
        System.out.println(k==k2);

        System.out.println(k.equals(k2));// compare content of the string

        System.out.println(k);
        System.out.println(h);

        //Some essential methods
        //.replace returns a new string and does not change anything in the current string
        //substring(beginindex,endindex) beginindex to endindex-1 not endindex
        //compareTo is compare them in lexographical order
        // isempty->no character  isblank-> white space isnull-> detects null character
        String name="Hi";
        name=name.concat("world");
        // in the above example a new object is created
        //while doing the json we get huge no of unreeferced object hencce
        // To replace all this we are going to use stringbuilder which helps in creating mutable string
        
    }
}
