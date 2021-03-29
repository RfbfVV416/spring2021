
package com.company;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

    }
}

class Account<T extends Comparable, V extends Animal & Serializable, K extends Number>{
    private T id1;
    private V id2;
    private K id3;


    Account(T id1, V id2, K id3){
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
    }

    public K getId3() {
        return id3;
    }
    public V getId2() {
        return id2;
    }
    public T getId1() {
        return id1;
    }

    public void getNames(){
        System.out.println(id1.getClass());
        System.out.println(id2.getClass());
        System.out.println(id3.getClass());
    }

}

class Animal{

}



