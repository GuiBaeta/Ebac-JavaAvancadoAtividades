package atividade1e3.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

import atividade1e3.main.Calculadora;

/**
 * A classe CalculadoraTest contém os testes unitários para a classe Calculadora.
 * 
 * Os testes garantem que os métodos da classe Calculadora funcionem corretamente.
 * Cada teste verifica uma operação específica: adição, subtração, multiplicação e divisão.
 */
public class CalculadoraTest {

    // Instancia a classe Calculadora para ser usada nos testes
    Calculadora calc = new Calculadora();

    /**
     * Testa a operação de adição.
     * Verifica se o método adicionar retorna o resultado correto para a soma.
     */
    @Test
    void testAdicionar() {
        assertEquals(5, calc.adicionar(2, 3));
    }

    /**
     * Testa a operação de subtração.
     * Verifica se o método subtrair retorna o resultado correto para a subtração.
     */
    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
    }

    /**
     * Testa a operação de multiplicação.
     * Verifica se o método multiplicar retorna o resultado correto para a multiplicação.
     */
    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    /**
     * Testa a operação de divisão quando o divisor não é zero.
     * Verifica se o método dividir retorna o resultado correto para a divisão.
     */
    @Test
    void testDividirSemZero() {
        assertEquals(2, calc.dividir(6, 3));
    }

    /**
     * Testa a operação de divisão quando o divisor é zero.
     * Simula entradas do usuário para corrigir a divisão por zero e garantir o funcionamento correto.
     */
    @Test
    void testDividirComEntrada() {
        // Simula entrada do usuário: 0, depois 0 novamente, e por fim 2
        String input = "0\n0\n2\n";
        InputStream stdin = System.in; // Salva o System.in original
        System.setIn(new ByteArrayInputStream(input.getBytes())); // Define a entrada simulada
        
        int resultado = calc.dividir(6, 0);
        
        // Restaurar a entrada padrão
        System.setIn(stdin);
        
        assertEquals(3, resultado); // 6 / 2 = 3
    }

}

