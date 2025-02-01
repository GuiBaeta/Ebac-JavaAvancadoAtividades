package questao1;

import java.util.Scanner;

public class Fatorial {

	private static final int MAX_ELEMENTS = 20;
	
public static long CalcularFatorial(int numero) {
		if (numero > MAX_ELEMENTS) {
			System.out.println("Erro: Resultado excede o limite máximo suportado (20!).");
			return -1;
		} else if (numero < 0) {
			System.out.println("Erro: Fatorial não é definido para números negativos.");
			return -1;
		}
		
		
		if (numero == 0 || numero == 1) {
			return 1;
		}
 		
		return numero * CalcularFatorial(numero - 1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para calcular o fatorial (máximo permitido: 150):");
		int entrada = sc.nextInt();
		
		System.out.println(CalcularFatorial(entrada));
		
		sc.close();

	}

}