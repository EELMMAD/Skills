package com.elmiramadadi;

public class Test15 {
    //What does the data type boolean and the class Boolean hold as a default values is assigned at creation?

    private boolean b1;
    private Boolean b2;

    public static void main(String[] args) {
        Test15 t = new Test15();
        System.out.println(t.b1); //false
        System.out.println(t.b2); //null
    }
}
