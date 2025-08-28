package com.tienda.ventas;
// BUGS:
// - Falta importar List y ArrayList (compila mal).
// - Usa Producto sin importar el paquete.
// - Posible división por cero si la lista está vacía.
import java.util.*

public class Factura {

//    private java.util.List<Producto> productos = new java.util.ArrayList<>(); // parche temporal
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {

        // BUG: no validar nulos (causa NullPointer más tarde)
        if (p != null) {
            productos.add(p);
        } else {
            System.out.println("Error, no hay producto que agregar");
        }

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

        // BUG: división por cero si no hay productos
        if (productos !=0) {
            return (int) (total / productos.size());
        } else {
            return 0;
        }
    }

    //public java.util.List<Producto> getProductos() {
        return productos;
    }
    public List<Producto> getProductos() {
        return productos;
    }
}
