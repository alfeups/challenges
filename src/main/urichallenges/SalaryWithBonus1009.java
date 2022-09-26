package main.urichallenges;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class SalaryWithBonus1009 {

    public static void main(String[] args) throws IOException {
        Locale US = new Locale ("en","US");
        Scanner sc = new Scanner(System.in);


        String nomeFuncionario = sc.nextLine();
        double salarioFuncionario = sc.nextDouble();
        double vendasFuncionario = sc.nextDouble();

        salarioFuncionario = salarioFuncionario + (vendasFuncionario * 0.15);
        System.out.println(nomeFuncionario);
        System.out.println(salarioFuncionario);
        }

    }
