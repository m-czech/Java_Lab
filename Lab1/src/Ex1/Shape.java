package Ex1;

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
