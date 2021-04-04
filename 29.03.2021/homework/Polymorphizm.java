package albe;

public class Main {
    static void drawFigure(Figure figure){
        figure.draw();
    }

    public static void main(String[] args) {

        Circle figure1 = new Circle();
        Triangle figure2 = new Triangle();
        drawFigure(figure1);
        drawFigure(figure2);
    }
}
interface Figure {
    void draw();
}
class Circle implements Figure {
    public void draw() {
        System.out.println("Circle");
    }
}
class Triangle implements Figure {
    public void draw() {
        System.out.println("Triangle");
    }
}

