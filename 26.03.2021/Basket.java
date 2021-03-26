package com.company;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

public class Main {

    public static void main(String[] args) {
     Apple [] a = new Apple[3];
     Basket basket = new Basket(a);
     System.out.println(basket.calculateBasketItems());


    }
}

class Basket <T> {


    private T[] basketItems;

    Basket(T[] basketItems){
        this.basketItems = basketItems;
    }
    public T[] getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(T[] basketItems) {
        this.basketItems = basketItems;
    }

    int calculateBasketItems(){
        int counter = 0;
        for(Object elem : basketItems){
           if (elem != null) counter++;
        }
        return counter;
    }

}

class Apple {
    Apple(){

    }
}

class Orange{
    Orange(){

    }
}

class Grapes{
    Grapes(){

    }
}
