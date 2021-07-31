/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle;

        int min    = Math.min(a, Math.min(b, c));
        int max    = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        // Each integer must be positive
        // The sum of the squares of two of the integers must equal the square of the third integer
        isRightTriangle = a > 0 && b > 0 && c > 0 && (min * min) + (mid * mid) == (max * max);
        System.out.println(isRightTriangle);
    }
}
