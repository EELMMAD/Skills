package com.elmiramadadi;

import java.util.Locale;

public class Test27 {
    public static void main(String[] args) {
        Test27 testClass = new Test27();
        try{
            testClass.formatToUpperCase(null);
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("finished");
        }
    }


    private String formatToUpperCase(String text) throws Exception{
        String upperCaseString = text.toUpperCase();
        if (text == null){
            throw new IllegalArgumentException();
        }else if(text.startsWith("null")){
            throw new Exception();
        }
        return upperCaseString;
    }
}
