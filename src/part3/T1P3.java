package part3;

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

    public static void main(String[] args) {
            Random rand = new Random();
            try {
                File Here = new File("here.txt");
                if (!Here.exists()) {
                    Here.createNewFile();
                }
                int r = rand.nextInt(100)+1;
                FileWriter wr = new FileWriter(Here);
                for (int i = 1; i <= 100; i++) {
                    r = r * i;
                    wr.write("r + rand.nextInt(100)+1)");
                }
                wr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("All Done");
            }
        }
    }
