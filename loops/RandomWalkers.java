/* *****************************************************************************
akes two integer command-line arguments r and trials. In each of trials independent experiments, simulate a random walk until the random walker is at Manhattan distance r from the starting point. Print the average number of steps.
 **************************************************************************** */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int steps = 0;
        for (int i = 0; i < trials; i++) {
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
                steps++;
            }
            x = 0;
            y = 0;
        }
        System.out.println("average number of steps = " + ((double) steps / (double) trials));
    }
}

