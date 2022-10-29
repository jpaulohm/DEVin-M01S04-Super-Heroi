package org.devinhouse.superherois.model;

public enum Operacao {
    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Operacao obterPeloCodigo(Integer codigo){
        Operacao[] operacoes = Operacao.values();
        return operacoes[codigo-1];
    }
}
