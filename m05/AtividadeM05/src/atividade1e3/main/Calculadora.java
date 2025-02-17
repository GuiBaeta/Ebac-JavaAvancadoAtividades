package atividade1e3.main;

import java.util.Scanner;
/**
 * A classe Calculadora fornece métodos básicos de operações matemáticas.
 * 
 * As operações suportadas incluem adição, subtração, multiplicação e divisão.
 * O método de divisão trata entradas inválidas (divisão por zero) pedindo ao usuário para inserir um valor válido.
 */
public class Calculadora {
	
	 /**
     * Realiza a adição de dois números inteiros.
     * 
     * @param a Primeiro número a ser somado
     * @param b Segundo número a ser somado
     * @return O resultado da soma de a e b
     */
	public int adicionar(int a, int b) {
		return a + b;
	}
	
	/**
     * Realiza a subtração de dois números inteiros.
     * 
     * @param a Número de onde será subtraído
     * @param b Número a ser subtraído
     * @return O resultado da subtração de a e b
     */
	public int subtrair(int a, int b) {
		return a - b;
		
	}
	
	/**
     * Realiza a multiplicação de dois números inteiros.
     * 
     * @param a Primeiro número a ser multiplicado
     * @param b Segundo número a ser multiplicado
     * @return O resultado da multiplicação de a e b
     */
	public int multiplicar(int a, int b) {
		return a * b;
		
	}
	
	 /**
     * Realiza a divisão de dois números inteiros, verificando se o divisor não é zero.
     * Caso o divisor seja zero, solicita ao usuário um novo valor para o divisor.
     * 
     * @param a Número a ser dividido
     * @param b Número divisor
     * @return O resultado da divisão de a por b
     */
	public int dividir(int a, int b) {
		Scanner sc = new Scanner(System.in);
		while (b == 0) {
			System.out.print("Não é possível dividir algo por zero, digite novamente o segundo valor:  ");
			b = sc.nextInt();
		}	
		return a / b;
		
	}
	
	 /**
     * Método principal para execução interativa da calculadora.
     * Permite que o usuário insira dois números e um operador para realizar uma operação matemática.
     * 
     * @param args Parâmetros de entrada (não utilizados)
     */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("### Calculadora ###");
		
		System.out.print("Digite o primeiro número: ");
		int primeiroValor = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int segundoValor = sc.nextInt();
		
		System.out.print("Digite o operador da operação que deseja fazer adição(+), subtração(-), multiplicação(*), divisão(/): ");
		String operador = sc.next();
		
		Calculadora calc = new Calculadora();
		
		int resultado;
		switch  (operador) {
		case "+":
			resultado = calc.adicionar(primeiroValor,segundoValor);
			break;
		case "-":
			resultado = calc.subtrair(primeiroValor,segundoValor);
			break;
		case "*":
			resultado = calc.multiplicar(primeiroValor,segundoValor);
			break;
		case "/":
			resultado = calc.dividir(primeiroValor,segundoValor);
			break;
		default:
			System.out.println("Operador inválido!");
			sc.close();
			return;
		}
		
		System.out.println("Resultado: " + resultado);
		
		
		sc.close();

	}

}
