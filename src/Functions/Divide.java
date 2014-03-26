package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Divide extends BinaryOperator {

    public Divide(Function f, Function g) {
        super(f, g);
    }

    @Override
    public Function derivative() {
        return new Divide(new Minus(new Mult(f.derivative(), g),
                new Mult(f, g.derivative())),
                new Power(g, new Constant(2.0))
        );
    }

    @Override
    public Double value(Double x) {
        return f.value(x) / g.value(x);
    }

    @Override
    public String toString() {
        return super.toString('/');
    }
}
