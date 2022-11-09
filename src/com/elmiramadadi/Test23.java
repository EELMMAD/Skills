package com.elmiramadadi;

public class Test23 {
    static int value = 10; //static

    public static void main(String[] args) {
        Test23 objectA = new Test23();
        Test23 objectB = new Test23();
        objectA.value += 1;
        System.out.println(objectA.value + objectB.value);   // 11 + 11 = 22
    }
}
