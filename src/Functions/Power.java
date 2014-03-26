package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Power extends BinaryOperator {

    public Power(Function f, Function g) {
        super(f, g);
    }

    @Override
    public Function derivative() {
        return (new Exponent(new Mult(new Ln(f), g))).derivative();
    }

    @Override
    public Double value(Double x) {
        return Math.pow(f.value(x), g.value(x));
    }

    @Override
    public String toString() {
        return String.format("(%s)^(%s)", f.toString(), g.toString());
    }
}
