package main.course.array.restaurante;

public class Principal {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        ItemCardapio item1 = new ItemCardapio("Rib Eye 500g", 95);
        ItemCardapio item2 = new ItemCardapio("Picanha 400g", 102);
        ItemCardapio item3 = new ItemCardapio("Batata frita 300g", 12);

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);
        cardapio.imprimirItensCardapio(0, 150);
        cardapio.removerItem(0);
        System.out.println("---");
        cardapio.imprimirItensCardapio(0, 150);
    }
}
