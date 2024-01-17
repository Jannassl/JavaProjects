package Moduuli1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MeasurmentUnits {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grams: ");
        int grams = Integer.parseInt(scanner.nextLine());
        double luoti = 13.28;
        double naula = luoti * 32;
        double leiviska = 20 * naula;

        double jakoLeiviska = grams / leiviska;
        int intJakoLeiviska = (int)jakoLeiviska;
        double remaining = grams - (intJakoLeiviska * leiviska); //Remaining toimii.

        double jakoNaula = remaining / naula;
        int intJakoNaula = (int)jakoNaula;
        double remaining2 = remaining -(intJakoNaula * naula);

        double jakoLuoti = remaining2 / luoti;
        DecimalFormat luodit = new DecimalFormat("###,##");

        System.out.println(intJakoLeiviska+" Leiviskää");
        System.out.println(intJakoNaula + " nauloja");
        System.out.printf("%.2f\n",jakoLuoti);

        System.out.printf("%d grams is %d leiviskä, %d naula and %.2f luoti",grams,intJakoLeiviska,intJakoNaula,jakoLuoti);







    }
}
