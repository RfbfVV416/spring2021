package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle();
	Figure figure = new Figure();

	System.out.println(figure.getShape());
	System.out.println(figure.getNumOfCorners());

	System.out.println(triangle.getShape());
	System.out.println(triangle.getNumOfCorners());
    }
}

class Figure {
    String shape = "none";

    int numOfCorners = 0;

    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    public int getNumOfCorners() {
        return numOfCorners;
    }

    public void setNumOfCorners(int numOfCorners) {
        this.numOfCorners = numOfCorners;
    }

}

class Triangle extends Figure{
    String shape = "none";
    int numOfCorners = 0;

    public String getShape() {
        return shape;
    }
}
