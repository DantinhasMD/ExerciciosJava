package Residencia.POO.Poo36;

import java.util.ArrayList;
import java.util.List;

public class RelatorioTransacoes implements Residencia.POO.Poo36.Relatorio {
    public static List<Residencia.POO.Poo36.Transacoes> todasTransacoes = new ArrayList<>();

    @Override
    public void gerarRelatorio(){
        for(Residencia.POO.Poo36.Transacoes transacao : todasTransacoes){
            System.out.printf("Transacao: %.2f\n", transacao.getValor());
        }
    }

    @Override
    public String getTipo(){
        return "Relatório de Transações";
    }
}
