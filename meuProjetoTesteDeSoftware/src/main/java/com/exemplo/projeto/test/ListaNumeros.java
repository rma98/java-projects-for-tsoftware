package com.exemplo.projeto.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListaNumeros {
	private List<Integer> numeros;

    public ListaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int getMaiorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        return Collections.max(numeros);
    }

    public int getMenorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        return Collections.min(numeros);
    }

    public boolean isListaVazia() {
        return numeros.isEmpty();
    }

}
