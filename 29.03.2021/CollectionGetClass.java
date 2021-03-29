
package com.company;
import java.util.*;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> integer = new ArrayList<Integer>();
        ArrayList<Cat> cat = new ArrayList<Cat>();
        System.out.println(str.getClass() == integer.getClass());
        System.out.println(str.getClass() == cat.getClass());
        System.out.println(integer.getClass() == cat.getClass());
    }
}


class Cat{

}



