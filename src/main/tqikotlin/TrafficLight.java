package main.tqikotlin;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Pare! O sinal esta vermelho.");
                break;
            case 2:
                System.out.println("Atencao! O sinal esta amarelo.");
                break;
            case 3:
                System.out.println("Siga em frente! O sinal esta verde.");
                break;
            case 8:
                System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
                break;
            case -1:
                System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
                break;
            case 0:
                System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
                break;
            //TODO: Crie as condições necessárias para imprimir cada uma das possíveis saídas.
        }
    }
}