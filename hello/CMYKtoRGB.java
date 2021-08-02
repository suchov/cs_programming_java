/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1.0 - black;
        double red = 255 * white * (1.0 - cyan);
        double green = 255 * white * (1.0 - magenta);
        double blue = 255 * white * (1.0 - yellow);

        System.out.println("red   = " + (int) Math.round(red));
        System.out.println("green = " + (int) Math.round(green));
        System.out.println("blue  = " + (int) Math.round(blue));
    }
}
