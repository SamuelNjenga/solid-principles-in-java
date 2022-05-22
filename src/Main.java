import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator(); // One implementation of it
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Shape cube = new Cube();
        Rectangle rectangle = new Rectangle();
        Shape noShape = new NoShape();
        System.out.println(square instanceof Shape);
        System.out.println(noShape instanceof Shape);
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + sum);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
