# computer-science-fundamentals

Repositório pessoal de estudos e revisões de fundamentos de Ciência da Computação: algoritmos, estruturas de dados, análise de complexidade (Big-O) e resolução de problemas.

As implementações são feitas manualmente para desenvolver entendimento dos conceitos e registrar meu processo de aprendizado. Este projeto não é uma biblioteca de algoritmos pronta para produção. Rascunhos e limitações fazem parte do estudo e não devem ser confundidos com soluções concluídas ou validadas para todos os casos.

O foco inicial dos exercícios é Java. Futuramente, algumas implementações poderão ter versões em Kotlin para comparar as linguagens e seus recursos idiomáticos. O rascunho Kotlin já existente foi preservado; nenhuma conversão foi feita.

## Algorithms

### Sorting

- [Merge Sort](algorithms/sorting/merge-sort/README.md): implementação Java existente; rascunho Kotlin incompleto.

### Searching

- Binary Search — planejado (`algorithms/searching/binary-search/`).

### Problem Solving

- Resolução de problemas — planejado (`algorithms/problem-solving/`).

## Data Structures

- Arrays — planejado.
- HashMap — planejado.
- HashSet — planejado.
- Stack — planejado.
- Queue — planejado.
- Linked List — planejado.
- Trees — planejado neste repositório.

## Complexity

- Big-O — planejado (`complexity/big-o/`).

As pastas planejadas contêm somente `.gitkeep`, para que sua estrutura seja preservada no Git. Não representam conteúdos implementados.

## Organização e execução

O projeto mantém o módulo IntelliJ existente (`merge_sort.iml`), sem adicionar Maven ou Gradle. A raiz de fontes do módulo aponta para `algorithms/sorting/merge-sort/src/`. Os arquivos atuais continuam no package padrão, sem mudanças em seu conteúdo. Os diretórios com hífen são categorias de estudo, não nomes de packages Java/Kotlin.

Abra esta pasta no IntelliJ IDEA. A configuração existente usa JDK 25 e mantém as configurações Kotlin anteriores. Para compilar e executar apenas Java, a partir da raiz do repositório:

```powershell
javac -encoding UTF-8 -d out/java algorithms/sorting/merge-sort/src/Main.java
java -cp out/java Main
```

Saída do exemplo atual:

```text
[3, 4, 5, 8, 9, 9, 11]
```

Não há suíte de testes automatizados nem wrapper de build neste projeto. Executar o exemplo é uma verificação básica, não uma validação exaustiva do algoritmo. Os arquivos compilados ficam em `out/`, já ignorado pelo Git.

O nome local do projeto foi atualizado. O histórico Git e a configuração do remoto foram preservados; renomear ou publicar o repositório no serviço remoto é uma operação separada.
