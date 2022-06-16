package main;

import java.util.Scanner;

public class OFilme {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double aumento = ((B - A) / A) * 100.00;

        System.out.printf("%.2f", aumento);
    }
}
