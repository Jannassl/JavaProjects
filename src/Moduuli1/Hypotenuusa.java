package Moduuli1;

import java.util.Scanner;

public class Hypotenuusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna 1. sivun pituus: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Anna 2. sivun pituus: ");
        double secondNumber = scanner.nextDouble();

        double answer1 = Math.pow(firstNumber,2) + Math.pow(secondNumber,2);
        double hypo = Math.sqrt(answer1);

        System.out.printf("Hypotenuusan pituus: %.2f\n", hypo);

    }
}
