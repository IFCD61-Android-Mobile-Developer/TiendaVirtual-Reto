package com.tienda.ventas;

// BUGS:
// - Falta importar List y ArrayList (compila mal).
// - Usa Producto sin importar el paquete.
// - Posible división por cero si la lista está vacía.
import java.util.List;
import com.tienda.productos.Producto;
// falta: import java.util.List;
// falta: import java.util.ArrayList;

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
        // BUG: división por cero si no hay productos
        double total = calcularTotal();
        return (int) (total / productos.size());
    }

    public java.util.List<Producto> getProductos() {
        return productos;
    }
}
