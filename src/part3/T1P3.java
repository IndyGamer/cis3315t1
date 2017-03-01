package part3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        BufferedWriter wr = null;
        try {
            File Here = new File("int100.txt");
            if (!Here.exists()) {
                Here.createNewFile();
            }
            wr = new BufferedWriter(new FileWriter(Here));
            for (int i = 1; i <= 100; i++) {
                int r = rand.nextInt(100) + 1;

                //System.out.println("this");
                wr.write(r + System.getProperty("line.separator"));

            }
            wr.close();
        } catch (IOException e) {
        } finally {
            System.out.println("All Done");
        }
    }
}
