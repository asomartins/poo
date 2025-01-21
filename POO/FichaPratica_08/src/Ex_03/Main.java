package Ex_03;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setNome("Kika");
        animal1.setEspecie("Gata Rajada");
        animal1.setPesoAnimal(3.5);
        animal1.setPaisOrigem("Brasil");
        animal1.setAlimentacao(new String[]{"Ração", "Churu", "Patê"});
        animal1.comer("Banana", 100);
        System.out.println("Peso do animal: "+animal1.getPesoAnimal());
        animal1.comer("Churu", 50);
        System.out.println("Peso do animal: "+animal1.getPesoAnimal());
    }
}
