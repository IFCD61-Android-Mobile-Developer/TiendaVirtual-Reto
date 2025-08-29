package com.tienda.ventas;

// BUGS:
// - Falta importar List y ArrayList (compila mal). Check
// - Usa Producto sin importar el paquete. Check
// - Posible división por cero si la lista está vacía. Check



import com.tienda.productos.Producto;
import java.util.List;
import java.util.ArrayList;

public class Factura {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if (p != null) {
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
            if (productos.size() == 0) {
                return 0; // Evita la división por cero
            }
        double total = calcularTotal();
        return (int) (total / productos.size());
    }

    public java.util.List<Producto> getProductos() {
        return productos;
    }
}
