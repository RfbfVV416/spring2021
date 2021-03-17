package com.company;
import com.company.Calculator.*;
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator("MyCalc");
        System.out.println(calculator.add(0.5,0.8));
        System.out.println(calculator.subtraction(0.5,0.8));
        System.out.println(calculator.multiplication(0.5,0.8));

        System.out.println(calculator.division(0.5,0)); //Infinity
        System.out.println(calculator.division(4,2)); //2
        System.out.println(calculator.division(4,0)); //error message and Integer.MAX_VALUE
    }
}