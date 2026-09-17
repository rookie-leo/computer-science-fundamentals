# MyLittleTree — etapa 1: construir por niveis

Implemente `Node` e `MyLittleTree.buildFromLevelOrder(List<Integer> values)`.
O preenchimento ocorre por niveis, da esquerda para a direita. Nao ordene
os valores nem aplique regras de BST nesta etapa.

```text
Entrada: [8, 3, 10, 1, 6, 14, 4]

          8
        /   \
       3     10
      / \   / \
     1   6 14   4
```

## Contrato

- Entrada: lista nao nula de inteiros nao nulos; pode estar vazia.
- Saida: referencia para a raiz; lista vazia retorna `null`.
- Preserve a ordem, os valores e as duplicatas (cada ocorrencia e um no).
- Nao modifique a lista de entrada; listas imutaveis tambem sao aceitas.
- Cada construcao deve produzir novos nos, sem compartilhar nos entre chamadas.
- Ausencia de filho e representada por `null`.
- Entradas nulas ou com elementos nulos estao fora do contrato desta etapa.

## Sua implementacao

`Node.java` tem apenas assinaturas de `getValue`, `getLeft` e `getRight`.
Voce decide os campos, construtores e demais metodos. Mantenha essas
assinaturas para que os testes possam observar a arvore.

`MyLittleTree.java` contem somente a assinatura do metodo de construcao.
Os metodos lancam `UnsupportedOperationException` ate serem implementados.

Antes de codificar, explique a estrategia e estime tempo, espaco auxiliar
e espaco da arvore produzida. Nao altere os resultados esperados dos testes.

## Executar

No IntelliJ, execute `TestRunner.main`. O Main original foi preservado.
O executor mostra todos os casos antes de encerrar com falha se houver
algum resultado incorreto. Inicialmente os 11 testes falham de proposito.

Os testes conferem valores, posicoes, filhos ausentes, identidade dos nos,
preservacao da entrada e independencia de chamadas. A estrutura Expected
e apenas um desenho usado pelo teste, nao uma implementacao do seu Node.

Contagem, altura, folhas, percursos e validacao de BST serao etapas futuras
neste mesmo projeto; nao fazem parte dos testes atuais.
