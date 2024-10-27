package Ex1;

// Polecenia użyte do kompilacji i wykonania
// > javac -d . Shape.java
// > java Ex1.Shape

public abstract class Shape {
//    public static void main(String[] args) {
//        Shape shape = new Shape();
//        shape.print();
//    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
