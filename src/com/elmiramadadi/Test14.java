package com.elmiramadadi;

public class Test14 {

}
class Parent{
    public void display(String name){
        System.out.println("Welcome to parent class " + name);
    }

    public void disp(){
        System.out.println("Welcome to Parent class.");
    }
}

class Child{
    public void show(){
        System.out.println("show() method of child class.");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
       // p.disp("Adam");
    }
}

