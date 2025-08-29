package com.tienda.ventas;

import com.tienda.productos.Producto;
import java.util.List;
import java.util.ArrayList;

public class Factura {
    private java.util.List<Producto> productos = new java.util.ArrayList<>(); // parche temporal

    public void agregarProducto(Producto p) {
        if(p != null){
            productos.add(p);
        } else {
            System.out.println("El producto no puede ser null");
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
        if(productos.isEmpty()){
            return 0;
        }
        double total = calcularTotal();
        return (int) (total / productos.size());
    }

    public java.util.List<Producto> getProductos() {
        return productos;
    }
}
