package com.example.demo;

public class Tester {
    public static void main(String[] args) {
    Employee list[]=new Employee[3];
    list[0]=new Employee();
    list[1]=new Employee(101,"Saha");
    list[2]=new Employee(103,"swaha");
    for (Employee employee : list) {
        System.out.println(employee);
    }
    }
    
}
