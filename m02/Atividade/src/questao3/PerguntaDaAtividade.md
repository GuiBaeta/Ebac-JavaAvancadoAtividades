# Comparação das Soluções de Fibonacci

## Pergunta
Calcule a complexidade de tempo das soluções da série de Fibonacci apresentadas no módulo e compare as duas. Por que a solução feita com programação dinâmica é melhor?

## Resposta:
Recursividade Pura: 
Essa abordagem realiza duas chamadas recursivas. Isso resulta em uma árvore de recursão onde muitos subproblemas são recalculados repetidamente. Assim, a complexidade de tempo é exponencial: O(2^n).
O desempenho fica insustentável para valores maiores de n.

Programação Dinâmica:
Nesta versão, cada valor da sequência é calculado apenas uma vez e, depois, reutilizado. Dessa forma, a complexidade de tempo passa a ser linear, O(n).
Melhora significativamente a performance.

Portanto, a solução com programação dinâmica é melhor porque elimina cálculos redundantes, reduzindo a complexidade de tempo de exponencial para linear, o que torna o algoritmo muito mais eficiente e escalável.
