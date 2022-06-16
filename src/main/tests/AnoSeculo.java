package main.tests;

import java.util.Scanner;

public class AnoSeculo {

        public static void main (String[]args)  {
            //a classe Scanner auxilia na leitura dos dados de entrada
            Scanner sc = new Scanner(System.in);

            int ano, seculo;

            // hasNext é um método da classe Java Scanner que retorna true se tiver outra entrada
            while (sc.hasNext()) {
                ano = sc.nextInt();
                seculo = (ano / 100) + 1;
                System.out.println(seculo);

            }
        }
    }

