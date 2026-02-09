package java_daily_challenges.iniciante;
/*
========================================
Gerenciamento de Roteiros de Viagem
Nível: iniciante
Data: 2026_02_06_0656
========================================

ENUNCIADO:
Um sistema de gerenciamento de rotas de viagem deve armazenar e gerenciar rotas entre cidades. Cada rota
deve ter um nome, um destino e um mapa com as coordenadas de cada cidade.

CONCEITOS:
- mapas
- exceções

REQUISITOS:
- O sistema deve armazenar rotas em um mapa com coordenadas (lat, long) para cada cidade.
- O sistema deve validar se o nome da rota é único.
- O sistema deve lançar uma exceção se a entrada de coordenadas for inválida.

EXEMPLOS:
Entrada: {"nome": "Rota 1", "destino": "Cidade A", "mapa": [{"lat": 10, "long": 20}, {"lat": 30, "long": 40}]} | Saída esperada: {"nome": "Rota 1", "destino": "Cidade A", "mapa": [{"lat": 10, "long": 20}, {"lat": 30, "long": 40}]}
Entrada: {"nome": "Rota 1", "destino": "Cidade A", "mapa": [{"lat": 10, "long": 20}, {"lat": 30, "long": "abc"}]} | Saída esperada: {"erro": "Coordenadas inválidas"}
*/

import java.util.*;

class Coordenada {
    private double lat;
    private double lon;

    public Coordenada(double lat, double lon) {
        if (lat < -90 || lat > 90 || lon < -180 || lon > 180) {
            throw new IllegalArgumentException("Coordenadas inválidas");
        }
        this.lat = lat;
        this.lon = lon;
    }
}

class Rota {
    private String nome;
    private String destino;
    private List<Coordenada> coordenadas;

    public Rota(String nome, String destino, List<Coordenada> coordenadas){
        this.nome = nome;
        this.destino = destino;
        this.coordenadas = coordenadas;
    }

    public String getNome() {
        return nome;
    }

    public String getDestino() {
        return destino;
    }

    public List<Coordenada> getCoordenadas() {
        return coordenadas;
    }
}

class Mapa {
    Map<String, Rota> rotas = new HashMap<>();

    public void adicionar(String nome, String destino, List<Coordenada> coordenadas){
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("\nNome da Rota Inválido!");
        }
        if (destino == null || destino.isEmpty()) {
            throw new IllegalArgumentException("\nDestino Inválido!");
        }

        boolean existe = false;
        for (Rota r : rotas.values()){
            if (r.getNome().equalsIgnoreCase(nome)){
                System.out.println("Rota já cadastrada!");
                existe = true;
            }
        }

        if (!existe){
            rotas.put(nome, new Rota(nome, destino, coordenadas));
        }
    }

}

public class Desafio_2026_02_06_0656 {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n Gerenciamento de Roteiros de Viagem");
            System.out.println("1 - Adicionar nova Rota");
            System.out.println("2 - Encerrar");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Nome da rota: ");
                    String nome = sc.nextLine();

                    System.out.print("Destino: ");
                    String destino = sc.nextLine();

                    System.out.print("Quantas coordenadas deseja inserir? ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    List<Coordenada> coords = new ArrayList<>();
                    for (int i = 0; i < qtd; i++) {
                        System.out.print("Latitude: ");
                        double lat = sc.nextDouble();

                        System.out.print("Longitude: ");
                        double lon = sc.nextDouble(); sc.nextLine();

                        try {
                            coords.add(new Coordenada(lat, lon));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    try {
                        mapa.adicionar(nome, destino, coords);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 2);
        sc.close();
    }
}
