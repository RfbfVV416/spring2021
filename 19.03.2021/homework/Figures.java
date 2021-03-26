package com.company;

public class Main {

    public static void main(String[] args) {

    }
}

class Figure{
    protected double figureShape;
    protected double s;

    Figure(double figureShape){
        this.figureShape = figureShape;
    }

    public double getFigureShape() {
        return figureShape;
    }
    public void setFigureShape(double figureShape) {
        this.figureShape = figureShape;
    }

    public double getS(){
        return s;
    }

    protected void calculateS(){
        System.out.println("Result of calculating: ");
    }
}

class Triangle extends Figure{
    //private double figureShape;
    //protected double s;
    int height;
    int base;

    Triangle(double figureShape, int height, int base){
        super(figureShape);
        this.height = height;
        this.base = base;
    }
    @Override
    protected void calculateS(){
        super.calculateS();
        s = 0.5*height*base;
    }
}

class Rectangular extends Figure{
    int a;
    int b;
    Rectangular(double figureShape, int a, int b){
        super(figureShape);
        this.a = a;
        this.b = b;
    }
    @Override
    protected void calculateS(){
        super.calculateS();
        s = a*b;
    }

}

class Square extends Figure{
    int a;
    Square(double figureShape, int a){
        super(figureShape);
        this.a = a;
    }
    @Override
    protected void calculateS(){
        super.calculateS();
        s = Math.pow(a, 2);
    }
}

class Circle extends Figure{
    int r;
    Circle(double figureShape, int r){
        super(figureShape);
        this.r = r;
    }
    @Override
    protected void calculateS(){
        super.calculateS();
        s = Math.PI * Math.pow(r, 2);
    }
}


