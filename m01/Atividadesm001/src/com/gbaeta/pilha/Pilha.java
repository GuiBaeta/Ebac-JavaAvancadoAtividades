package com.gbaeta.pilha;

import java.util.ArrayList;

public class Pilha {
	private ArrayList<Integer> elementos; //Usando ArrayList para a gerar a pilha dinamica
	private int topo; //Índice do topo da pilha
	
	// Construtor para inicializar a pilha
	public Pilha() {
		this.elementos = new ArrayList<>(); 
		this.topo = -1; 
	}
	
	// Método para adicionar um elemento ao topo da pilha
	public void push(int valor) {
		elementos.add(valor);
		topo++;
	}
	
	// Método para remover um elemento do topo da pilha
	public int pop() {
		if (isEmpty()) {
			throw new StackOverflowError("A pilha está vazia");
		}
		topo--;
		return elementos.remove(elementos.size() -1);	
	}
	
	// Método para pegar o valor no topo da pilha
	public int top() {
		if (isEmpty()) {
			throw new StackOverflowError("A pilha está vazia");
		}
		return elementos.get(topo);
	}
	
	// Método para verificar se a lista está vazia
	public boolean isEmpty() {
		return elementos.isEmpty();
	}
	
	// Método para verificar o tamanho da pilha
	public int size() {
		return elementos.size();
	}
	
	public ArrayList<Integer> getElementos() {
		return elementos;
	}

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println("A pilha está vazia: " + pilha.isEmpty());
		System.out.println("Adicionar os inteiros 20 e 40 à pilha: ");
		pilha.push(20);
		pilha.push(40);
	
		System.out.println("Verificar valor no topo da pilha: " + pilha.top());
		System.out.println("A pilha está vazia: " + pilha.isEmpty());
		System.out.println("Tamanho da pilha: " + pilha.size());
		
		System.out.println("Adicionar o inteiro 60 à pilha: ");
		pilha.push(60);
		System.out.println("Verificar valor no topo da pilha: " + pilha.top());
		
		
		System.out.println("Deletei um elemento da pilha usando o pop:");
		pilha.pop();
		System.out.println("Verificar valor no topo da pilha: " + pilha.top());;
		
		System.out.println("Deletei mais elemento da pilha usando o pop:");
		pilha.pop();
		System.out.println("Verificar valor no topo da pilha: " + pilha.top());;
		System.out.println("Tamanho da pilha:" + pilha.size());
		
		
	}

}
