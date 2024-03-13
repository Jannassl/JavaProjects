import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        double mean = Arrays.stream(array).average().orElse(Double.NaN);
        System.out.println("Mean: " + mean);
    }


}