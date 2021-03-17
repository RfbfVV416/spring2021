package com.company;

public class Main {

    public static void main(String[] args) {
        Count x = new Count();
        Count y = new Count();
    }


}
class Count {
    static int counter = 0;
    static {
        System.out.println("Static Init");
    }
    public Count() {
        System.out.println("Constructor");
    }
    static public void displayCount() {
        counter++;
        System.out.println(counter);
    }
}
