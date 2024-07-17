package com.example.demo;

public class Main {
    public static void main(String args[])
    {System.out.println("Hello World");
    Main obj1=new Main();
    obj1.main();
    }
    public void main()
    {
        System.out.println("Second main");
        Another obj=new Another();
        obj.ok();
    }
}
