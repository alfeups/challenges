package main.dio.tqikotlin;

import java.util.Scanner;

public class GerenteLojaGeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = scanner.nextDouble();

        if(media >= 7){
            System.out.println("APR");
        } else if(media > 5 && media < 7){
            System.out.println("MED");
        } else if(media <= 5){
            System.out.println("REP");
        }
    }
}