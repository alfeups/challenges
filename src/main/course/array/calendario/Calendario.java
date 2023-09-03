package main.course.array.calendario;

public class Calendario {

    public static void main(String[] args) {
        String mes = Calendario.obterMes(11);

        System.out.println(mes);
    }

    static String obterMes(int numeroMes){
        String[] meses = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[numeroMes - 1];
    }

//    static String obterNomeMes(int numeroMes) {
//        return switch (numeroMes) {
//            case 1 -> "Janeiro";
//            case 2 -> "Fevereiro";
//            case 3 -> "Março";
//            case 4 -> "Abril";
//            case 5 -> "Maio";
//            case 6 -> "Junho";
//            case 7 -> "Julho";
//            case 8 -> "Agosto";
//            case 9 -> "Setembro";
//            case 10 -> "Outubro";
//            case 11 -> "Novembro";
//            case 12 -> "Dezembro";
//            default -> null;
//        };
//    }

}
