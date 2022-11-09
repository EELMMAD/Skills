package com.elmiramadadi;

public class Test24 {
    public static void main(String[] args) {
        Test24 testObj = new Test24();
        testObj.show(10.56f);
    }

    public void show(int a){
        System.out.println("Method A");
    }

    public void show(double a){
        System.out.println("Method B");
    }

    public void show(float a){
        System.out.println("Method C");
    }
}
