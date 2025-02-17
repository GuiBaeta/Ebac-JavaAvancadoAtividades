package atividade2.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import atividade2.main.Fibonacci;

/**
 * A classe FibonacciTest contém os testes unitários para a classe Fibonacci.
 * 
 * Os testes garantem que os métodos da classe Fibonacci funcionem corretamente.
 */
public class FibonacciTest {

	// Instancia a classe Fibonacci para ser usada nos testes
	Fibonacci fibo = new Fibonacci();
	
	/**
	 * Testa o Fibonacci para o primeiro caso Elementar.
	 */
	@Test
	void testFibonacciElementary1() {
		assertEquals(1, fibo.findElementDP(1));
	}
	
	/**
	 * Testa o Fibonacci para o segundo caso Elementar.
	 */
	@Test
	void testFibonacciElementary2() {
		assertEquals(1, fibo.findElementDP(2));
	}
	
	/**
	 * Testa o Fibonacci para o elemento 20.
	 */
	@Test
	void testFibonacciElement20() {
		assertEquals(6765, fibo.findElementDP(20));
	}
}
