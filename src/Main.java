import org.devinhouse.superherois.cli.Display;
import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.model.*;
import org.devinhouse.superherois.repository.PersonagemRepository;

public class Main {
    public static void main(String[] args) throws OpcaoInvalidaException {
        System.out.println("Hello world!");

        PersonagemRepository personagens = new PersonagemRepository();

        Operacao operacao;
        do {
            operacao=Display.getOperacao();
            switch (operacao){
                case SAIR :
                    System.out.println("\nBOA NOITE\nHORA DE DORMIR");
                    return;
                case LISTAR:
                    personagens.listAll();
                    break;
                case CADASTRAR_HEROI:
                    personagens.addNewPersonagem(TipoPersonangem.HEROI);
                    break;
                case CADASTRAR_VILAO:
                    personagens.addNewPersonagem(TipoPersonangem.VILAO);
                    break;
            }
        }while (operacao != null);
    }
}