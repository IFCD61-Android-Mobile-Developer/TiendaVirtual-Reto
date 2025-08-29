package com.tienda.util;

// BUGS:
// - Falta import de la excepción.

import com.tienda.excepciones.RaizNegativaException;

public class Calculadora {

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return a / b;
    }

    public double raizCuadrada(double x) throws RaizNegativaException {
        if (x < 0) {
            throw new RaizNegativaException("No se permite raíz de número negativo: " + x);
        }
        return Math.sqrt(x);
    }
}

