package org.example;

public class Rectangle extends Shape {
    public float height;
    public float width;

    public Rectangle(float height, float width, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }
}
