package Ex_03;

import Ex_01.Aviao;

import java.util.ArrayList;

public class Pizza {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    public TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> ingredientes;

    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizza tamanho, ArrayList<IngredientePizza> ingredientes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientePizza>();
    }

    public void adicionarIngrediente(IngredientePizza ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void removerIngrediente(IngredientePizza ingrediente) {
        this.ingredientes.remove(ingrediente);
    }

    public void editarIngrediente(IngredientePizza ingrediente) {

    }

    public void imprimirDescricao() {
        for(int i = 0; i < ingredientes.size() ; i++) {
            IngredientePizza ingredienteAtual = this.ingredientes.get(i);
        }
    }
}
