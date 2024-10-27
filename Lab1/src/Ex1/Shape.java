package Ex1;
// Wersja javy: openjdk 21.0.4 2024-07-16
// Użyta komenda: java --version


// Polecenia użyte do kompilacji i wykonania
// > javac -d . Shape.java
// > java Ex1.Shape

public class Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.print();
    }

    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
