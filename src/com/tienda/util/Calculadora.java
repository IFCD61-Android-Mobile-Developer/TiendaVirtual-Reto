package com.tienda.util;

// BUGS:
// - Se lanza RaizNegativaException pero no se declara en el método.
// - Falta import de la excepción.

import com.tienda.excepciones.RaizNegativaException;

public class Calculadora {

    public int dividir(int a, int b) throws ArithmeticException {
        // BUG: no validar b == 0 (ArithmeticException)
        if(b == 0){
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }

    public double raizCuadrada(double x) /* falta throws RaizNegativaException */ {
        if (x < 0) {
            throw new RaizNegativaException("No se permite raíz de número negativo: " + x);
        }
        return Math.sqrt(x);
    }
}

