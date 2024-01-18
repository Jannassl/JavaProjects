import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers in the array: ");
        int number = scanner.nextInt();

        int[] array = new int[number];
        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < number; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maxSumma = Integer.MIN_VALUE;
        int alkuLuku = 0, loppuLuku = 0;

        for (int i = 0; i < number; i++) {
            int nykySumma = 0;

            for (int j = i; j < number; j++) {
                nykySumma += array[j];

                if (nykySumma > maxSumma) {
                    maxSumma = nykySumma;
                    alkuLuku = i;
                    loppuLuku = j;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSumma);
        System.out.println("Subarray indices: " + (alkuLuku + 1) + " - " + (loppuLuku + 1));

        scanner.close();
    }
}

