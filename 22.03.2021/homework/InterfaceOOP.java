
package com.company;

public class Main {

    public static void main(String[] args) {
        //наследование: классы Triangle, Rectangular, Square и Circle имплементируют Figure
        //инкапсуляция: поля классов private и доступ к ним через геттеры и сеттеры
        //абстракция: в классах отсутствуют несущественные с точки зрения задачи о расчете площади поля
        //полиморфизм: можем обратиться к экземплярам разных классов через один интерфейс
        Triangle triangle = new Triangle(1, 2);
        Rectangular rectangular = new Rectangular(5, 10);
        triangle.calculateS();
        rectangular.calculateS();
    }
}

interface Figure{
    public double calculateS();
}

class Triangle implements Figure{

    private int height;
    private int base;

    Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }
    public double calculateS(){
        return 0.5*height*base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

}

class Rectangular implements Figure{

    private int a;
    private int b;

    Rectangular(int a, int b){
        this.a = a;
        this.b = b;
    }
    public double calculateS(){
        return a*b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


}

class Square implements Figure{
    private int a;
    Square(int a){
        this.a = a;
    }
    public double calculateS(){
        return Math.pow(a, 2);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class Circle implements Figure{

    private int r;
    Circle(String figureShape, int r){
        this.r = r;
    }
    public double calculateS(){
        return Math.PI * Math.pow(r, 2);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
