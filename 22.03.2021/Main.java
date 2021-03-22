package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle();
	System.out.println(triangle.numOfCorners);
	System.out.println(triangle.shape);

	triangle.setShape("triangle");
	triangle.setNumOfCorners(3);

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
