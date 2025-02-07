package Ex_01;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogo;

    public Catalogo () {
        this.catalogo = new ArrayList<Aviao>();
    }

    //Metodo para adicionar avioes

    public void adquirirAviao(Aviao aviaoAdquirido) {
        catalogo.add(aviaoAdquirido);
    }

    //Metodo para vender (remover) aviao
    public void venderAviao(Aviao aviaoVendido) {
        catalogo.remove(aviaoVendido);
    }

   //Imprimir catalogo

    public void imprimirListaCatalogo () {
        System.out.println(" ****** CATALOGO ******");
        for (int i = 0; i < catalogo.size() ; i++) {
            Aviao aviaoAtual = this.catalogo.get(i);

            if (aviaoAtual instanceof JatoPrivado) {
                JatoPrivado jatoAtual = (JatoPrivado) aviaoAtual;
                jatoAtual.imprimirDetalhesAviao();
                jatoAtual.imprimirDetalhesJato();
                jatoAtual.listarInstalacoes();
                System.out.println("****************");
            }

            if (aviaoAtual instanceof AviaoCombate) {
               AviaoCombate combateAtual = (AviaoCombate) aviaoAtual;
               combateAtual.imprimirDetalhesAviao(); // Metodo da classe Aviao
               combateAtual.imprimirDetalheAviaoCombate();
               combateAtual.imprimirArmas(); // Metodo da classe Aviao combate
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < catalogo.size(); i++) {
            total += catalogo.get(i).getPreco();
        }
        return total;
    }
}
