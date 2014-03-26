package Functions;

/**
 * Created by Leonid Logvinov on 3/26/14.
 */
public abstract class UnaryOperator implements Function {

    protected Function argument;

    protected UnaryOperator(Function argument) {
        this.argument = argument;
    }
}
