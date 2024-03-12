import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(8);
        integerList.add(20);
        integerList.add(15);
        integerList.add(3);
        integerList.add(12);

        integerList.removeIf(number -> number % 2 == 0);
        integerList.replaceAll(number -> number * 2);




        for (Integer number : integerList) {
            System.out.println(number);
        }
        final int[] sum = {0};
        integerList.forEach(number -> sum[0] += number);

        for (Integer number : integerList) {
            System.out.println(number);
        }


        System.out.println("Sum: " + sum[0]);


    }




}
