package Functions;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public interface Function {
    Function derivative();

    Double value(Double x);
}
