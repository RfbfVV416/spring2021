package com.company;

public class Main {

    public static void main(String[] args) {
	    A.C nested = new A.C();
	    A outer = new A();
        A.B inner = outer.new B();

        Marker marker = new Marker(){
            @Override
            public void printHi(){
                System.out.println("Hi");
            }
        };
    }
}

interface Marker{
    public void printHi();
}
class A {
    public class B { //inner

    }

    public static class C{ //nested

    }

}