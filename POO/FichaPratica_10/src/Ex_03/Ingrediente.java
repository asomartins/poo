package Ex_03;

public class Ingrediente {
    private int id;
    private String nome;
    public UnidadeMedida unidade;
    private int caloriasPorUnidade;

    //calcularCalorias();


    public Ingrediente(int id, String nome, UnidadeMedida unidade, int caloriasPorUnidade) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.caloriasPorUnidade = caloriasPorUnidade;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidade() {
        return unidade;
    }

    public int getCaloriasPorUnidade() {
        return caloriasPorUnidade;
    }
}
