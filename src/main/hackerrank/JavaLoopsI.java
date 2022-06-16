package main.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <11; i ++){
            int result = N * i;
            System.out.printf("%d x %d = %d", N, i, result);
            System.out.printf("\n");
        }

        bufferedReader.close();
    }
}
