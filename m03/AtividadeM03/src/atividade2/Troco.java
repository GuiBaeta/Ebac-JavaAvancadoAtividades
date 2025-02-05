package atividade2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Troco {
	
	public static int[] pegarValoresMoedas() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Há quantas moedas disponiveis? ");
		int quantidade = sc.nextInt();
		
		int[] moedas = new int[quantidade];
		
		System.out.println("Informe os valores das moedas:");
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Moeda " + (i + 1) + ": ");
			moedas[i] = sc.nextInt();
		}
		
		return moedas;
	}
	
	public List<Integer> menorQuantidadesDeMoedas(int valorTroco, int[] pegarValoresMoedas) {
		int troco = valorTroco;
		int[] moedas = pegarValoresMoedas;
		Arrays.sort(moedas);
		List<Integer> listaMoedas = new ArrayList<>();
		
		moedas = IntStream.of(moedas)
                .boxed() // Converte para Integer
                .sorted(Collections.reverseOrder()) // Ordena ao contrário
                .mapToInt(Integer::intValue) // Converte de volta para int[]
                .toArray();
		
		for (int i = 0; i < moedas.length && troco > 0; i++) {
            while (troco >= moedas[i]) { // Enquanto a moeda couber no troco, use-a
                troco -= moedas[i];
                listaMoedas.add(moedas[i]);
            }
        }
		
		return listaMoedas;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Troco trocoObj = new Troco();
		
		System.out.print("Digite o valor do troco: ");
		int valorTroco = sc.nextInt();
		
		int[] moedas = pegarValoresMoedas();
		
		List<Integer> listaMoedas = trocoObj.menorQuantidadesDeMoedas(valorTroco, moedas);
		
		System.out.println("Moedas usadas: " + listaMoedas);
		
		sc.close();

	}

}
