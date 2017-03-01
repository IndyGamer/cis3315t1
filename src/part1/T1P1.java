package part1;

import java.util.Random;

/**
 * Fill this 20 x 20 int array with random numbers. The numbers should have
 * values between 0 and 99. Then use a nested loop to print out the array row by
 * row with the numbers in evenly spaced columns.
 *
 * @author Your Name Here
 */
public class T1P1 {

    public static void main(String[] args) {
        Random gen = new Random();
        int[][] a = new int[20][20];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < a.length; j++) {
                a[i][j] = gen.nextInt(100) + 1;
                System.out.printf("%5d", a[i][j]);
            }
        }

        System.out.println("");
    }
}
