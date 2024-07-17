package com.example.demo;

public class Switch {
    public static void main(String[] args) {
        char number='a';
        //Switch Expression compact form of swith statement same datat type must be returned
        //Some expression necessary is default statement because it must have  a default value of the described data type
        //Normal switch statement does not require any default compulsorily
        String result=switch(number)
        {
            case 'a' -> "One";
            case 'b' -> "two";
            case 'c' -> {System.out.println("Calculation Process");
                yield "three";// yield is used to return value after some other operation here sopln
            }
            default ->"Invalid";
        };
        System.out.println(result);
    }
}
