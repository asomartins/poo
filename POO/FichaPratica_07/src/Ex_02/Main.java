package Ex_02;

public class Main {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro("Totó", "Rafeiro");
        Cachorro dog2 = new Cachorro("Pandora", "Fiapinho de manga");
        Cachorro dog3 = new Cachorro("Snoopy", "Caramelo");

        dog1.latir();
        dog2.setLatido("Ruff, Ruff");
        dog2.latir();
    }
}
