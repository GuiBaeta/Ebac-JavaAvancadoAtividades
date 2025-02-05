# Fatorial usando recursão

## Pergunta
Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva?


## Resposta:
Inicialmente, implementei o código usando long, mas percebi que ele só suporta fatoriais até 20!, pois valores maiores ultrapassam o limite desse tipo de dado, causando overflow e resultando em valores incorretos.
Pesquisando sobre alternativas para lidar com números grandes, encontrei a classe BigInteger, da biblioteca java.math, que permite representar e manipular inteiros extremamente grandes, muito além do que int ou long conseguem armazenar.
Fiz as adaptações necessárias no código para utilizar BigInteger e testei diferentes valores. O maior que validei foi 120!, mas acredito que consiga calcular valores maiores, e o resultado bateu com o que encontrei na internet.
Portanto, para calcular fatoriais acima de 20!, é essencial utilizar BigInteger, garantindo que os números possam crescer sem sofrer limitações de armazenamento.