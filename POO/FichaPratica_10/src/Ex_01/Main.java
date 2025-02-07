package Ex_01;

public class Main {
    public static void main(String[] args) {

        JatoPrivado jato1 = new JatoPrivado(1,"Jato Privado-17",2020,2000,20,10,5,4,500,400,5000,30,40,Categoria.HEAVY_JET);
        AviaoCombate combate1 = new AviaoCombate(2, "Aviao Combate-15",2018,4000,30,10,10,4,600,500,10000,"Portugal",true);

        Catalogo catalogo = new Catalogo();

        jato1.adicionarInstalacoes(Instalacoes.CHUVEIRO);
        jato1.adicionarInstalacoes(Instalacoes.WC);
        jato1.adicionarInstalacoes(Instalacoes.SUITE);
        jato1.adicionarInstalacoes(Instalacoes.CINEMA);

        combate1.adicionarArma(Armas.METRALHADORA);
        combate1.adicionarArma(Armas.MÍSSEL);
        combate1.adicionarArma(Armas.FOGUETE);

        catalogo.adquirirAviao(jato1);
        catalogo.adquirirAviao(combate1);

        catalogo.imprimirListaCatalogo();

        System.out.println();

        double valor = catalogo.calcularValorTotal();
        System.out.println("Valor Total " + valor);


    }
}
