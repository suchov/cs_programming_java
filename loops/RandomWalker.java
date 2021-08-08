/* *****************************************************************************
A Java programmer begins walking aimlessly. At each time step, she takes one step in a random direction (either north, east, south, or west), each with probability 25%. She stops once she is at Manhattan distance r from the starting point. How many steps will the random walker take? This process is known as a two-dimensional random walk.
 **************************************************************************** */
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x = 0;
        int y = 0;
        System.out.println("(" + x + "," + y + ")");
        while ((Math.abs(x) + Math.abs(y)) < r) {
            double random = Math.random();
            if (random <= (double) 1 / 4) {
                // East
                x = x + 1;
            } else if ((double) 1 / 4 < random && random <= (double) 1 / 2) {
                // West
                x = x - 1;
            } else if ((double) 1 / 2 < random && random <= (double) 3 / 4) {
                // North
                y = y + 1;
            } else {
                // South
                y = y - 1;
            }
            System.out.println("(" + x + "," + y + ")");
            steps++;
        }
        System.out.println("steps = " + steps); 
    }
}
