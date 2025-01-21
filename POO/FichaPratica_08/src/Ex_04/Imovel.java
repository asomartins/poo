package Ex_04;

import Ex_01.TipoCombustivel;

public class Imovel {
    private String rua;
    private String numeroPorta;
    private String cidade;
    TipoImovel tipoImovel;
    TipoAcabamento tipoAcabamento;
    private double areaImovel;
    private int numQuartos;
    private int numCasasBanho;
    private double areaPiscina;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroPorta() {
        return numeroPorta;
    }

    public void setNumeroPorta(String numeroPorta) {
        this.numeroPorta = numeroPorta;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public TipoAcabamento getTipoAcabamento() {
        return tipoAcabamento;
    }

    public void setTipoAcabamento(TipoAcabamento tipoAcabamento) {
        this.tipoAcabamento = tipoAcabamento;
    }

    public double getAreaImovel() {
        return areaImovel;
    }

    public void setAreaImovel(double areaImovel) {
        this.areaImovel = areaImovel;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumCasasBanho() {
        return numCasasBanho;
    }

    public void setNumCasasBanho(int numCasasBanho) {
        this.numCasasBanho = numCasasBanho;
    }

    public double getAreaPiscina() {
        return areaPiscina;
    }

    public void setAreaPiscina(double areaPiscina) {
        this.areaPiscina = areaPiscina;
    }

    public double calcularValorImovel() {
        double valorImovel = 0;

        switch (this.tipoImovel) {
            case APARTAMENTO:
                valorImovel = this.areaImovel * 1000;
                break;
            case CASA:
                valorImovel = this.areaImovel * 3000;
                break;
            case MANSAO:
                valorImovel = this.areaImovel * 5000;
                break;
        }

        switch (this.tipoAcabamento) {
            case RESTAURO:
                valorImovel = valorImovel * 0.5;
                break;
            case USADA:
                valorImovel = valorImovel * 0.9;
                break;
            case NOVA_COM_ACABAMENTO:
                valorImovel += valorImovel * 0.25;
        }

        valorImovel += this.numQuartos * 7500;

        valorImovel += this.numCasasBanho * 10500;

        if (this.areaPiscina > 0)
            valorImovel += this.areaPiscina * 1000;

        return valorImovel;
    }

    public void alterarAcabamentoImovel(TipoAcabamento novoAcabamento) {
        this.tipoAcabamento = novoAcabamento;
    }

    public void imprimirDescricao() {
        System.out.println("**************** Informações do Imóvel ****************");
        System.out.println("Localização: " + this.cidade);
        System.out.println("Morada: " + this.rua + " Número: " + this.numeroPorta);
        System.out.println("Tipo: " + this.tipoImovel);
        System.out.println("Acabamento: " + this.tipoAcabamento);
        System.out.println("Área: " + this.areaImovel + "m2");
        System.out.println("Quartos: " + this.numQuartos);
        System.out.println("Casas de banho: " + this.numCasasBanho);

        if (this.areaPiscina > 0)
            System.out.println("Área da piscina: " + this.areaPiscina);
    }

    public Imovel compararImoveis(Imovel outroImovel) {
        double valorImovel;
        if (this.calcularValorImovel() > outroImovel.calcularValorImovel()) {
            return this;
        } else if (this.calcularValorImovel() < outroImovel.calcularValorImovel()) {
            return outroImovel;
        } else {
            System.out.println("Imóveis de mesmo valor");
            return null;
        }
    }
}
