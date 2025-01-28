package Ex_03;

    public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double pesoAnimal;
    private String[] alimentacao;

        public Animal(String especie, String nome, String paisOrigem, double pesoAnimal, String[] alimentacao) {
            this.especie = especie;
            this.nome = nome;
            this.paisOrigem = paisOrigem;
            this.pesoAnimal = pesoAnimal;
            this.alimentacao = alimentacao;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getPaisOrigem() {
            return paisOrigem;
        }

        public void setPaisOrigem(String paisOrigem) {
            this.paisOrigem = paisOrigem;
        }

        public double getPesoAnimal() {
            return pesoAnimal;
        }

        public void setPesoAnimal(double pesoAnimal) {
            this.pesoAnimal = pesoAnimal;
        }

        public String[] getAlimentacao() {
            return alimentacao;
        }

        public void setAlimentacao(String[] alimentacao) {
            this.alimentacao = alimentacao;
        }

        public void comer(String alimento, double pesoAlimento) {
            boolean comeu = false;
            for (int i = 0; i < alimentacao.length; i++) {
                if (alimento.equals(this.alimentacao[i])) {
                    this.pesoAnimal += pesoAlimento / 1000;
                    System.out.println("O animal comeu.");
                }
                else {
                    System.out.println("O animal recusou essa comida: "+alimento);
                }
            }
        }
    }
