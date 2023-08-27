package main.book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CalculateBookPrice {

    public static void main(String[] args) throws IOException {
        File fileName = new File("src/ListaLivros");
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> listaDeLivrosEntrada = reader.lines().toList();



        listaDeLivrosEntrada.forEach(livro -> {
            var nomeDoLivro = Arrays.stream(livro.split(",")).toList().get(0).trim();
            var preco = Double.parseDouble(Arrays.stream(livro.split(",")).toList().get(1).replace("R$", "").trim());

            Book book = new Book(nomeDoLivro, preco);

            double precoComDesconto = book.getPrice() - (book.getPrice() * 0.35);

            int menorParcela = findMinimumInstallment(precoComDesconto);
            double valorDeCadaParcela = precoComDesconto / menorParcela;
            double descontoAplicado = preco - precoComDesconto;

            System.out.println(String.format(
                    "Nome do livro: %s\n" +
                    "Preço do livro: %.2f\n" +
                    "Desconto aplicado: %.2f\n" +
                    "Preço com desconto: %.2f\n" +
                    "Menor número de parcelas: %d\n" +
                    "Valor de cada parcela: %.2f\n" +
                            "\r\n",
                    book.getName(), book.getPrice(), descontoAplicado, precoComDesconto, menorParcela, valorDeCadaParcela));

        });

    }

    private static int findMinimumInstallment(double precoComDesconto){
        int minimumInstallment = 50;
        int minimumNumber = (int) Math.floor(precoComDesconto/minimumInstallment);
        return minimumNumber;
    }

}
