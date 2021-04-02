package albe;

public class Childrens {
    Childrens(){

    }

    public void addDrawing(){
        Shop.products.add("Drawing");
    }
    public void buyAll(String product){
        if (Shop.products.contains(product)) {
            for (String el: Shop.products){
                if (el == product){
                    Shop.products.remove(el);
                }
            }
        }
    }
}
