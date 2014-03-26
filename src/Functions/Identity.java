package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Identity extends Variable {
    @Override
    public Function derivative() {
        return new Constant(1.0);
    }

    @Override
    public Double value(Double x) {
        return x;
    }

    @Override
    public String toString() {
        return "x";
    }
}
