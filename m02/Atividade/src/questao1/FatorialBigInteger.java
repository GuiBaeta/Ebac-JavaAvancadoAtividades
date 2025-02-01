package questao1;

import java.math.BigInteger;
import java.util.Scanner;

public class FatorialBigInteger {

	private static final int MAX_ELEMENTS = 150;
	
//	public static long CalcularFatorial(int numero) {
	public static BigInteger CalcularFatorial(int numero) {
		if (numero > MAX_ELEMENTS) {
			System.out.println("Erro: Resultado excede o limite máximo suportado (20!).");
			return BigInteger.valueOf(-1); // -1
		} else if (numero < 0) {
			System.out.println("Erro: Fatorial não é definido para números negativos.");
			return BigInteger.valueOf(-1); // -
		}
		
		
		if (numero == 0 || numero == 1) {
			return BigInteger.ONE; // 1
		}
 		
// 		Modelo não recursivo		
//		long fatorial = 1;
//		for(int i = (numero); i >= 1; i--) {
//			if (numero > 0) {
//				fatorial *= i;
//			} 
//		}
//		return fatorial;
		
		return BigInteger.valueOf(numero).multiply(CalcularFatorial(numero - 1));
				//numero * CalcularFatorial(numero - 1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para calcular o fatorial (máximo permitido: 150):");
		int entrada = sc.nextInt();
		
		System.out.println(CalcularFatorial(entrada));
		
		sc.close();

	}

}