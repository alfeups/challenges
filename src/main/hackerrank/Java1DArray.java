package main.hackerrank;


import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int index = 0; index < n; index++){
            a[index]= scan.nextInt();
        }

        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}