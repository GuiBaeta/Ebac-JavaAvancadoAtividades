package questao2;

import java.util.Scanner;

public class FatorialBottomUp {

	private static final int ELEMENTO_MAXIMO = 150;
	private static final long[] ElementoFatorado = new long[ELEMENTO_MAXIMO];

	public static long CalcularFatorialDP(int numero) {
		if (numero > ELEMENTO_MAXIMO) {
			System.out.println("Erro: O número excede o limite máximo suportado de " + ELEMENTO_MAXIMO + ".");
			return -1;
		}

		for (int i = 0; i < ELEMENTO_MAXIMO; i++) {
			ElementoFatorado[i] = -1;
		}

		ElementoFatorado[0] = 1;
		ElementoFatorado[1] = 1;

		for (int i = 2; i <= numero; i++) {
			ElementoFatorado[i] = i * ElementoFatorado[i - 1];
		}

		return ElementoFatorado[numero];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para calcular o fatorial (máximo permitido: " + ELEMENTO_MAXIMO + "):");
		int entrada = sc.nextInt();

		System.out.println(CalcularFatorialDP(entrada));

		sc.close();

	}

}
