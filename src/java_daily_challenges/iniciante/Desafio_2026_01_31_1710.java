package java_daily_challenges.iniciante;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
========================================
Sistema de Gestão de Aluguel
Nível: iniciante
Data: 2026_01_31_1710
========================================

ENUNCIADO:
Desenvolva um sistema que permita gerenciar aluguéis de imóveis. O sistema deve armazenar informações sobre os imóveis,
os alugueis e os inquilinos.

REQUISITOS:
- O sistema deve permitir a inserção de novos imóveis com informações sobre o endereço, tamanho e preço de aluguel.
- O sistema deve permitir a inserção de novos alugueis com informações sobre o imóvel, inquilino e data de início e fim do aluguel.
- O sistema deve permitir a busca de imóveis disponíveis por cidade e preço de aluguel.
- O sistema deve permitir a busca de alugueis ativos por inquilino e data de início do aluguel.
- O sistema deve verificar se um imóvel está disponível antes de permitir a inserção de um novo aluguel.

EXEMPLOS:
Entrada: inserir imóvel: {endereco: 'Rua 1', tamanho: 100, preco: 1000} | Saída esperada: Imóvel inserido com sucesso!
Entrada: inserir aluguel: {imovel: 1, inquilino: 'João', data_inicio: '2022-01-01', data_fim: '2022-01-31'} | Saída esperada: Aluguel inserido com sucesso!
Entrada: buscar imóveis disponíveis: cidade='São Paulo', preco=1000 | Saída esperada: [{id: 1, endereco: 'Rua 1', tamanho: 100, preco: 1000}]
Entrada: buscar alugueis ativos: inquilino='João', data_inicio='2022-01-01' | Saída esperada: [{id: 1, imovel: 1, inquilino: 'João', data_inicio: '2022-01-01', data_fim: '2022-01-31'}]
Entrada: inserir aluguel: {imovel: 1, inquilino: 'João', data_inicio: '2022-01-01', data_fim: '2022-01-31'} | Saída esperada: Imóvel não disponível para esse período!
*/
class Inquilino{
    private String nome;

    public String getNome() {
        return nome;
    }
    public Inquilino(String nome){
        this.nome = nome;
    }
}

class Imovel{
    private static int contador = 1;
    private int id;
    private String endereco;
    private String cidade;
    private double tamanho;
    private double preco;
    private boolean disponivel;

    public Imovel(String endereco, String cidade, double tamanho, double preco){
        this.id = contador++;
        this.endereco = endereco;
        this.cidade = cidade;
        this.tamanho = tamanho;
        this.preco = preco;
        this.disponivel = true;
    }

    public String getEndereco() {
        return endereco;
    }
    public double getTamanho() {
        return tamanho;
    }
    public double getPreco() {
        return preco;
    }
    public String getCidade() {
        return cidade;
    }
    public int getId() {
        return id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}

class ContratoAluguel {
    private static int contador = 1;
    private int id;
    private Imovel imovel;
    private Inquilino inquilino;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public ContratoAluguel(Imovel imovel, Inquilino inquilino, LocalDate dataInicio, LocalDate dataFim){
        this.id = contador++;
        this.imovel = imovel;
        this.inquilino = inquilino;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() { return id; }
    public Imovel getImovel() { return imovel; }
    public Inquilino getInquilino() { return inquilino; }
    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
}

class Aluguel {
    List<Imovel> imoveis = new ArrayList<>();
    List<Inquilino> inquilinos = new ArrayList<>();
    List<ContratoAluguel> contratos = new ArrayList<>();

    public void adicionarImovel(String endereco, String cidade,double tamanho,double preco){
        for (Imovel i : imoveis){
            if (i.getCidade().equalsIgnoreCase(cidade) && i.getEndereco().equals(endereco)){
                System.out.println("\nImóvel já adicionado!");
                return;
            }
        }
        imoveis.add(new Imovel(endereco, cidade, tamanho, preco));
        System.out.println("\nImóvel adicionado com sucesso!");
    }

    public void adicionarUsuario(String nome){
        for (Inquilino q : inquilinos){
            if (q.getNome().equalsIgnoreCase(nome)){
                System.out.println("\nInquilino já adicionado!");
                return;
            }
        }
        inquilinos.add(new Inquilino(nome));
        System.out.println("\nInquilino novo adicionado!");
    }

    public void buscarImovel(String cidade, double valorPagar){
        boolean imoveisEncontrados = false;

        for (Imovel i : imoveis){
            if (i.getCidade().equalsIgnoreCase(cidade) && valorPagar >= i.getPreco() && i.isDisponivel()){
                System.out.printf("Id: %02d | Cidade: %s | Endereço: %s | Tamanho: %dm2 | Preço: R$%.2f\n",
                        i.getId(), i.getCidade(), i.getEndereco(), i.getTamanho(), i.getPreco());
                imoveisEncontrados = true;
            }
        }
        if (!imoveisEncontrados){
            System.out.println("\nNão há imóveis dísponíveis");
        }
    }

    public void iniciarContrato(int id, String inquilino, LocalDate data_inicio, LocalDate data_saida){
        Imovel imovelSelecionado = null;
        for (Imovel i : imoveis){
            if (i.getId() == id){ imovelSelecionado = i;
                break;
            }
        }
        if (imovelSelecionado == null){
            System.out.println("\nImóvel não encontrado!");
            return;
        }
        if (!imovelSelecionado.isDisponivel()){
            System.out.println("\nImóvel não disponível para esse período!");
            return;
        }

        Inquilino inquilinoSelecionado = null;
        for (Inquilino q : inquilinos){
            if (q.getNome().equalsIgnoreCase(inquilino)){
                inquilinoSelecionado = q;
                break;
            }
        }
        if (inquilinoSelecionado == null){
            System.out.println("\nInquilino não encontrado!");
            return;
        }

        ContratoAluguel contrato = new ContratoAluguel(imovelSelecionado, inquilinoSelecionado,
                data_inicio, data_saida); contratos.add(contrato);

       imovelSelecionado.setDisponivel(false);
       System.out.println("\nAluguel inserido com sucesso!");
    }

    public void buscarAlugueis(String inquilino, int dataInicio){
        boolean contratosEncontrados = false;

        for (ContratoAluguel c : contratos){
            if (c.getInquilino().getNome().equalsIgnoreCase(inquilino)
                    && c.getDataInicio().equals(dataInicio)){

                System.out.printf(
                        "Contrato Id: %02d | Imóvel Id: %02d | Inquilino: %s | Data Início: %d | Data Fim: %d\n",
                        c.getId(), c.getImovel().getId(), c.getInquilino().getNome(),
                        c.getDataInicio(), c.getDataFim()
                );
                contratosEncontrados = true;
            }
        }

        if (!contratosEncontrados){
            System.out.println("\nNenhum contrato ativo encontrado!");
        }
    }

}

public class Desafio_2026_01_31_1710 {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        int opc;

        do {
            System.out.println("\nGERENCIADOR DE ALÚGUEIS");
            System.out.println("1 - Adicionar Imóvel");
            System.out.println("2 - Inserir Aluguel");
            System.out.println("3 - Buscar Imóveis");
            System.out.println("4 - Buscar alugueis");
            System.out.println("5 - Encerrar");
            System.out.print("Selecione sua Opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.print("\nInsira o endereço(Rua): ");
                    String endereco = sc.nextLine();

                    System.out.print("Insira a Cidade: ");
                    String cidade = sc.nextLine();

                    System.out.print("Insira o tamanho: ");
                    double tamanho = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Insira o preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    if (endereco.isEmpty() || cidade.isEmpty() || tamanho <= 0 || preco <= 0){
                        System.out.println("\nDADOS INVÁLIDOS");
                    } else {
                        aluguel.adicionarImovel(endereco, cidade, tamanho, preco);
                    }
                    break;

                case 2:
                    System.out.print("\nInsira o nome do Inquilino: ");
                    String nome = sc.nextLine();

                    if (nome.isEmpty()){
                        System.out.println("\nDADO INVÁLIDO");
                    } else {
                        aluguel.adicionarUsuario(nome);
                        System.out.print("Insira o id do imóvel: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Insira a data de entrada (yyyy-MM-dd): ");
                        String entradaStr = sc.nextLine();
                        LocalDate dataEntrada = LocalDate.parse(entradaStr, formatter);

                        System.out.print("Insira a data de saída (yyyy-MM-dd): ");
                        String saidaStr = sc.nextLine(); LocalDate dataSaida = LocalDate.parse(saidaStr, formatter);

                        aluguel.iniciarContrato(id, nome, dataEntrada, dataSaida);
                    }
                    break;

                case 3:
                    System.out.print("Insira a Cidade: ");
                    String cidadePesq = sc.nextLine();

                    System.out.print("Insira o valor: ");
                    double precoPesq = sc.nextDouble();
                    sc.nextLine();

                    if (cidadePesq.isEmpty() || precoPesq <= 0){
                        System.out.println("\nDADOS INVÁLIDOS");
                    } else {
                        aluguel.buscarImovel(cidadePesq, precoPesq);
                    }
                    break;

                case 4:
                    System.out.print("Insira o nome do Inquilino: ");
                    String inquilino = sc.nextLine();

                    System.out.print("Insira a data de início do contrato: ");
                    int dataInicio = sc.nextInt();
                    sc.nextLine();

                    if (inquilino.isEmpty() || dataInicio <= 0){
                        System.out.println("\nDADOS INVÁLIDOS");
                    } else {
                        aluguel.buscarAlugueis(inquilino, dataInicio);
                    }
                    break;

                case 5:
                    System.out.println("Programa Encerrado. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente Novamente!");
                    break;
            }
        } while(opc != 5);
        sc.close();
    }
}
