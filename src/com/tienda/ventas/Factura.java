package com.tienda.ventas;

// BUGS:
// - Falta importar List y ArrayList (compila mal). HECHO
// - Usa Producto sin importar el paquete.
// - Posible división por cero si la lista está vacía.

import com.tienda.productos.Producto;
import java.util.List;
import java.util.ArrayList;

public class Factura {
    private java.util.List<Producto> productos = new java.util.ArrayList<>(); // parche temporal

    public void agregarProducto(Producto p) {
        // Comprobación y excepción para evitar agregar un producto nulo.
        if (p == null) {
            throw new IllegalArgumentException("No se puede agregar un producto nulo.");
        }
        productos.add(p);
    }

    public double calcularTotal() {
        double suma = 0;
        for (Producto p : productos) {
            suma += p.getPrecio();
        }
        return suma;
    }

    public int calcularPromedioEntero() {
        double total = calcularTotal();
        // Si no hay producto se obtiene un valor de 0.
        if (productos.isEmpty()) {
            return 0;
        }
        return (int) (total / productos.size());
    }

    public java.util.List<Producto> getProductos() {
        return productos;
    }
}
