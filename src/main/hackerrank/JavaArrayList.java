package main.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = scan.nextInt();
        ArrayList<ArrayList<String>> strWithNumbers = new ArrayList<>();
        ArrayList<ArrayList<String>> finalList = new ArrayList<>();

        for (int linhas = 0; linhas <= numberOfLines; linhas++) {
            String[] linha = scan.nextLine().trim().split(" ");
            strWithNumbers.add(new ArrayList<>(Arrays.asList(linha)));
        }

        strWithNumbers.forEach(arrList -> {
                if (arrList.contains("") ) {
                    arrList.remove(arrList);
                } else {
                    finalList.add(arrList);
                }
        });

        finalList.forEach(arr -> { if(!Objects.isNull(arr) || !(arr.size() > 1)) { arr.remove(0); }});

        int numberOfQueries = scan.nextInt();

        for (int numeroDeQueries = 0; numeroDeQueries < numberOfQueries; numeroDeQueries++) {
            int nLine = scan.nextInt();
            int nColumn = scan.nextInt();

            try {
                String fLista = finalList.stream()
                        .map(e -> finalList.get(nLine - 1).get(nColumn - 1))
                        .findAny()
                        .get();
                System.out.println(fLista);
            } catch (Exception e){
                System.out.println("ERROR!");
            }

        }
    }
}
