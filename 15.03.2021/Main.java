package com.company;

public class Main {

    public static void main(String[] args) {
        Count.displayCount();
        Count.displayCount();
        //Count x = new Count();
        //x.displayCount();
        //Count y = new Count();
        //y.displayCount();
    }


}
class Count {
    static int counter = 0;
    public Count() {
    }
    static public void displayCount() {
        counter++;
        System.out.println(counter);
    }
}
