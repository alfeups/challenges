package main.urichallenges;

import java.io.IOException;
import java.util.Scanner;

public class Difference1007 {

        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            int diff = ((A*B) - (C*D));

            System.out.print("DIFERENCA = ");
            System.out.println(diff);


        }

    }
