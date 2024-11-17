package org.example;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
