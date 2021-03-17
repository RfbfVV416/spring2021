package com.company;

public class Main {

    public static void main(String[] args) {
        Integer integerAutobox = new Integer(1);
        int integerUnbox = integerAutobox;
        
        if (integerAutobox > integerUnbox) System.out.println(integerAutobox);
        else System.out.println(integerUnbox);

        System.out.println(integerAutobox + integerAutobox);
        System.out.println(integerUnbox + integerUnbox);

    }


}

