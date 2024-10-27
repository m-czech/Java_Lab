package Ex2;

public class Triangle extends Shape {
    public float a;
    public float b;
    public float c;
    public float h;
    public Triangle(float a, float b, float c, float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a * h) / 2;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
