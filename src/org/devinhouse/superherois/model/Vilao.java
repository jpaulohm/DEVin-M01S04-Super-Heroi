package org.devinhouse.superherois.model;

public class Vilao extends Personagem {
    Integer tempoDePrisao;

    public void acresceTempoPrisao(Integer tempoAdicional){
        tempoDePrisao += tempoAdicional;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "tempoDePrisao=" + tempoDePrisao +
                ", nome='" + nome + '\'' +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }

    public Vilao(String nome, String superpoder, Integer tempoDePrisao) {
        this.nome = nome;
        this.superpoder=superpoder;
        this.tempoDePrisao = tempoDePrisao;
    }

}
