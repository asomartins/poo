package Ex_03;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Gata Rajada", "Kika", "Brasil", 3.5, new String[]{"Ração", "Churu", "Patê"});

        animal1.comer("Banana", 100);
        System.out.println("Peso do animal: "+animal1.getPesoAnimal());
        animal1.comer("Churu", 50);
        System.out.println("Peso do animal: "+animal1.getPesoAnimal());
    }
}
