package albe;

public class Parents {
    Parents(){

    }

    public void addTelephone(){
        Shop.products.add("Telephone");
    }

    public void buyDrawing(){
        Shop.products.remove("Drawing");
    }

}
