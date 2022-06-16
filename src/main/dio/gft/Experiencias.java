package main.dio.gft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Experiencias {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(input.readLine());
        int s = 0;
        int r = 0;
        int c = 0;

        for (int i = 0; i < N; i++) {
            String info = input.readLine();
            String[] infos = info.split(" ");
            int quantidade = Integer.valueOf(infos[0]);
            char tipo = infos[1].toUpperCase().charAt(0);

            switch (tipo) {
                case 'C':
                    c += quantidade;
                    break;
                case 'R':
                    r += quantidade;
                    break;
                case 'S':
                    s += quantidade;
                    break;
            }
        }

        int total = s + r + c;
        double percentualCoelhos = (c * 100) / (double) total;
        double percentualRatos = (r * 100) / (double) total;
        double percentualSapos = (s * 100) / (double) total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.println(String.format("Percentual de coelhos: %.2f", percentualCoelhos) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", percentualRatos) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", percentualSapos) + " %");
    }

}




