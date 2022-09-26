package main.urichallenges;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AvarageOne1005 {

    static double peso1 = 3.5;
    static double peso2 = 7.5;


    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double gradeA = sc.nextDouble() * peso1;
        double gradeB = sc.nextDouble() * peso2;

        float media = (float) ((gradeA + gradeB) / (peso1+peso2));
        System.out.println((String.format("MEDIA = %.5f", media)));
    }

}