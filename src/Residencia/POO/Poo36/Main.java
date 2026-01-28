/* Interface:
public interface Relatorio {
void gerarRelatorio();
String getTipo();
}
Classes a implementar:
● RelatorioClientes → imprime lista de clientes em um ArrayList.
● RelatorioTransacoes → imprime lista de transações financeiras em um
ArrayList.
No Main:
● Criar uma lista de clientes (nomes).
● Criar uma lista de transações (valores e tipos).
● Instanciar os relatórios e chamar gerarRelatorio(). */

package Residencia.POO.Poo36;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo36.Clientes c1 = new Residencia.POO.Poo36.Clientes("Maria");
        Residencia.POO.Poo36.Clientes c2 = new Residencia.POO.Poo36.Clientes("João");
        Residencia.POO.Poo36.Clientes c3 = new Residencia.POO.Poo36.Clientes("Ana");
        Residencia.POO.Poo36.Clientes c4 = new Residencia.POO.Poo36.Clientes("Laura");
        Residencia.POO.Poo36.Clientes c5 = new Residencia.POO.Poo36.Clientes("Heitor");
        Residencia.POO.Poo36.Clientes c6 = new Residencia.POO.Poo36.Clientes("Vitor");


        Residencia.POO.Poo36.RelatorioClientes.todosClientes.add(c1);
        Residencia.POO.Poo36.RelatorioClientes.todosClientes.add(c2);
        Residencia.POO.Poo36.RelatorioClientes.todosClientes.add(c3);
        Residencia.POO.Poo36.RelatorioClientes.todosClientes.add(c4);
        Residencia.POO.Poo36.RelatorioClientes.todosClientes.add(c5);
        Residencia.POO.Poo36.RelatorioClientes.todosClientes.add(c6);

        Residencia.POO.Poo36.Relatorio primeiro = new Residencia.POO.Poo36.RelatorioClientes();
        primeiro.gerarRelatorio();

        Residencia.POO.Poo36.Transacoes t1 = new Residencia.POO.Poo36.Transacoes(1200);
        Residencia.POO.Poo36.Transacoes t2 = new Residencia.POO.Poo36.Transacoes(-3400);
        Residencia.POO.Poo36.Transacoes t3 = new Residencia.POO.Poo36.Transacoes(577);
        Residencia.POO.Poo36.Transacoes t4 = new Residencia.POO.Poo36.Transacoes(200);
        Residencia.POO.Poo36.Transacoes t5 = new Residencia.POO.Poo36.Transacoes(-400);
        Residencia.POO.Poo36.Transacoes t6 = new Residencia.POO.Poo36.Transacoes(-507);

        Residencia.POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t1);
        Residencia.POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t2);
        Residencia.POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t3);
        Residencia.POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t4);
        Residencia.POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t5);
        Residencia.POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t6);

        Residencia.POO.Poo36.Relatorio segundo = new Residencia.POO.Poo36.RelatorioTransacoes();
        segundo.gerarRelatorio();


    }
}
