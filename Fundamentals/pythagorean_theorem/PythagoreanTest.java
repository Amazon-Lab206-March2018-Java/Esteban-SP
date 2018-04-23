import java.io.Console;

/**
 * PythagoreanTest
 */
public class PythagoreanTest {

    public static void main(String[] args) {
        Pythagorean callPythagorean = new Pythagorean();
        Double hypotenuse = callPythagorean.calculateHypotenuse(4, 6);
        System.out.println(hypotenuse);
    }
}