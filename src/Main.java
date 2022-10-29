import org.devinhouse.superherois.cli.Display;
import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws OpcaoInvalidaException {
        System.out.println("Hello world!");

        List<Personagem> personagemList = new ArrayList<Personagem>();

        Operacao operacao;
        do {
            operacao=Display.getOperacao();
            switch (operacao){
                case SAIR : return;
                case LISTAR:
                    System.out.println("==Lista de personagens==");
                    for (Personagem personagem :personagemList) {
                        System.out.println(personagem);
                    }
                    System.out.println("=======");
                    break;
                case CADASTRAR_HEROI:
                    personagemList.add(Display.cadastrar(TipoPersonangem.HEROI));
                    break;
                case CADASTRAR_VILAO:
                    personagemList.add(Display.cadastrar(TipoPersonangem.VILAO));
                    break;
            }
        }while (operacao != null);
        Heroi jompa =new Heroi("Jompa","Fazer programa", "Joao");
        Vilao series = new Vilao("series", "e quacoes diferenciais",100);


        personagemList.add(jompa);
        personagemList.add(series);

        series.acresceTempoPrisao(2);

        System.out.println(personagemList.get(1).toString());


    }
}