/* *****************************************************************************
Generalized harmonic numbers. Write a program GeneralizedHarmonic.java that takes
two integer command-line arguments n and r and uses a for loop to compute the nth
generalized harmonic number of order r, which is defined by the following formula:



Note: you may assume that n is a positive integer.
The generalized harmonic numbers are closely related to the Riemann zeta function,
which plays a central role in number theory.
 **************************************************************************** */
public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (1 / Math.pow(i, r));
        }
        System.out.print(sum);
    }
}
