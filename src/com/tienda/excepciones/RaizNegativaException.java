package com.tienda.excepciones;

public class RaizNegativaException extends RuntimeException {
    // BUG intencional pedagógico: ¿debería ser checked (extends Exception) o unchecked?
    public RaizNegativaException(String msg) {
        super(msg);
    }
}

