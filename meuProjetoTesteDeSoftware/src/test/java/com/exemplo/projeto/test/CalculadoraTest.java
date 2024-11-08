package com.exemplo.projeto.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    // @BeforeEach: Executa antes de cada método de teste
    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

    // @Test: Indica que este é um método de teste
    @Test
    public void testSomar() {
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado, "A soma de 2 e 3 deve ser 5");
    }

    @Test
    public void testSubtrair() {
        int resultado = calculadora.subtrair(5, 2);
        assertEquals(3, resultado, "A subtração de 5 e 2 deve ser 3");
    }
}