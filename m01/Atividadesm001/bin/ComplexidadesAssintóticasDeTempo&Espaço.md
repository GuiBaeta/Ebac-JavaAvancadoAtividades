# Estruturas de Dados

## Pilha
**Tempo:**  
- **Push:** O(1), utilizei um ArrayList na criação da pilha.  
  - Caso geral (sem redimensionamento): Adicionar um elemento ao final do ArrayList tem complexidade O(1).  
  - Caso de redimensionamento: Quando o array subjacente precisa ser redimensionado, o custo é O(n), onde `n` é o número de elementos na lista.  
  - **Complexidade média:** Devido à amortização do redimensionamento, a complexidade média para uma sequência de operações push é O(1).  
- **Pop:** O(1), remove o último elemento do ArrayList e retorna seu valor. A remoção do último elemento é uma operação direta.  

**Espaço:** O(n), o espaço necessário para o armazenamento é diretamente proporcional ao número de elementos na pilha.

---

## Fila
**Tempo:**  
- **Enqueue:** O(1), adiciona um elemento ao final da fila.  
  - Verifica se a fila está cheia.  
  - Atualiza o índice `fim` de maneira circular com `fim=(fim+1)%elementos.length`.  
  - Armazena o novo elemento no índice `fim`.  
  - Todas essas operações são realizadas em tempo constante.  
- **Dequeue:** O(1), remove o elemento do início da fila.  
  - Verifica se a fila está vazia.  
  - Captura o elemento do índice `inicio`.  
  - Atualiza o índice `inicio` de maneira circular com `inicio=(inicio+1)%elementos.length`.  
  - Atualiza o tamanho da fila.  
  - Todas essas operações são realizadas em tempo constante.  
- **Rear:** O(1), retorna o elemento localizado no índice `fim`.  
  - A operação de acesso ao índice `fim` em um array é constante.  
- **Front:** O(1), retorna o elemento localizado no índice `inicio`.  
  - A operação de acesso ao índice `inicio` em um array é constante.  

**Espaço:** O(n), a estrutura utiliza um array fixo para armazenar os elementos da fila. O espaço necessário é proporcional ao tamanho do array fornecido no momento da inicialização.

---

## Lista Encadeada
**Tempo:**  
- **Push:** O(n), adiciona um nó ao final da lista.  
  - No pior caso, percorre todos os nós da lista até encontrar o último (quando a lista não está vazia).  
- **Pop:** O(n), remove o último nó da lista.  
  - No pior caso, percorre todos os nós da lista para encontrar o penúltimo (necessário para atualizar o ponteiro `proximo` do nó anterior).  
- **Insert:** O(1), insere um nó em uma posição específica:  
  - Verifica se o índice é válido.  
  - Percorre até o índice desejado (ou o nó anterior a ele).  
  - Insere o novo nó atualizando os ponteiros.  
  - No pior caso (inserção no final da lista), o método percorre todos os nós.  
- **Remove:** O(n), remove um nó em uma posição específica:  
  - Verifica se o índice é válido.  
  - Percorre até o índice desejado (ou o nó anterior a ele).  
  - Remove o nó atualizando os ponteiros.  
  - No pior caso (remoção do último nó), o método percorre todos os nós.  
- **elementAt:** O(n), retorna o nó na posição especificada:  
  - Verifica se o índice é válido.  
  - Percorre até o índice desejado.  
  - No pior caso (acesso ao último nó), o método percorre todos os nós.  

**Espaço:** O(n), a estrutura utiliza um espaço proporcional ao número de nós presentes na lista.  
Cada nó ocupa espaço para armazenar seu valor e um ponteiro para o próximo nó.
