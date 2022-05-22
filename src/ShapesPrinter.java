import java.util.List;

public class ShapesPrinter {
    // private AreaCalculator areaCalculator = new AreaCalculator();// depends on actual concrete class

    // Dependency Injection
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    // Instead of depending on concrete, we depend on abstraction.

    // print result of sum as a json object
    public String json(List<Shape> shapes) {
        String res = String.format("{shapesSum: %s}", Integer.toString(areaCalculator.sum(shapes)));
        return res;
    }

    // print result of sum as csv
    public String csv(List<Shape> shapes) {
        String res = String.format("shapes_sum, %s", Integer.toString(areaCalculator.sum(shapes)));
        return res;
    }
}
