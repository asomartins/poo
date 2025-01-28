package Ex_04;

public class Main {
    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Rua dos Jardins", "850", "Rio de Janeiro", TipoImovel.MANSAO, TipoAcabamento.NOVA_COM_ACABAMENTO, 1200, 6, 8, 80);
        Imovel imovel2 = new Imovel("Rua das Palmeiras", "789", "Florianópolis", TipoImovel.CASA, TipoAcabamento.NOVA_COM_ACABAMENTO, 450, 4, 5, 50);

        System.out.println("Valor do primeiro imóvel: "+imovel1.calcularValorImovel());
        System.out.println("Valor do segundo imóvel: "+imovel2.calcularValorImovel());

        System.out.println("O imóvel mais caro é do tipo "+imovel1.getTipoImovel()+" localizado em "+imovel1.compararImoveis(imovel2).getRua());
    }
}
