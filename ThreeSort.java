public class ThreeSort { 
    public static void main(String[] args) { 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // compute stats
        int min    = Math.min(a, Math.min(b, c));
        int max    = Math.max(a, Math.max(b, c));
	    // add all 3 and substract max and min
        int median = a + b + c - min - max;

        // print stats
        System.out.println("Minimum -> " + min);
        System.out.println("Median -> " + median);
        System.out.println("Maximum -> " + max);
    }
}
