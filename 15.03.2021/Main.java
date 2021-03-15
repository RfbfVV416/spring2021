package com.company;

public class Main {

    public static void main(String[] args) {
        Count x = new Count();
        x.displayCount();
        Count y = new Count();
        y.displayCount();
    }


}
class Count {
    static int counter = 0;

    public Count() {
        counter++;
    }

    public void displayCount() {
        System.out.println(counter);
    }
}
