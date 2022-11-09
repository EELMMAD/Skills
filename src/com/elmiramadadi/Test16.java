package com.elmiramadadi;

public class Test16 {
    //output of following code
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i < 5){
                System.out.println("before " + i);
                i = i + 1;
                System.out.println("after " + i);
            }
            System.out.println(i + ",");
        }
    }
}
