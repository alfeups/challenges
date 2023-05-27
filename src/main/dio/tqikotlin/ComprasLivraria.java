package main.dio.tqikotlin;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class ComprasLivraria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        double valorTotal = livro1.getPreco() * livro1.getQuantidade() + livro2.getPreco() * livro2.getQuantidade();
        int quantidade = livro1.getQuantidade() + livro2.getQuantidade();

        String valorTotalStr = String.format("%.2f", valorTotal);
        String quantidadeStr = Integer.toString(quantidade);

        byte[] valorTotalBytes = valorTotalStr.getBytes(StandardCharsets.ISO_8859_1);
        byte[] quantidadeBytes = quantidadeStr.getBytes(StandardCharsets.ISO_8859_1);
        byte[] mensagemBytes = "Obrigado por comprar na nossa livraria!".getBytes(StandardCharsets.ISO_8859_1);

        String valorTotalISO = new String(valorTotalBytes, StandardCharsets.ISO_8859_1);
        String quantidadeISO = new String(quantidadeBytes, StandardCharsets.ISO_8859_1);
        String mensagemISO = new String(mensagemBytes, StandardCharsets.ISO_8859_1);

        System.out.println("Valor total da compra: " + valorTotalISO);
        System.out.println("Numero de livros comprados: " + quantidadeISO);
        System.out.println(mensagemISO);
    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        public int getQuantidade() {
            return quantidade;
        }

        public double getPreco() {
            return preco;
        }

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}
