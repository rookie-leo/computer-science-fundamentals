# Merge Sort

Estratégia: **Divide and Conquer** (divisão e conquista).

## Funcionamento

1. Divide a lista pela metade.
2. Continua recursivamente até listas de tamanho menor ou igual a 1, que já estão ordenadas.
3. Ordena recursivamente as duas metades.
4. Combina as duas listas ordenadas utilizando dois ponteiros, um para cada metade. Compara os elementos atuais, adiciona o menor ao resultado e avança seu ponteiro. Quando uma metade termina, adiciona os elementos restantes da outra.

## Complexidade

- Merge: O(n), considerando n como a soma dos tamanhos das duas metades.
- Merge Sort: O(n log n).
- Espaço auxiliar: O(n), além da pilha recursiva O(log n); o total permanece O(n).

Existem aproximadamente log n níveis de divisão. Em cada nível, os merges processam, no total, n elementos. Isso resulta em O(n log n). As cópias usadas na divisão também percorrem os elementos e não alteram essa ordem de crescimento.

O trade-off é um tempo previsível O(n log n), inclusive no pior caso, em troca de memória auxiliar durante o merge. O espaço O(n) descreve a memória simultaneamente necessária, não a soma de todas as alocações ao longo da execução.

Esses custos pressupõem acesso por índice O(1), como nas listas baseadas em arrays usadas pelo exemplo Java. A assinatura aceita `List`, mas listas encadeadas podem tornar os acessos por índice mais caros.

## Arquivos e estágio do estudo

- [src/Main.java](src/Main.java): implementação manual existente e exemplo executável.
- [src/Main.kt](src/Main.kt): rascunho anterior preservado, ainda incompleto; não é uma versão equivalente concluída.

Nenhum algoritmo, nome de método ou comportamento foi alterado durante a reorganização.

## Limitações observadas no código existente

No rascunho Kotlin:

- `mergeSort` retorna uma lista vazia quando a entrada tem mais de um elemento; a divisão recursiva ainda não foi implementada.
- `merge` acessa `left[i + 1]` no último índice de uma lista esquerda não vazia, ultrapassando seus limites. O exemplo atual chega a esse caso.
- `right.indices - 1` remove o índice de valor 1 do conjunto de índices; não significa encerrar a iteração uma posição antes do fim. Assim, o acesso `right[i + 1]` também pode ultrapassar os limites.
- O merge compara vizinhos dentro de cada metade e concatena resultados parciais; ainda não combina as duas metades ordenadas com dois ponteiros.

Esses pontos foram apenas documentados. No Java, há imports não utilizados de `HashSet` e `Set`, também preservados. O exemplo Java executa corretamente, mas não existe suíte automatizada que cubra os demais casos.
