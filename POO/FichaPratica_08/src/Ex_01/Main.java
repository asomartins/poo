package Ex_01;

import static Ex_05.TipoCombustivel.DIESEL;
import static Ex_05.TipoCombustivel.GASOLINA;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Seat", "Ibiza", 2022, 250, 1800, 30, DIESEL);
        Carro carro2 = new Carro("Ferrari", "F1", 2024, 600, 2500, 40, GASOLINA);

        carro1.ligar();
        carro2.ligar();

        Carro vencedor1 = carro1.corrida(carro2);

        System.out.println();

        if(vencedor1 != null) {
            System.out.println("O vencedor é: "+vencedor1.getMarca());
        }
        else {
            System.out.println("Empate!");
        }

        double consumo1 = carro1.consumoCombustivel(300);
        double consumo2 = carro2.consumoCombustivel(300);

        System.out.println();

        System.out.println("O carro da marca "+carro1.getMarca() + "tem um consumo de "+consumo1);
        System.out.println("O carro da marca "+carro2.getMarca() + "tem um consumo de "+consumo2);
      }
}
