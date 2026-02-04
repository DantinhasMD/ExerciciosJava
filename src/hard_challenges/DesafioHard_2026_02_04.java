package hard_challenges;

/*
========================================
Sistema de Gestão de Ordens de Serviço
DESAFIO HARD
Data: 2026_02_04
========================================

ENUNCIADO:
Desenvolva um sistema que gerencie ordens de serviço para um setor de manutenção de equipamentos críticos. O sistema deve permitir a criação, edição e remoção de ordens de serviço, bem como a atribuição de técnicos responsáveis por cada ordem.

CONCEITOS:
- collections_list
- collections_set

FOCO TÉCNICO:
- O sistema utilizará uma lista para armazenar as ordens de serviço ativas, com cada item da lista representando uma ordem de serviço. A lista será ordenada por data de criação.
- O sistema utilizará um conjunto para armazenar os técnicos disponíveis, com cada item do conjunto representando um técnico. O conjunto será utilizado para evitar a atribuição de técnicos duplicados a ordens de serviço.
- O sistema utilizará métodos de busca e ordenação para facilitar a localização e gerenciamento das ordens de serviço.

REQUISITOS:
- O sistema deve permitir a criação de novas ordens de serviço com informações de cliente, equipamento, data de criação e descrição da ordem.
- O sistema deve permitir a edição de ordens de serviço existentes, incluindo a atualização de informações de cliente, equipamento, data de criação e descrição da ordem.
- O sistema deve permitir a remoção de ordens de serviço ativas.
- O sistema deve atribuir técnicos responsáveis por cada ordem de serviço, garantindo que cada técnico não seja atribuído a mais de uma ordem de serviço ao mesmo tempo.
- O sistema deve fornecer uma lista de ordens de serviço ativas, ordenadas por data de criação.
- O sistema deve fornecer uma lista de técnicos disponíveis.
- O sistema deve fornecer uma lista de ordens de serviço atribuídas a cada técnico.
- O sistema deve detectar e evitar a atribuição de técnicos duplicados a ordens de serviço.
- O sistema deve detectar e evitar a remoção de ordens de serviço que não existem ou que estão atribuídas a técnicos.

EXEMPLOS:
Entrada: {"ordemDeServico":{"cliente":"João","equipamento":"Computador","dataDeCriacao":"2022-01-01","descricao":"Problema de hardware"},"técnicos":["João","Maria"]} | Saída esperada: {"ordemDeServico":{"cliente":"João","equipamento":"Computador","dataDeCriacao":"2022-01-01","descricao":"Problema de hardware","técnico":"João"}}
Entrada: {"ordemDeServico":{"cliente":"João","equipamento":"Computador","dataDeCriacao":"2022-01-01","descricao":"Problema de hardware"},"técnicos":["João","Maria"]} | Saída esperada: {"erro":"Técnico duplicado"}
Entrada: {"ordemDeServico":{"cliente":"João","equipamento":"Computador","dataDeCriacao":"2022-01-01","descricao":"Problema de hardware"},"técnicos":["João"]} | Saída esperada: {"ordemDeServico":{"cliente":"João","equipamento":"Computador","dataDeCriacao":"2022-01-01","descricao":"Problema de hardware","técnico":"João"}}
Entrada: {"ordemDeServico":{"cliente":"João","equipamento":"Computador","dataDeCriacao":"2022-01-01","descricao":"Problema de hardware"},"técnicos":["João"]} | Saída esperada: {"erro":"Ordem de serviço não encontrada"}
*/

public class DesafioHard_2026_02_04 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
