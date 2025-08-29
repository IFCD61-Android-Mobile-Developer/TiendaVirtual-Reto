package com.tienda.ventas;

// BUGS:
// - Usa Producto sin importar el paquete.

import com.tienda.productos.Producto;
import java.util.List;
import java.util.ArrayList;

public class Factura {
    private java.util.List<Producto> productos = new java.util.ArrayList<>(); // parche temporal

    public void agregarProducto(Producto p) {
        // BUG: no validar nulos (causa NullPointer más tarde)
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
        if(productos.size() == 0){
            return 0;
        }
        double total = calcularTotal();
        return (int) (total / productos.size());
    }

    public java.util.List<Producto> getProductos() {
        return productos;
    }
}
