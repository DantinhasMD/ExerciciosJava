/* Controle de Saldo de Contas
Crie um programa que armazene os saldos de 10 contas bancárias em um vetor.
 O usuário deve poder buscar o saldo de uma conta pelo índice do vetor.
Se o usuário inserir um índice inválido, capture e trate ArrayIndexOutOfBoundsException.

Exemplo de Entrada:
Digite o índice da conta: 12

Saída Esperada:
Erro: Conta não encontrada!

👉 Dica: Use try { ... } catch (ArrayIndexOutOfBoundsException e) { ... }. */

package TratamentoDeExcecoes;

import java.util.Scanner;

public class Tratamento01 {
    static double[] saldos = {233.99, 344.55, 987, 321, 777, 54.78, 80.33, 2121.33, 590.99, 34};

    public static double getSaldo(int indice){
        return saldos[indice];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta que deseja consultar o saldo: ");
        int indice = sc.nextInt();

        try{
            System.out.printf("Saldo Conta %02d: R$%.2f", indice, getSaldo(indice - 1));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Conta não encontrada!");
        }
        sc.close();
    }
}


