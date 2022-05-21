import java.util.List;

public class ShapesPrinter {
    // print result of sum as a json object
    public String json(int sum) {
        String res = String.format("{shapesSum: %s}", Integer.toString(sum));
        return res;
    }

    // print result of sum as csv
    public String csv(int sum) {
        String res = String.format("shapes_sum, %s", Integer.toString(sum));
        return res;
    }
}
