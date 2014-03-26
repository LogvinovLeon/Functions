package Functions;

/**
 * Created by Leonid Logvinov on 3/26/14.
 */
public abstract class BinaryOperator implements Function {

    protected Function f, g;

    public BinaryOperator(Function f, Function g) {
        this.f = f;
        this.g = g;
    }

    protected String toString(Character c) {
        return String.format("(%s)%c(%s)", f.toString(), c, g.toString());
    }
}
