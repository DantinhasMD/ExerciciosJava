package Residencia.MVC.Exerc01.src.view;

import Residencia.MVC.Exerc01.src.model.Cliente;
import Residencia.MVC.Exerc01.src.service.ClienteService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n====SISTEMA DE CLIENTES====");
            System.out.println("1 - Criar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Atualizar Cliente");
            System.out.println("4 - Remover Clientes");
            System.out.println("5 - Consultar Cliente");
            System.out.println("6 - Sair");
            System.out.print("Digite a ação desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nVocê deseja Criar Cliente!");
                    System.out.print("Digite o Nome do Cliente: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o Email do Cliente: ");
                    String email = sc.next();
                    System.out.print("Digite o Telefone do Cliente: ");
                    String telefone = sc.next();
                    System.out.print("Digite o CPF do Cliente: ");
                    String cpf = sc.next();

                    if (service.criarCliente(nome, email, telefone, cpf)) {
                        System.out.println("Cliente Criado com Sucesso!\n");
                    } else {
                        System.out.println("Erro! Confira os dados do Cliente Novamente!\n");
                    }
                    break;

                case 2:
                    System.out.println("\nVocê deseja Listar Clientes!");
                    List<Cliente> listaListar = service.listarClientes();
                    int qtdClientes = 0;

                    listaListar.sort((c1, c2) -> c1.getNome().compareToIgnoreCase(c2.getNome()));

                    for (Cliente c : listaListar){
                        qtdClientes++;
                        System.out.println(c);
                    }
                    System.out.printf("\nQuantidade de Clientes Listados: %02d\n", qtdClientes);
                    break;

                case 3:
                    System.out.println("\nVocê deseja Atualizar Cliente!");
                    System.out.print("Informe o Id do Cliente: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.println("1 - Nome");
                    System.out.println("2 - Email");
                    System.out.println("3 - Telefone");
                    System.out.println("4 - CPF");
                    System.out.print("Informe o Atributo do Cliente que deseja Modificar:");
                    int atributo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o Novo Valor: ");
                    String novoValor = sc.nextLine();

                    if (service.atualizarCliente(idAtualizar, atributo, novoValor)) {
                        System.out.println("Cliente Atualizado com Sucesso!\n");
                        service.consultarCliente(idAtualizar);
                    } else {
                        System.out.println("Erro! Confira os dados Inseridos!\n");
                    }
                    break;

                case 4:
                    System.out.println("\nVocê deseja Remover Clientes!");
                    System.out.print("Informe o Id do Cliente: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();

                    if (service.removerCliente(idRemover)) {
                        System.out.println("Cliente Removido com Sucesso!\n");
                    } else {
                        System.out.println("Erro! O Cliente não existe!\n");
                    }
                    break;

                case 5:
                    System.out.println("\nVocê deseja Consultar Cliente!");
                    System.out.print("Informe o Id do Cliente: ");
                    int idConsultar = sc.nextInt();
                    sc.nextLine();

                    if (service.consultarCliente(idConsultar)){
                        System.out.println("Cliente Encontrado!\n");
                    }
                    else {
                        System.out.println("Cliente não existe!\n");
                    }
                    break;

                case 6:
                    break;

                default:
                    System.out.println("\nOpção Inválida. Tente Novamente!");
                    break;
            }
        } while (opcao != 6);
        System.out.println("\nPrograma Encerrado!");
        sc.close();
    }
}
