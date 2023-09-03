package main.course.array.restaurante;

public class ItemCardapio {

    String descricao;

    double preco;

    @Override
    public String toString() {
        return "Descrição: " + descricao + ", Preço: " + preco;
    }

    public ItemCardapio(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public ItemCardapio() {};

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

