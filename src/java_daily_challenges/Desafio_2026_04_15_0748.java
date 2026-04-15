package java_daily_challenges;

/*
========================================
Gerenciamento de Mapas de Endereços
Nível: iniciante
Data: 2026_04_15_0748
========================================

ENUNCIADO:
Desenvolva um sistema que permita a entrada de endereços de clientes e a geração de mapas de endereços únicos para cada cliente.

CONCEITOS:
- mapas
- excecoes

REQUISITOS:
- O sistema deve gerar um mapa de endereços único para cada cliente
- O mapa de endereços deve conter o nome do cliente, o endereço completo e a localização no mapa
- O sistema deve validar a entrada de dados para evitar erros
- O sistema deve lançar uma exceção se a entrada de dados for inválida

EXEMPLOS:
Entrada: nome: João, endereco: Rua 1, Número 12, Bairro: Centro, Cidade: São Paulo, Estado: SP, País: Brasil | Saída esperada: {"nome":"João","endereco":{"rua":"Rua 1","numero":"12","bairro":"Centro","cidade":"São Paulo","estado":"SP","pais":"Brasil"},"localizacao":{"latitude":-23.5505,"longitude":-46.6333}}
Entrada: nome: João, endereco: Rua 1, Número 12, Bairro: Centro, Cidade: São Paulo, Estado: SP, País: Brasil, Localização: 12,23 | Saída esperada: Erro: Localização inválida
Entrada: nome: João, endereco: Rua 1, Número 12, Bairro: Centro, Cidade: São Paulo, Estado: SP, País: Brasil, Localização: 12,23, Latitude: 24,34 | Saída esperada: Erro: Localização inválida
*/

public class Desafio_2026_04_15_0748 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
