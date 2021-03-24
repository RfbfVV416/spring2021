package com.company;

public class Main {

    public static void main(String[] args) {
        Color red = new Color (1, "red");
        Car car1 = new Car(2008, "some", red);
        Car car2 = new Car(2008, "some", red);
       System.out.println(car1.equals(car2));
       if(car1 == car2) System.out.println("true");
       else System.out.println(false);
    }
}
