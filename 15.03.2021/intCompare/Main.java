package com.company;

public class Main {

    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);

        if (integer1 == integer2) System.out.println("равны");
        else System.out.println("не равны");

        int integerUnbox1 = integer1;
        int integerUnbox2 = integer2;
        if (integerUnbox1 == integerUnbox2) System.out.println("равны");
        else System.out.println("не равны");

    }


}

