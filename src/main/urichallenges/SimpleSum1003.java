package main.urichallenges;

import java.util.Scanner;

public class SimpleSum1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int SOMA = A + B;

        System.out.println(String.format("SOMA = " + SOMA));
    }
}
