package main.dio.quebecbootcamp;

import java.util.Scanner;

public class ReduzindoNumeroAZero {

    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num >  0 ) {
            if (num % 2 != 0 && num != 0){
                num = num - 1;
                step++;
            }
            if (num % 2 == 0 && num != 0) {
                num /= 2;
                step++;
            }
        }

        if(step >  0) {
            System.out.printf("%d", step);

        } else {
            System.out.printf("%d", step);
        }
    }
}