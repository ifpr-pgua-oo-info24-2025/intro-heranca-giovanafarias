package com.lin.java.models;

public class Moto extends Veiculo {
    private String tipoDeGuidao;

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }
    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public Moto(String marca, String modelo, Integer ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String exibirDetalhes() {
        return "Tipo de guidão: " + getTipoDeGuidao() + "\n" + super.exibirDetalhes();
    }
}
