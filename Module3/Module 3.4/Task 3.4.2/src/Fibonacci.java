import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Fibonacci {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i, count = 100;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fibonacci.csv"));

            writer.write(n1 + "," + n2);

            for (i = 2; i < count; ++i)
            {
                n3 = n1 + n2;
                writer.write("," + n3);
                n1 = n2;
                n2 = n3;
            }

            writer.close();
            System.out.println("Fibonacci numbers have been written to fibonacci.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
