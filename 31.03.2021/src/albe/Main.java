package albe;
import albe.classes.*;
public class Main {

    public static void main(String[] args) {
        A.C nested = new A.C();
        A outer = new A();
        A.B inner = outer.new B();

        Marker marker = new Marker(){ //анонимный класс, переопределяющий метод printHi()
            @Override
            public void printHi(){
                System.out.println("Hi");
            }
        };

        checkMarker(new Marker() { //вызов ф-ии checkMarker и одновр-е переопред printHi с помощью анонимного класса
            @Override
            public void printHi() {
                System.out.println("Hi Marker");
            }
        });
    }

    private static void checkMarker(Marker marker) {

        marker.printHi();
    }
}
