package Ex_02;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Carro carro1 = new Carro("Ferrari", "F1", 2024, 600, 2500, TipoCombustivel.GASOLINA, 15, 4);
//        Mota mota1 = new Mota("Honda", "CB 500X", 2023, 50, 471, TipoCombustivel.GASOLINA, 4);
//        Caminhao caminhao1 = new Caminhao("Scania", "R 450", 2023, 450, 12700, TipoCombustivel.DIESEL, 40);

        Carro carro1 = new Carro("Fiat","Panda", 2020,250,1200,TipoCombustivel.GASOLINA,6.5,5);
        Carro carro2 = new Carro("Mini", "Cooper", 2008, 200, 100, TipoCombustivel.DIESEL, 5.5,4);
        Mota mota1 = new Mota("Volkswagen", "M-3", 2015, 250, 120, TipoCombustivel.GASOLINA, 3);
        Caminhao caminhao1 = new Caminhao("Audi", "C8", 2005, 200, 100, TipoCombustivel.DIESEL,18,500);

        System.out.println("****** Carro ******\n");
        TipoCombustivel tipoCombustivelCarro = carro1.getTipoCombustivel();
        System.out.println("Total da viagem de carro: " + carro1.calcularCusto(300));
        System.out.println("******************\n");

        System.out.println("****** Mota ******\n");
        mota1.imprimirImagem();
        System.out.println();
        System.out.println("******************\n");

        System.out.println("****** Caminhão ******\n");
        System.out.println("Total da viagem de caminhão: "+caminhao1.calcularViagem(300, 450));
        System.out.println("Total da viagem de caminhão: "+caminhao1.calcularViagem(300, 600));
        System.out.println("******************\n");

        System.out.println("****** Simulação de corrida ******\n");
        Veiculo vencedor1 = carro1.corrida(mota1);
        Veiculo vencedor2 = carro1.corrida(caminhao1);

        System.out.println();

        if (vencedor1 != null) {
            System.out.println("Vencedor é  " + vencedor1.getMarca());
        } else {
            System.out.println("Empate");
        }

        System.out.println("********************************\n");
    }
}
