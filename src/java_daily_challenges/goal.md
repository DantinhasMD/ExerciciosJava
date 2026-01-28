PROJETO: Daily Java Challenges com IA
====================================

OBJETIVO
--------
Este projeto tem como objetivo criar um sistema automatizado que gera
desafios diários de programação em Java, com foco em Java Backend e
Spring Boot, adaptando a complexidade dos desafios de acordo com o
nível de conhecimento do usuário (iniciante, intermediário ou avançado).

A proposta não é apenas treinar sintaxe, mas sim expor o usuário a
problemas progressivamente mais realistas, próximos do dia a dia de
desenvolvimento backend.


FUNCIONAMENTO GERAL
-------------------
O sistema funciona de forma totalmente automatizada através de um
workflow do GitHub Actions, que roda diariamente (ou manualmente).

Fluxo resumido:
1. O workflow é disparado.
2. Um script em Python é executado.
3. O nível do usuário é carregado ou inicializado.
4. Um desafio é gerado com auxílio de IA (Groq API).
5. Um novo arquivo Java é criado com o desafio do dia.
6. O repositório é atualizado automaticamente com commit e push.


CONTROLE DE NÍVEL (nivel.json)
------------------------------
O progresso do usuário é controlado por um arquivo chamado `nivel.json`,
que armazena o estado atual do aprendizado.

Estrutura do arquivo:
- nivel_atual: iniciante | intermediario | avancado
- ultima_analise: data da última avaliação de nível
- exercicios_desde_analise: contador de desafios realizados

Comportamento:
- Se o arquivo não existir, ele é criado automaticamente.
- A cada desafio gerado, o contador é incrementado.
- Ao atingir 30 desafios, o nível é automaticamente atualizado
  (iniciante → intermediário → avançado).

Esse modelo representa uma progressão por exposição e constância,
adequada para um projeto pessoal ou de estudo contínuo.

O arquivo pode ser apagado a qualquer momento para resetar o progresso,
sem quebrar o sistema.


GERAÇÃO DOS DESAFIOS (IA)
-------------------------
Os desafios são gerados dinamicamente usando a Groq API, com modelos
de linguagem de última geração.

A IA recebe um prompt estruturado que define:
- o nível do usuário
- o tipo de desafio esperado
- regras rígidas de formato (JSON)
- foco em cenários reais de backend

A resposta da IA contém:
- título do desafio
- enunciado
- requisitos funcionais
- exemplos de entrada e saída esperada

Nenhuma solução ou código é gerado pela IA, apenas o problema.


ADAPTAÇÃO POR NÍVEL
-------------------

INICIANTE:
- Lógica básica
- Entrada e saída via console
- Problemas simples com contexto real (ex: cálculos, regras básicas)

INTERMEDIÁRIO:
- Java Backend com Spring Boot
- APIs REST
- Separação de camadas
- Regras de negócio
- Modelagem de dados
- Objetivos de execução realistas

AVANÇADO:
- Decisões arquiteturais
- Design de projeto
- Escalabilidade
- Qualidade de código
- Pensamento sistêmico

Os desafios evoluem conforme o nível, aproximando-se cada vez mais de
situações reais do mercado.


ARQUIVO GERADO (.java)
----------------------
A cada execução, é criado um novo arquivo Java com:
- package padronizado
- nome de classe único baseado em timestamp
- comentário detalhado contendo:
    - título
    - nível
    - data
    - enunciado
    - requisitos
    - exemplos de entrada e saída

O corpo da classe contém apenas a estrutura inicial, cabendo ao usuário
implementar a solução.


AUTOMAÇÃO COM GITHUB ACTIONS
----------------------------
O projeto utiliza GitHub Actions para:
- rodar diariamente via cron
- permitir execução manual
- instalar dependências
- executar o script Python
- versionar automaticamente os desafios gerados

Toda a automação utiliza o token padrão do GitHub para autenticação,
sem necessidade de credenciais adicionais no código.


ESTADO ATUAL DO PROJETO
----------------------
- Geração diária automática de desafios
- Integração com IA funcional e robusta
- Controle de progressão por nível
- Código tolerante a falhas de API
- Estrutura pronta para expansão

Este projeto pode ser usado como:
- rotina pessoal de estudos
- material de portfólio
- base para produto educacional
- laboratório de práticas DevOps + Backend


EVOLUÇÕES FUTURAS (OPCIONAIS)
-----------------------------
- Desafios de avaliação para subida de nível
- Geração automática de testes JUnit
- Validação de soluções no CI
- Controle de streak e progresso
- Publicação automática no README

--------------------------------
Fim da descrição do projeto.
