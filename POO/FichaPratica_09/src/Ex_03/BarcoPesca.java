package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private String anoFrabricacao;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marca;
    private ArrayList<Peixe> peixePescado;
    private ArrayList<Marisco>  mariscoPescado;

    //Construtor


    public BarcoPesca(String nome, String cor, String anoFrabricacao, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFrabricacao = anoFrabricacao;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixePescado = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public void pescarPeixe(Peixe peixe){
        peixePescado.add(peixe);
    }

    public  void pescaMarisco(Marisco marisco){
        mariscoPescado.add(marisco);
    }


    //Verificar Carga
    public void verificarCarga(double peso){
        if(capacidadeCarga < peso){
            System.out.println("O barco não aguenta a carga");
        }else {
            System.out.println("O barco adicionou o seu pescado. Peso adicionado " + peso + " kg");
        }
    }


    //Remover item do ArrayList
    public void largarPeixe(int index){
        peixePescado.remove(index);
    }

    public void LargarMarisco(int index){
        mariscoPescado.remove(index);
    }


    public double calcularTotal(){
        double valor = 0, peso = 0, total = 0;

        //Ciclo para os Peixes
        for(int i = 0; i < peixePescado.size(); i++){
            valor = peixePescado.get(i).getPrecoKg();
            peso = peixePescado.get(i).getPeso();
            total += valor * peso;
        }

        //Ciclo para os mariscos
        for(int i = 0; i < mariscoPescado.size(); i++){
            valor = mariscoPescado.get(i).getPrecoKg();
            peso = mariscoPescado.get(i).getPeso();
            total += valor * peso;
        }

        return total;
    }


    public double salarioTripulacao(){
        double valorTripulante = calcularTotal() - (calcularTotal()*0.40);
        valorTripulante /= this.tripulacao;
        return valorTripulante;
    }




}