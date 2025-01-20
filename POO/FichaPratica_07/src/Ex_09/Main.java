package Ex_09;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Chocolate Lindt ao Leite", 2.45, 4);
        produto.exibirEstoque();
        produto.comprar(5);
        produto.vender(2);
        produto.comprar(10);
        produto.vender(35);
    }
}
