package org.devinhouse.superherois.repository;

import org.devinhouse.superherois.cli.Display;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.TipoPersonangem;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {
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
    public void listAll(){
        System.out.println("==Lista de personagens==");
        for (Personagem personagem :personagemList) {
            System.out.println(personagem);
        }
    }
    public void addNewPersonagem(TipoPersonangem tipo){
        if (tipo==TipoPersonangem.HEROI) {
            Display.cadastrar(TipoPersonangem.HEROI);
        }else {
            Display.cadastrar(TipoPersonangem.VILAO);
        }
    }

}
