package com.elmiramadadi;

public class Test18 {
    //Will the program terminate normally?
    public static void main(String[] args) {
        int balance = 10;
        while (true){
            if (balance < 9){
                continue;
            }
            balance = balance - 1;
        }
    }
}
