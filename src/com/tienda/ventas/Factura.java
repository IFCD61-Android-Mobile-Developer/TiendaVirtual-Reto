package com.tienda.ventas;

// BUGS:
// - Falta importar List y ArrayList (compila mal).
// - Usa Producto sin importar el paquete.
// - Posible división por cero si la lista está vacía.
import java.util.List;
import java.util.ArrayList;
import com.tienda.productos.Producto;


public class Factura {
    private java.util.List<Producto> productos = new java.util.ArrayList<>();

    public void agregarProducto(Producto p) {
        // BUG: no validar nulos (causa NullPointer más tarde)
        if(p == null){
            throw new IllegalArgumentException("No se pueden agregar productos nulos");
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
        // BUG: división por cero si no hay productos
        if(productos.isEmpty()){
            throw new IllegalStateException("No hay productos para calcular promedios");
        }

        return (int) (calcularTotal() / productos.size());
    }

    public java.util.List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }
}
