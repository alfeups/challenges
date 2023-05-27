package main.dio.tqikotlin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MudancaparaIrlanda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBruto = input.nextDouble();
        double beneficios = input.nextDouble();
        double imposto = 0;
        double salarioLiquido =  0;

        if(salarioBruto > 2500.0) {
            imposto = salarioBruto * 0.15;
            salarioLiquido = (salarioBruto - imposto) + beneficios;

        } else if( (salarioBruto > 1100.0) && (salarioBruto <= 2500.0) ){
            imposto = salarioBruto * 0.1;
            salarioLiquido = (salarioBruto - imposto) + beneficios;

        } else if(salarioBruto < 1100.0) {
            imposto = salarioBruto * 0.05;
            salarioLiquido = (salarioBruto - imposto) + beneficios;
        }
        DecimalFormat decimalFormat = new DecimalFormat("####0.00");
        String formattedSalarioLiquido = decimalFormat.format(salarioLiquido);
        System.out.println(formattedSalarioLiquido);
    }
}