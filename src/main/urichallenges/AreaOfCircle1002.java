package main.urichallenges;

import java.io.IOException;
import java.util.Scanner;

public class AreaOfCircle1002 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double area = 3.14159 * (r*r);

        System.out.println(String.format("A=%.4f", area));
    }
}
