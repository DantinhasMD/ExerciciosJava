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

package POO.Poo36;

public class Main {
    public static void main(String[] args) {
        POO.Poo36.Clientes c1 = new POO.Poo36.Clientes("Maria");
        POO.Poo36.Clientes c2 = new POO.Poo36.Clientes("João");
        POO.Poo36.Clientes c3 = new POO.Poo36.Clientes("Ana");
        POO.Poo36.Clientes c4 = new POO.Poo36.Clientes("Laura");
        POO.Poo36.Clientes c5 = new POO.Poo36.Clientes("Heitor");
        POO.Poo36.Clientes c6 = new POO.Poo36.Clientes("Vitor");


        POO.Poo36.RelatorioClientes.todosClientes.add(c1);
        POO.Poo36.RelatorioClientes.todosClientes.add(c2);
        POO.Poo36.RelatorioClientes.todosClientes.add(c3);
        POO.Poo36.RelatorioClientes.todosClientes.add(c4);
        POO.Poo36.RelatorioClientes.todosClientes.add(c5);
        POO.Poo36.RelatorioClientes.todosClientes.add(c6);

        POO.Poo36.Relatorio primeiro = new POO.Poo36.RelatorioClientes();
        primeiro.gerarRelatorio();

        POO.Poo36.Transacoes t1 = new POO.Poo36.Transacoes(1200);
        POO.Poo36.Transacoes t2 = new POO.Poo36.Transacoes(-3400);
        POO.Poo36.Transacoes t3 = new POO.Poo36.Transacoes(577);
        POO.Poo36.Transacoes t4 = new POO.Poo36.Transacoes(200);
        POO.Poo36.Transacoes t5 = new POO.Poo36.Transacoes(-400);
        POO.Poo36.Transacoes t6 = new POO.Poo36.Transacoes(-507);

        POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t1);
        POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t2);
        POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t3);
        POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t4);
        POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t5);
        POO.Poo36.RelatorioTransacoes.todasTransacoes.add(t6);

        POO.Poo36.Relatorio segundo = new POO.Poo36.RelatorioTransacoes();
        segundo.gerarRelatorio();


    }
}
