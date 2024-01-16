package Moduuli1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        float avg = (float)(first + second + third) / 3;

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " +(first * second * third));
        System.out.println("The average of the numbers is " + avg);
        //Int type tulostaa ainoastaan kokonaislukuja. Float tai double tulostaa desimaalien kanssa
    }
}
