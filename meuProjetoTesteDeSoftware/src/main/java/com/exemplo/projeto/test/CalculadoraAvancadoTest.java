package com.exemplo.projeto.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Ordena a execução dos testes
public class CalculadoraAvancadoTest {

    private static int contador;
    private Calculadora calculadora;

    @BeforeAll
    public static void init() {
        contador = 0;
    }
    
    // @BeforeEach: Executa antes de cada método de teste
    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @Order(1)
    @DisplayName("Teste de Soma")
    public void testeSoma() {
        contador++;
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado, "A soma de 2 e 3 deve ser 5");
    }

    @Test
    @Order(2)
    @DisplayName("Teste de Subtração")
    public void testeSubtracao() {
        contador++;
        int resultado = calculadora.subtrair(5, 2);
        assertEquals(3, resultado, "A subtração de 5 e 2 deve ser 3");
    }

    @AfterAll
    public static void finaliza() {
        System.out.println("Total de testes executados: " + contador);
    }
}
