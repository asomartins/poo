package Ex_09;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque = 0;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void comprar(int quantidade) {
        this.quantidadeEstoque+= quantidade;
        System.out.println("Estoque atualizado com sucesso. Quantidades adicionadas: "+quantidade);
        exibirEstoque();
    }

    public void vender(int unidades) {
        if (quantidadeEstoque >= unidades) {
            this.quantidadeEstoque -= unidades;
            System.out.println("Estoque atualizado com sucesso. Quantidades vendidas: "+unidades);
        }
        else {
            System.out.println("Estoque insuficiente para esta operação. Operação: Venda de "+unidades+" unidades");
        }

        exibirEstoque();
    }

    public void exibirEstoque() {
        System.out.println("Estoque atual: "+this.quantidadeEstoque);
    }
}
