import java.io.*;
import java.util.*;

public class MonomialFactorisation {
    public static void main(String[] args) {
        System.out.println("Enter desired quadratic in the form x^2 [int 2] x + [int 3]");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("x^2 + ");
        int coeff2 = scanner.nextInt(); 
        System.out.println("x + ");
        int coeff3 = scanner.nextInt(); 
        System.out.println("Your Quadratic is x^2 + " + coeff2 + " x + " + coeff3);
        System.out.println("The multiples of " + coeff3 + " are and their sums are:");
        ArrayList<factorPair> factors = new ArrayList<>();

        boolean found = false;
        factorPair thePair = new factorPair(0, 0);
        factors = generateFactors(coeff3);
        for (factorPair p: factors) {
            int sum = p.getFactor1() + p.getFactor2();
            System.out.println(p.getFactor1() + " + " + p.getFactor2() + " = " + sum);
            if (sum == coeff2) {
                found = true;
                thePair = p;
            }
        }

        if (found) {
            System.out.println("Since " + thePair.getFactor1() + " + " + thePair.getFactor2() + " = " + coeff2 + ", they are the terms we will use in the factorised form");
            System.out.println("x^2 + " + coeff2 + " x + " + coeff3 + " can be written as: (x + " + thePair.getFactor1() + ")(x + " + thePair.getFactor2() + ")");
            System.out.println("verifying this by expanding: (x + " + thePair.getFactor1() + ")(x + " + thePair.getFactor2() + ") = x^2 + " + thePair.getFactor1() +
                                "x + " + thePair.getFactor2() + "x + " + thePair.getProduct());
            System.out.println("Collecting the x terms:      (x + " + thePair.getFactor1() + ")(x + " + thePair.getFactor2() + ") = x^2 + " + coeff2 + " x + " + coeff3);
            System.out.println("Thus, x^2 + " + coeff2 + " x + " + coeff3 + " = (x + " + thePair.getFactor1() + ")(x + " + thePair.getFactor2() + ")");
        } else {
            System.out.println("this quadratic cannot be factorised using simple methods");
        }
    }
    public static ArrayList<factorPair> generateFactors(int num) {
        ArrayList<factorPair> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factorPair factor = new factorPair(i,num / i);
                factors.add(factor);
            }
        }
        return factors;
    }   
}
