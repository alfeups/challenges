package main.urichallenges;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AvarageTwo1006 {

    static double peso1 = 2.0;
    static double peso2 = 3.0;
    static double peso3 = 5.0;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float gradeA = sc.nextFloat();
        float gradeB = sc.nextFloat();
        float gradeC = sc.nextFloat();

        double media = (float) (((gradeA * peso1) + (gradeB * peso2) + (gradeC * peso3)) / 10);
        System.out.println(String.format("MEDIA = %,.1f ", media));
    }
}
