package com.company;

public class Main {

    public static void main(String[] args) {
        Earth earth1 = new Earth();
        System.out.println(Earth.getInstance());
        Earth earth2 = new Earth();
        System.out.println(Earth.getInstance());
    }
}

class Earth {


   public static Earth instance;

   Earth(){

   }

   public static Earth getInstance(){
       if (instance == null) instance = new Earth();
       return instance;
   }
}


