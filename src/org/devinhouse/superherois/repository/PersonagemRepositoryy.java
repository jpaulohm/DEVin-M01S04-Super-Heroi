package org.devinhouse.superherois.repository;

import org.devinhouse.superherois.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepositoryy {
    private List<Personagem> personagemList = new ArrayList<Personagem>();

    public void inserirPersonagem(Personagem novoPersonagem){
        personagemList.add(novoPersonagem);
    }
    public Personagem getPersonagem(int index){
        if (personagemList.size()>index){
            return personagemList.get(index);
        }
        return null;
    }

}
