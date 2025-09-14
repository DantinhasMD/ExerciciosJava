package ExercExternos.Exerc05; //INFORMAÇOES GLOBAIS DAS VENDAS

import java.util.*;

public class SistemaVendas {
    private static List<Venda> todasAsVendas = new ArrayList<>();
    private static List<Double> caixaPorDia = new ArrayList<>();

    public static void registrarVenda(Venda venda) {
        todasAsVendas.add(venda);
    }

    public static List<Venda> getTodasAsVendas() {
        return todasAsVendas;
    }

    public static void registrarCaixaDoDia(double valor) {
        caixaPorDia.add(valor);
    }

    public static List<Double> getCaixaPorDia() {
        return caixaPorDia;
    }
}
