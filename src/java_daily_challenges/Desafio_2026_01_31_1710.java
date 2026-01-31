package java_daily_challenges;

/*
========================================
Sistema de Gestão de Aluguel
Nível: iniciante
Data: 2026_01_31_1710
========================================

ENUNCIADO:
Desenvolva um sistema que permita gerenciar aluguéis de imóveis. O sistema deve armazenar informações sobre os imóveis, os alugueis e os inquilinos.

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

public class Desafio_2026_01_31_1710 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
