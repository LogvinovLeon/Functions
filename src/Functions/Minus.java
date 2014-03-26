package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Minus extends BinaryOperator {

    public Minus(Function f, Function g) {
        super(f, g);
    }

    @Override
    public Function derivative() {
        return new Minus(f.derivative(), g.derivative());
    }

    @Override
    public Double value(Double x) {
        return f.value(x) - g.value(x);
    }

    @Override
    public String toString() {
        return super.toString('-');
    }
}
