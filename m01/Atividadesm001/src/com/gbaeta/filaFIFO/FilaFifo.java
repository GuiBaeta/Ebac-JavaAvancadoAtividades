package com.gbaeta.filaFIFO;

public class FilaFifo {

	private int[] elementos;
	private int tamanho;
	private int inicio;
	private int fim;

	public FilaFifo(int capacidade) {
		this.elementos = new int[capacidade];
		this.tamanho = 0;
		this.inicio = 0;
		this.fim = -1;
	}

	// Adicionar um elemento ao final da filas
	public void enqueue(int elemento) {
		if (tamanho == elementos.length) {
			throw new IllegalStateException("A fila está cheia. Não é possível enfileirar.");
		}
		fim = (fim + 1) % elementos.length;
		elementos[fim] = elemento;
		tamanho++;
	}

	// Remove um inteiro da fila
	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia. Não é possível desenfileirar.");
		}
		int elementoRemovido = elementos[inicio];
		inicio = (inicio + 1) % elementos.length;
		tamanho--;
		return elementoRemovido;
	}

	// Retorna o inteiro que está no fim da fila
	public int rear() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia. Não é possível acessar o final da fila.");
		}
		return elementos[fim];
	}

	// Retorna o inteiro que está na frente da fila
	public int front() {
		if (isEmpty()) {
			throw new IllegalStateException("A fila está vazia. Não é possível acessar o final da fila.");
		}
		return elementos[inicio];
	}

	// Retorna o tamanbho da fila
	public int size() {
		return tamanho;
	}

	// Retorna se está vazio ou não
	public boolean isEmpty() {
		return tamanho == 0;
	}

	public static void main(String[] args) {
		FilaFifo fila = new FilaFifo(5);

		// Testando os métodos
		fila.enqueue(10);
		fila.enqueue(20);
		fila.enqueue(30);

		System.out.println("Elemento na frente da fila: " + fila.front()); // Exibe 10
		System.out.println("Elemento no fim da fila: " + fila.rear()); // Exibe 30

		System.out.println("Tamanho da fila: " + fila.size()); // Exibe 3

		System.out.println("Removido: " + fila.dequeue()); // Exibe 10

		System.out.println("Elemento na frente da fila: " + fila.front()); // Exibe 20

		System.out.println("A fila está vazia? " + fila.isEmpty()); // Exibe false

		fila.enqueue(40);
		fila.enqueue(50);

		System.out.println("Elemento no fim da fila: " + fila.rear()); // Exibe 50

		System.out.println("Tamanho da fila: " + fila.size()); // Exibe 4

	}

}
