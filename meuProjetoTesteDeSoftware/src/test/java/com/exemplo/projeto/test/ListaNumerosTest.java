package com.exemplo.projeto.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ListaNumerosTest {

	private static int contador;
	private ListaNumeros listaNumeros;
	
	Scanner input = new Scanner(System.in);
	
	int maior = Integer.MIN_VALUE;
	int indiceMaior = -1;

	@BeforeAll
	public static void init() {
		contador = 0;
	}

	// @BeforeEach: Executa antes de cada método de teste
	@BeforeEach
	public void setup() {
		listaNumeros = new ListaNumeros();
	}
	
	@Test
	@Order(1)
	public void findBigValue() {
		contador++;
	
	}

	@Test
	@Order(2)
	public void findSmallValue() {
		contador++;
	}

	@Test
	@Order(3)
	public void isEmpity() {
		contador++;
	}

	@AfterAll
	public static void finaliza() {
		System.out.println("Total de testes executados: " + contador);
	}

}
