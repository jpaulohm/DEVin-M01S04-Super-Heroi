package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.model.*;

import java.util.List;
import java.util.Scanner;

public class Display {
    public static void ApresentarOpcoes(){
        System.out.println( "===MENU===\n" +
                            "- 1 - Cadastrar Herói\n" +
                            "- 2 - Cadastrar Vilão\n" +
                            "- 3 - Listar\n" +
                            "- 4 - Sair");
    }
    public static Operacao getOperacao() throws OpcaoInvalidaException {
        ApresentarOpcoes();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a operacao desejada:");
        Integer op = scanner.nextInt();
        if (op <= 0 && op > Operacao.values().length){
            throw new OpcaoInvalidaException();
        }else {
            return Operacao.obterPeloCodigo(op);
        }

    }
    public static Personagem cadastrar(TipoPersonangem tipo){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o super-poder: ");
        String poder = scanner.nextLine();
        Personagem novoPersonagem;

        if (tipo == TipoPersonangem.HEROI) {
            System.out.print("Informe o nome na vida real: ");
            String outroNome = scanner.nextLine();
            System.out.println();
            novoPersonagem = new Heroi(nome, poder, outroNome);
        } else {
            System.out.print("Informe o tempo de prisao: ");
            String prisao = scanner.nextLine();
            System.out.println();
            novoPersonagem = new Vilao(nome, poder, Integer.valueOf(prisao));
        }
        return novoPersonagem;

    }
    public static void exibirMensagem(String mensagemErro){
        System.out.println(mensagemErro);
    }
    public static void listar(List<Personagem> personagemList){
        for (int i = 0; i < personagemList.size(); i++) {
            System.out.println(personagemList.get(i));
        }
    }


}
