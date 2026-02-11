package java_daily_challenges.iniciante;

import java.util.*;

/*
========================================
Sistema de Gerenciamento de Aluguel de Carros
Nível: iniciante
Data: 2026_02_08_0651
========================================

ENUNCIADO:
Desenvolva um sistema que permita a locação de carros para clientes e o gerenciamento de aluguéis.

CONCEITOS:
- exceções
- mapas

REQUISITOS:
- O sistema deve permitir a entrada de informações de carros e clientes
- O sistema deve permitir a locação de carros para clientes
- O sistema deve gerenciar aluguéis e calcular o valor total da locação

EXEMPLOS:
Entrada: {"cliente": {"nome": "João", "idade": 25}, "carro": {"placa": "ABC123", "marca": "Fiat", "modelo": "Palio"}} | Saída esperada: {"locacao": {"carro": {"placa": "ABC123", "marca": "Fiat", "modelo": "Palio"}, "cliente": {"nome": "João", "idade": 25}, "valor": 50.0}}
Entrada: {"cliente": {"nome": "João", "idade": -1}, "carro": {"placa": "ABC123", "marca": "Fiat", "modelo": "Palio"}} | Saída esperada: {"erro": "Idade do cliente inválida"}
Entrada: {"carro": {"placa": "ABC123", "marca": "Fiat", "modelo": "Palio"}} | Saída esperada: {"erro": "Falta de informações de cliente"}
*/
class Car {
    private String placa;
    private String marca;
    private String modelo;
    private double precoLocacao;
    private boolean disponivel;

    public Car (String placa, String marca, String modelo, double precoLocacao){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precoLocacao = precoLocacao;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoLocacao() {
        return precoLocacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

class Cliennte {
    private String nome;
    private int idade;

    public Cliennte (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Locadora {
    List<Car> carros = new ArrayList<>();
    List<Cliennte> clientes = new ArrayList<>();
    Map<Cliennte, Car> alugados = new HashMap<>();

    public void adicionarCarro(String placa, String marca, String modelo, double precoLocacao){
        if (placa.isEmpty() || placa == null) {
            throw new IllegalArgumentException("\nCampo placa inválido!");
        }

        if (marca.isEmpty() || marca == null) {
            throw new IllegalArgumentException("\nCampo marca inválido!");
        }

        if (modelo.isEmpty() || modelo == null) {
            throw new IllegalArgumentException("\nCampo placa inválido!");
        }

        if (precoLocacao < 0) {
            throw new IllegalArgumentException("\nCampo preço inválido!");
        }

        boolean existe = false;
        for (Car c: carros){
            if (c.getPlaca().equalsIgnoreCase(placa)){
                System.out.println("\nCarro já cadastrado no sistema!");
                existe = true;
            }
        }

        if (!existe){
            carros.add(new Car(placa, marca, modelo, precoLocacao));
            System.out.println("\nCarro adicionado a Lista!");
        }
    }

    public void adicionarCliente(String nome, int idade){
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        if (idade < 17) {
            throw new IllegalArgumentException("\nCampo idade inválido!");
        }

        boolean existe = false;
        for (Car c: carros){
            if (c.getPlaca().equalsIgnoreCase(nome)){
                System.out.println("\nCliente já cadastrado no sistema!");
                existe = true;
            }
        }

        if (!existe){
            clientes.add(new Cliennte(nome, idade));
            System.out.println("\nCliente adicionado!");
        }
    }

    public void consultarCarrosDisponiveis(){
        boolean tem = false;

        for (Car c: carros){
            if (c.isDisponivel()) {
                System.out.printf("Placa: %s | Marca: %s | Modelo: %s | Preço Locação: %.2f | Dísponível: %B%n",
                        c.getPlaca(), c.getMarca(), c.getModelo(), c.getPrecoLocacao(), c.getPrecoLocacao());
                tem = true;
            }
        }

        if (!tem){
            System.out.println("\nNão há Carros disponíveis!");
        }
    }

    public void alugarCarro(String carro, String cliente) {
        if (carro.isEmpty() || carro == null) {
            throw new IllegalArgumentException("\nCampo placa inválido!");
        }

        if (cliente.isEmpty() || cliente == null) {
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        for (Car c: carros){
            if (c.getPlaca().equalsIgnoreCase(carro)){
                for (Cliennte l: clientes){
                    if (l.getNome().equalsIgnoreCase(cliente)){
                        c.setDisponivel(false);
                        alugados.put(l, c);
                        System.out.println("\nAluguel Realizado!");
                        System.out.printf("CLIENTE - Nome: %s | Idade: %02d || CARRO - Placa: %s | Marca: %s | Modelo: %s | Preço Locação: %.2f\n",
                                l.getNome(), l.getIdade(), c.getPlaca(), c.getMarca(), c.getModelo(), c.getPrecoLocacao());
                        return;
                    } else {
                        System.out.println("\nCliente não encontrado!");
                        return;
                    }
                }
            } else {
                System.out.println("\nCarro não encontrado!");
                return;
            }
        }
    }
}

public class Desafio_2026_02_08_0651 {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\nSistema de Gerenciamento de Aluguel de Carros");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Adicionar Carros");
            System.out.println("3 - Consultar Carros Disponíveis");
            System.out.println("4 - Alugar Carro");
            System.out.println("5 - Encerrar");
            System.out.print("Selecione a opção desejada: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nomeCli = sc.nextLine();

                    System.out.print("Idade do Cliente: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    try {
                        locadora.adicionarCliente(nomeCli, idade);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Placa do Carro: ");
                    String placa = sc.nextLine();

                    System.out.print("Marca do Carro: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo do Carro: ");
                    String modelo = sc.nextLine();

                    System.out.print("Preço de locação: ");
                    double precoLoc = sc.nextDouble();
                    sc.nextLine();

                    try {
                        locadora.adicionarCarro(placa, marca, modelo, precoLoc);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    locadora.consultarCarrosDisponiveis();
                    break;

                case 4:
                    System.out.print("Nome do Cliente: ");
                    String cliente = sc.nextLine();

                    System.out.print("Placa do Carro: ");
                    String carro = sc.nextLine();

                    locadora.alugarCarro(carro, cliente);
                    break;

                case 5:
                    System.out.println("Programa Encerrado. Até mais!");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente");
                    break;
            }
        }while (opc != 5);
        sc.close();
    }
}
