package com.elmiramadadi;

public class Test9 {
    //Which of the three alternatives will print "Hello "?
    public static void main(String[] args) {
        String str = "Hello World!";

        //Alternative 1
        String alternative_1 = str.substring(0, str.indexOf("W"));
        System.out.println(alternative_1);

        //Alternative 2
        String alternative_2 = str.substring(0, str.length());
        System.out.println(alternative_2);

        //Alternative 3
       String alternative_3 = str.replace("World!", "");
       System.out.println(alternative_3);
    }
}
