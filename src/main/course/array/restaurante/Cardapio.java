package main.course.array.restaurante;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indexExcluir) {
        ItemCardapio[] novoArrCardapio = new ItemCardapio[itens.length - 1];

        if (indexExcluir == 0) {
            System.arraycopy(itens, indexExcluir + 1, novoArrCardapio, 0, novoArrCardapio.length - indexExcluir);
        } else {
            System.arraycopy(itens, 0, novoArrCardapio, 0, indexExcluir);
            System.arraycopy(itens, indexExcluir + 1, novoArrCardapio, 0, novoArrCardapio.length - indexExcluir);
        }
        itens = novoArrCardapio;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        List<ItemCardapio> arrParaPrint = Arrays.stream(itens)
                .filter(item -> item.preco > precoMinimo && item.preco < precoMaximo)
                .collect(Collectors.toList());

        arrParaPrint.forEach(System.out::println);
    }
}
