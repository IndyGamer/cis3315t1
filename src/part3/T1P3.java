package part3;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Write 100 random ints to a text file; one int per line. Use a try with
 * resources and a catch block as needed. Add a finally block that prints the
 * words "All done".
 *
 * @author Your name
 */
public class T1P3 {

    public static void main(String[] args) {
        Random rand = new Random();
        try {
            File Here = new File("100int.txt");
            if (!Here.exists()) {
                Here.createNewFile();
            }
            //try (FileWriter wr = new FileWriter(Here)) {
                for (int i = 1; i <= 100; i++) {
                    int r = rand.nextInt(100) + 1;
                    System.out.println(r);
                    //wr.write(r);
                //}
            }
        } catch (IOException e) {
        } finally {
            System.out.println("All Done");
        }
    }
}
