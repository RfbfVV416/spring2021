package com.company;

public class Main {

    public static void main(String[] args) {

    }
}

interface Movable{
   void move();
   void fill();
}

class Car implements Movable{
    public void move(){
        System.out.println("Car is riding");
    }
    public void fill(){
        System.out.println("You filled up the car");
    }
}

class Plane implements Movable{
    public void move(){
        System.out.println("Plane is flying");
    }
    public void fill(){
        System.out.println("You filled up the plane");
    }
}

class ElectricCar extends Car{
    @Override
    public void move(){
        System.out.println("Electric car is riding");
    }

    @Override
    public void fill(){
        System.out.println("You filled up the electric car");
    }
}




