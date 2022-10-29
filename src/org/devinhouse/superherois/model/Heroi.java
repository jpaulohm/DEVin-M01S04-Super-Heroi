package org.devinhouse.superherois.model;

public class Heroi extends Personagem{
    String nomeVidaReal; //the Sokovia Accords were repealed

    @Override
    public String toString() {
        return "Heroi{" +
                "nomeVidaReal='" + nomeVidaReal + '\'' +
                ", nome='" + nome + '\'' +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }

    public Heroi(String nome, String superpoder, String nomeVidaReal) {
        this.nome = nome;
        this.superpoder=superpoder;
        this.nomeVidaReal = nomeVidaReal;

    }
}
