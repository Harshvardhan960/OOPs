package Inheritance;

public class Trangle extends Shape{

    int b;
    int h;

    Trangle(int b, int h)
    {
        this.b = b;
        this.h = h;
    }

    @Override
    public void area() {
        System.out.println(0.5*b*h);
    }
}
