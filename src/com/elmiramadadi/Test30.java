package com.elmiramadadi;

public class Test30 {
    public static void main(String[] args) {
        String car1 = "BMW";
        String car2 = new String("BMW");

        if(car1 == "BMW"){
            System.out.println("CASE 1");
        }

        if(car1 == car2){
            System.out.println("CASE 2");
        }

        if(car2 == "BMW"){
            System.out.println("CASE 3");
        }

        if(car1.equals(car2)){
            System.out.println("CASE 4");
        }
    }
}
