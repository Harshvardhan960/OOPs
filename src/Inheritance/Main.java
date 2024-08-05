package Inheritance;

public class Main {

    public static void main(String[] args) {

        Shape trangle = new Trangle(10,5);
        trangle.area();
        trangle.echo();

        Shape square = new Square(10);
        square.area();
        square.echo();
    }
}
