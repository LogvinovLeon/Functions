package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Ln extends UnaryOperator {

    protected Ln(Function argument) {
        super(argument);
    }

    @Override
    public Function derivative() {
        return new Divide(argument.derivative(), argument);
    }

    @Override
    public Double value(Double x) {
        return Math.log(x);
    }

    @Override
    public String toString() {
        return String.format("ln(%s)", argument);
    }
}
