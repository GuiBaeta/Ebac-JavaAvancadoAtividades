# Usando programação dinâmica

## Pergunta:
Problema: resolva o exercício 2 com programação dinâmica. Crie um algoritmo com abordagem top down e outro com bottom up e explique as diferenças entre a solução do exercício 2 e a do exercício 3.

Exemplos:

Entrada: 3
Saída: 6

Entrada: 7
Saída: 5040

Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva? Justifique sua resposta.

## Resposta:
Programação Dinâmica (Top Down e Bottom Up): Ambas as abordagens evitam recomputações e possuem complexidade linear (O(n)). A principal diferença está na forma de execução (recursiva vs. iterativa) e no impacto do overhead da recursão.
Cálculo de Fatorial Acima de 100:
Não é possível calcular corretamente o fatorial de um número acima de 100 com a solução recursiva (ou iterativa) que utiliza o tipo long, devido ao rápido crescimento dos valores e ao limite máximo que um long pode armazenar. Para números tão grandes, é necessário utilizar uma estrutura como BigInteger.
