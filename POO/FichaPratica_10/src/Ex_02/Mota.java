package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{

    public Mota(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo100) {
        super(marca, modelo, ano, potencia, cilindrada, tipoCombustivel, consumo100);
    }

    public void imprimirImagem() throws FileNotFoundException {
    File ficheiro = new File("poo/POO/FichaPratica_10/ficheiros/Mota.txt");
    Scanner scanner = new Scanner(ficheiro);
    String linha;

    while(scanner.hasNextLine()){
        linha = scanner.nextLine();
        System.out.println(linha);
    }
    scanner.close();
}
    @Override
    public void ligar() {
        System.out.println("A mota ligou.... bi bi");
    }
}