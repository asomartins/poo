package Ex_04;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(15);

        System.out.println("Área: "+circulo.calcularArea());
        System.out.println("Circunferência: "+circulo.calcularCircunferencia());
    }
}
