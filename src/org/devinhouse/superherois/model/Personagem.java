package org.devinhouse.superherois.model;

public abstract class Personagem {
    String nome;
    String superpoder;

    public boolean equals(Personagem p2){
        return this.nome.equals(p2.getNome());
    }

    public int compateTo(Personagem p2){
        return this.nome.compareTo(p2.getNome());
    }

    public String getNome() {
        return nome;
    }
}
