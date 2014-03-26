package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Exponent extends UnaryOperator {

    protected Exponent(Function argument) {
        super(argument);
    }

    @Override
    public Function derivative() {
        return new Mult(this, argument.derivative());
    }

    @Override
    public Double value(Double x) {
        return Math.exp(argument.value(x));
    }

    @Override
    public String toString() {
        return "e^(" + argument + ")";
    }
}
