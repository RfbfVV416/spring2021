package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Figure{
    private double figureShape;
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

    private int height;
    private int base;

    Triangle(double figureShape){
        super(figureShape);

    }

    @Override
    protected void calculateS(int height, int base){
        s = 0.5 * height * base;
    }


}
