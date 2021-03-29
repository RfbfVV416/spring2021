
package com.company;

public class Main {

    public static void main(String[] args) {

    }
}

interface FurnitureFactory {
    public Oak createOak();
    public Ash createAsh();
}

class CushionedFurniture implements FurnitureFactory{
    @Override
    public Oak createOak(){
        return new CushionedOak();
    }
    @Override
    public Ash createAsh(){
        return new CushionedAsh();
    }
}

class CabinetFurniture implements  FurnitureFactory{
    @Override
    public Oak createOak(){
        return new CabinetOak();
    }
    @Override
    public Ash createAsh(){
        return new CabinetAsh();
    }
}

interface Oak{}

interface Ash{}

class CushionedOak implements Oak{
    public CushionedOak(){
        System.out.println("Create CushionedOak");
    }
}
class CushionedAsh implements Ash{
    public CushionedAsh(){
        System.out.println("Create CushionedAsh");
    }
}
class CabinetOak implements Oak{
    public CabinetOak(){
        System.out.println("Create CabinetOak");
    }
}
class CabinetAsh implements Ash{
    public CabinetAsh(){
        System.out.println("Create CabinetAsh");
    }
}



