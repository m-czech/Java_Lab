package org.example;

public abstract class Shape {
    public Color Color;
    public abstract double getArea();
    public abstract double getPerimeter();

    public Shape(Color color) {
        this.Color = color;
    }

    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d", this.Color.red(), this.Color.green(), this.Color.blue(), this.Color.alpha());
    }

    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
