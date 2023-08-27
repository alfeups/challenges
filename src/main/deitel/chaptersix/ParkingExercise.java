package main.deitel.chaptersix;

import java.util.Scanner;

/*
Um estacionamento cobra uma tarifa mínima de R$ 2,00 até 3 horas.
Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado após as 3 primeiras horas.
A tarifa máxima para qualquer dado período de 24 horas é R$ 10,00.
Suponha que nenhum carro fique estacionado por mais de 24 horas por vez.
Escreva um aplicativo que calcule e exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem.
Você deve inserir as horas de estacionamento para cada cliente.
O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem.
Ele deve utilizar o método calculateCharges para determinar a tarifa para cada cliente.
*/
public class ParkingExercise {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numClients;

        System.out.print("Quantos clientes estacionaram ontem? ");
        numClients = scan.nextInt();

        double totalRecibos = 0.0;

        for (int i = 1; i <= numClients; i++) {
            System.out.print("Horas estacionadas para o cliente " + i + ": ");
            double hours = Math.ceil(scan.nextDouble());
            //validateParkingHours(hours);

            double result = calculateParkingCharges(hours);
            totalRecibos += result;

            System.out.printf("Cobrança para o cliente %d: R$ %.2f%n", i, result);
        }

        System.out.printf("Total dos recibos de ontem: R$ %.2f%n", totalRecibos);
    }

    public static double calculateParkingCharges(double hours){
        double minCharge = 2.0;
        double maxCharge = 24.0;
        double total = 0;

        if (hours <= 3.0){
            total = minCharge;
        } else if (hours > 3.0 && hours < 24.0) {
            hours -= 3;
            total = (minCharge + (hours * 0.5));
        } else if (hours == 24.0) {
            total = maxCharge;
        }
        return total;
    }

//    private static void validateParkingHours(double hours) throws Exception {
//        if (hours > 24.0) {
//            throw new Exception("Não é permitido estacionar por mais de 24 horas.");
//        }
//    }

}
