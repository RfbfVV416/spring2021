package albe;
import java.util.concurrent.Callable;
import java.util.function.*;
import java.util.ArrayList;

public class Main {

    ArrayList<String> prod = Shop.products;

    public static void main(String[] args) {
        Shop.products.add("Drawing");
        Shop.products.add("Drawing");
        Shop.products.add("Telephone");
        Shop.products.add("Telephone");

        Consumer<Childrens> consumerAddDraw =  Childrens::addDrawing;
        Consumer<Parents> consumerAddTel = Parents::addTelephone;
        Consumer<Parents> consumerDelDrew = Parents::buyDrawing;
        Childrens child = new Childrens();
        Consumer<String> consumerDelAll = (pr) -> child.buyAll(pr);
    }
}
