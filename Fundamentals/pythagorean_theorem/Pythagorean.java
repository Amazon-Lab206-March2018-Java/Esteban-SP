/**
 * Pythagorean
 */
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        double squareLegA = Math.pow(legA, 2);
        double squareLegB = Math.pow(legB, 2);
        double squareRoot = Math.sqrt((squareLegA + squareLegB));
        return squareRoot;
    }

}