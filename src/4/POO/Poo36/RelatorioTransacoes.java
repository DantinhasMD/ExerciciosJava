package POO.Poo36;

import java.util.ArrayList;
import java.util.List;

public class RelatorioTransacoes implements POO.Poo36.Relatorio {
    public static List<POO.Poo36.Transacoes> todasTransacoes = new ArrayList<>();

    @Override
    public void gerarRelatorio(){
        for(POO.Poo36.Transacoes transacao : todasTransacoes){
            System.out.printf("Transacao: %.2f\n", transacao.getValor());
        }
    }

    @Override
    public String getTipo(){
        return "Relatório de Transações";
    }
}
