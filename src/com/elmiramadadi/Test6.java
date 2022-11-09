package com.elmiramadadi;

public class Test6 {
    int num = 2;
    public void printOut(){
          upgradeValue();
          switch (num) {
              case 1:
                  System.out.println("1");
              case 2:
                  System.out.println("2");
              case 3:
                  System.out.println("3");
              default:
                  System.out.println("4");
          }  
    }

    public void upgradeValue(){
        num++;
    }

    public static void main(String[] args) {
             Test6 t = new Test6();
             t.printOut();       // 3 4
    }
}


