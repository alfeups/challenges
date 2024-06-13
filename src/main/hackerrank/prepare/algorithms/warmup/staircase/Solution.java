package main.hackerrank.prepare.algorithms.warmup.staircase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Result {

    /*
     * Método que imprime uma escada de tamanho n.
     *
     * O método recebe um parâmetro INTEGER n.
     */
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            // Move para a próxima linha
            System.out.println();
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/hackerhank/warmup/staircase/stdin.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
