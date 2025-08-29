package com.tienda.util;

// BUGS:
// - Se lanza RaizNegativaException pero no se declara en el método. HECHO
// - Falta import de la excepción. HECHO

import com.tienda.excepciones.RaizNegativaException;

public class Calculadora {

    public int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se permite división por cero");
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

