package questao2;

import java.util.Scanner;

public class FatorialTopDown {

	private static final int ELEMENTO_MAXIMO = 20;
	private static final long[] ElementoFatorado = new long[ELEMENTO_MAXIMO];

	public static long CalcularFatorialDP(int numero) {
		if (numero > ELEMENTO_MAXIMO) {
			System.out.println("Erro: Resultado excede o limite máximo suportado de" + ELEMENTO_MAXIMO + ".\"");
			return -1;
		}
		
		for (int i = 0; i < ELEMENTO_MAXIMO; i++) {
			ElementoFatorado[i] = -1;
		}
		return CalcularFatorial(numero);
	}

	public static long CalcularFatorial(int numero) {
		if (ElementoFatorado[numero] != -1) {
			return ElementoFatorado[numero];
		}

		if (numero == 0 || numero == 1) {
			ElementoFatorado[numero] = 1;
		} else {
			ElementoFatorado[numero] = numero * CalcularFatorial(numero - 1);
		}

		return ElementoFatorado[numero];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para calcular o fatorial (máximo permitido: 20):");
		int entrada = sc.nextInt();

		System.out.println(CalcularFatorialDP(entrada));

		sc.close();

	}

}
