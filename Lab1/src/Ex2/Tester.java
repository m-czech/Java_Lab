package Ex2;

public class Tester {
    public static void main(String[] args) {
        ShapeDescriber shapeDescriber = new ShapeDescriber();

        Shape rectangle = new Rectangle(2, 3);
        Shape triangle = new Triangle(2, 2, 3, 4);

        shapeDescriber.describe(rectangle);
        shapeDescriber.describe(triangle);
    }
}
