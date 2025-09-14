package POO.Poo36;

import java.util.*;

public class RelatorioClientes implements POO.Poo36.Relatorio {
    public static List<POO.Poo36.Clientes> todosClientes = new ArrayList<>();

    @Override
    public void gerarRelatorio(){
        for(POO.Poo36.Clientes cliente : todosClientes){
            System.out.printf("Cliente: %s\n", cliente.getNome());
        }
    }

    @Override
    public String getTipo(){
        return "Relatório de Clientes";
    }
}
