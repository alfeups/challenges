package main.dio.tqi;

import java.util.Scanner;

public class ProibidoMenores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();                     //numero de pessoas
        String string = scan.nextLine();            //ler proxima linha
        //String[] s = string.split(" ");        //quebra string em várias substrings a partir de um caracter

        double[] idade = new double[N];

        for (int i = 0; i < N; i++) {
            idade[i] = Integer.parseInt(string);
        }


        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++) {
            if ( idade[i] < 18) {
                System.out.println( (int) idade[i]);
            }

        }

    }
}
