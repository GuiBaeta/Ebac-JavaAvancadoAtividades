package com.gbaeta.listaEncadeada;

public class ListaEncadeada {

	private No cabeca;
	private int tamanho;

	public ListaEncadeada() {
		this.cabeca = null;
		this.tamanho = 0;
	}

	// Adiciona um nó ao final da lista
	public void push(No no) {
		if (cabeca == null) {
			cabeca = no;
		} else {
			No atual = cabeca;
			while (atual.proximo != null) {
				atual = atual.proximo;
			}
			atual.proximo = no;
		}
		tamanho++;
	}

	// Remove o nó do final da lista e o retorna
	public No pop() {
		if (cabeca == null) {
			return null;
		} else if (cabeca.proximo == null) {
			No temporario = cabeca;
			cabeca = null;
			tamanho--;
			return temporario;
		} else {
			No atual = cabeca;
			while (atual.proximo.proximo != null) {
				atual = atual.proximo;
			}
			No temporario = atual.proximo;
			atual.proximo = null;
			tamanho--;
			return temporario;
		}
	}

	// Insere um nó em uma posição específica da lista
	public void insert(int index, No no) {
		if (index < 0 || index > tamanho) {
			throw new IndexOutOfBoundsException("Índice fora dos limites");
		}
		if (index == 0) {
			no.proximo = cabeca;
			cabeca = no;
		} else {
			No atual = cabeca;
			for (int i = 0; i < index - 1; i++) {
				atual = atual.proximo;
			}
			no.proximo = atual.proximo;
			atual.proximo = no;
		}
		tamanho++;
	}

	// Remove o nó em uma posição específica da lista
	public void remove(int index) {
		if (index < 0 || index >= tamanho) {
			throw new IndexOutOfBoundsException("Índice fora dos limites");
		}

		if (index == 0) {
			cabeca = cabeca.proximo;
		} else {
			No atual = cabeca;
			for (int i = 0; i < index - 1; i++) {
				atual = atual.proximo;
			}
			atual.proximo = atual.proximo.proximo;
		}
		tamanho--;
	}

	 // Retorna o nó na posição indicada
    public No elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }

        No atual = cabeca;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    // Retorna o tamanho atual da lista
    public int size() {
        return tamanho;
    }
    
	public void printList() {
		No atual = cabeca;
		StringBuilder sb = new StringBuilder();
		while (atual != null) {
			sb.append(atual.valor).append(" -> ");
			atual = atual.proximo;
		}
		sb.append("null");
		System.out.println(sb.toString());
	}

	public static class No {
		int valor;
		No proximo;

		public No(int valor) {
			this.valor = valor;
			this.proximo = null;
		}
	}

	public static void main(String[] args) {

		ListaEncadeada lista = new ListaEncadeada();

		
		lista.printList(); //Imprimir lista vazia
		lista.push(new No(10)); //Adicionar primeiro valor
		lista.printList(); //Imprimir lista
		lista.push(new No(20)); //Adicionar segundo valor
		lista.push(new No(30)); //Adicionar terceiro valor 
		lista.push(new No(40)); //Adicionar quarto valor
		lista.printList(); //Imprimir lista 
		
		lista.pop(); //Remover último no
		lista.printList(); //Imprimir lista
		
		lista.insert(1, new No(50)); //Inserir novo valor no campo especifico
		lista.printList(); //Imprimir lista
		
		lista.remove(2); //Remover nó especifico
		lista.printList(); //Imprimir lista
		
		System.out.println(lista.elementAt(2).valor); //Imprimir nó na posição 2
		System.out.println(lista.tamanho); //Imprimir tamanho da lista

	}

}
