package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Constant implements Function {
    private Double c;

    public Constant(Double c) {
        this.c = c;
    }

    @Override
    public Function derivative() {
        return new Constant(0.0);
    }

    @Override
    public Double value(Double x) {
        return c;
    }

    @Override
    public String toString() {
        return c.toString();
    }
}
