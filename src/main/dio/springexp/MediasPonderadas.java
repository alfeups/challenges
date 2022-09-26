package main.dio.springexp;

import java.util.*;

public class MediasPonderadas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos){
            var a = Double.parseDouble(input.next()) * 2;
            var b = Double.parseDouble(input.next()) * 3;
            var c = Double.parseDouble(input.next()) * 5;
            var media = ((a + b + c) /10);
            System.out.printf("%.1f\n", media);
            cont++;
        }

    }
}