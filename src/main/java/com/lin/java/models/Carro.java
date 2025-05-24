package com.lin.java.models;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Carro (String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public String exibirDetalhes() {
        return "N�mero de portas: "+ getNumeroDePortas() + "\n" + super.exibirDetalhes();
    }
}
