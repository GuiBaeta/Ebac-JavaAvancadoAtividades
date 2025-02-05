package atividade1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SubConjuntos {

	public static Set<Integer> conjuntoS(int tamanho, Scanner sc) {
		Set<Integer> numeros = new HashSet<>();

		System.out.print("Digite os numeros do conjunto:(seprado por espaço) ");
		for (int i = 0; i < tamanho; i++) {
			int numero = sc.nextInt();
			numeros.add(numero);
		}

		return numeros;
	}

	public static Set<Set<Integer>> criarSubConjuntos(Set<Integer> conjunto, int n) {
		Set<Set<Integer>> subconjuntos = new HashSet<>();
		List<Integer> lista = new ArrayList<>(conjunto);

		gerarCombinacoes(lista, n, 0, new HashSet<Integer>(), subconjuntos);

		return subconjuntos;
	}

	public static void gerarCombinacoes(List<Integer> lista, int n, int indice, Set<Integer> atual,
			Set<Set<Integer>> subconjuntos) {
		if (atual.size() == n) {
			subconjuntos.add(new HashSet<>(atual));
			return;
		}

		for (int i = indice; i < lista.size(); i++) {
			atual.add(lista.get(i));
			gerarCombinacoes(lista, n, i + 1, atual, subconjuntos);
			atual.remove(lista.get(i));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho do conjunto: ");
		int tamanhoS = sc.nextInt();

		Set<Integer> conjunto = conjuntoS(tamanhoS, sc);

		System.out.println("Conjunto gerado: " + conjunto);

		System.out.print("Qual será o tamanho dos subconjuntos?");

		int n = sc.nextInt();

		Set<Set<Integer>> subconjuntos = criarSubConjuntos(conjunto, n);

		System.out.print("Subconjuntos criados: ");
		for (Set<Integer> subconjunto : subconjuntos) {
			System.out.print(subconjunto + " ");
		}

		sc.close();

	}

}
