package main.tests;

import java.util.Scanner;

public class AnoSeculo {

        public static void main (String[]args)  {
            Scanner sc = new Scanner(System.in);

            int ano, seculo;

            while (sc.hasNext()) {
                ano = sc.nextInt();
                seculo = (ano / 100) + 1;
                System.out.println(seculo);

            }
        }
    }

