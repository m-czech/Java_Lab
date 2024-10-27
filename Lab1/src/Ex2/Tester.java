package Ex1;

public class Tester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        ShapeDescriber shapeDescriber = new ShapeDescriber();
        shapeDescriber.describe(rectangle);
    }
}
