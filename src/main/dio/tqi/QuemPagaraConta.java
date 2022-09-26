package main.dio.tqi;

import java.io.IOException;
import java.util.*;


public class QuemPagaraConta{

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int entrada = input.nextInt();

            if ( entrada % 2 == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        input.close();
    }
}

