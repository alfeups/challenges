package main.hackerrank;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        while (testCases > 0) {
            try {
                String pattern = String.valueOf(Pattern.compile(sc.nextLine()));
                System.out.println("Valid");
                testCases--;
            } catch (Exception e) {
                System.out.println("Invalid");
                testCases--;
            }
        }
    }
}