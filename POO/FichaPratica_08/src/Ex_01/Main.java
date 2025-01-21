package Ex_01;

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Seat","Ibiza", 1990,250,1800,TipoCombustivel.DIESEL,8.5);
        Carro carro2 = new Carro("Ferrari", "F1", 2024,600,2500,TipoCombustivel.GASOLINA,15);

        carro1.ligar();
        carro2.ligar();

        Carro vencedor1 = carro1.corrida(carro2);

        System.out.println();

        if(vencedor1 != null){
            System.out.println("Vencedor é  " + vencedor1.getMarca());
        }else {
            System.out.println("Empate");
        }

        double consumo1 = carro1.consumoCombustivel(300);
        double consumo2 = carro2.consumoCombustivel(300);

        System.out.println();

        System.out.println("O carro da marca " + carro1.getMarca() + " tem um consumo de " + consumo1);

    }
}