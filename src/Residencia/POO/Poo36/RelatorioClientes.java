package Residencia.POO.Poo36;

import java.util.*;

public class RelatorioClientes implements Residencia.POO.Poo36.Relatorio {
    public static List<Residencia.POO.Poo36.Clientes> todosClientes = new ArrayList<>();

    @Override
    public void gerarRelatorio(){
        for(Residencia.POO.Poo36.Clientes cliente : todosClientes){
            System.out.printf("Cliente: %s\n", cliente.getNome());
        }
    }

    @Override
    public String getTipo(){
        return "Relatório de Clientes";
    }
}
