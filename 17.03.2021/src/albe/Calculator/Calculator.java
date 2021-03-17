package com.company.Calculator;

public class Calculator {
    public String Name;
    public Calculator(String n){
        this.Name = n;
    }

    public double add(double a, double b){
        return a + b;
    }
    public double subtraction(double a, double b){
        return a - b;
    }
    public double multiplication(double a, double b){
        return a * b;
    }
    public double division (double a, double b){
        return a / b;
    }
    public int division (int a, int b){
        try {
            return a / b;
        }
        catch(ArithmeticException ex) {
            System.out.println("a = " + a + " b = " + b + " " + ex.getMessage());
            return Integer.MAX_VALUE;
        }
    }

}
