package java_daily_challenges;

/*
========================================
Sistema de Navegação
Nível: iniciante
Data: 2026_03_06_0651
========================================

ENUNCIADO:
Desenvolva um sistema que permita navegar por uma cidade com várias ruas e avenidas. O sistema deve aceitar comandos para mover-se para uma rua ou avenida adjacente.

CONCEITOS:
- mapas
- exceções

REQUISITOS:
- O mapa deve ter uma estrutura de árvore para representar as ruas e avenidas.
- Os comandos devem ser validados para evitar movimentos inválidos.
- O sistema deve lidar com exceções caso o usuário tente mover-se para uma rua ou avenida inexistente.

EXEMPLOS:
Entrada: inicializar mapa com ruas e avenidas | Saída esperada: {"ruas": [{"nome": "Rua 1", "adjacentes": ["Avenida 1"]}, {"nome": "Rua 2", "adjacentes": ["Avenida 2"]}], "avenidas": [{"nome": "Avenida 1", "adjacentes": ["Rua 1"]}, {"nome": "Avenida 2", "adjacentes": ["Rua 2"]}]}
Entrada: mover-se para Rua 3 | Saída esperada: Erro: Rua 3 não existe no mapa
Entrada: mover-se para Avenida 1 | Saída esperada: {"ruas": [{"nome": "Rua 1", "adjacentes": ["Avenida 1"]}, {"nome": "Rua 2", "adjacentes": ["Avenida 2"]}], "avenidas": [{"nome": "Avenida 1", "adjacentes": ["Rua 1"]}, {"nome": "Avenida 2", "adjacentes": ["Rua 2"]}], "posicao": "Rua 1"}
*/

public class Desafio_2026_03_06_0651 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
