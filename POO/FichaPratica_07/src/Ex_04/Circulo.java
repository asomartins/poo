package Ex_04;

public class Circulo {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return 3.14 * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * 3.14 * raio;
    }
}
