package main.hackerrank;

import java.util.Scanner;

public class JavaIfElse {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n%2==1 || (n>=6 && n <= 20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
        sc.close();
    }
}

