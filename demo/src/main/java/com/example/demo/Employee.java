package com.example.demo;

public class Employee {
    Integer id;
    String name;
    Employee()
    {
        System.out.println("Non Prameteraised");
    }
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
        System.out.println("This is a non parametrised constructor with name"+name+"id"+id);
    }

    public String toString(){
        return "Employee[ id " + id + " name " + name + "]";
    }   
}
