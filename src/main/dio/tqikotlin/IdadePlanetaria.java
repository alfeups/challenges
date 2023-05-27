package main.dio.tqikotlin;

import java.util.Scanner;

public class IdadePlanetaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();
        double idadeEmOutroPlaneta = 0.0;

        switch (planeta) {
            case "Marte":
                idadeEmOutroPlaneta = idadeTerrestre / 1.88;
                System.out.println(String.format("Idade equivalente em %s: %.2f anos", planeta, idadeEmOutroPlaneta));
                break;
            case "Venus":
                idadeEmOutroPlaneta = idadeTerrestre / 0.62;
                System.out.println(String.format("Idade equivalente em %s: %.2f anos", planeta, idadeEmOutroPlaneta));
                break;
            case "Jupiter":
                idadeEmOutroPlaneta = idadeTerrestre / 11.86;
                System.out.println(String.format("Idade equivalente em %s: %.2f anos", planeta, idadeEmOutroPlaneta));
                break;
            case "Urano":
                System.out.println("Planeta invalido.");
                break;
        }
        scanner.close();
    }
}