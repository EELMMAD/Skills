package com.elmiramadadi;

public class Test19 {
    //Output of the code?
    public static void main(String[] args) {
        boolean isRetired = true;
        boolean isValid = false;
        int age = 64;

        if(!(isRetired || !isValid) && age < 65){
            System.out.print("1");
        }

        if((!isRetired || !isValid) && age >18){
            System.out.print("2");
        }

        if(isRetired || (!isValid && age > 65)){
            System.out.print("3");
        }

    }
}
//23
