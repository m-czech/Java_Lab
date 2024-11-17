package Ex2;

// Polecenia użyte do kompilacji i wykonania
// > javac -d . Shape.java
// > java Ex1.Ex1.Shape

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
