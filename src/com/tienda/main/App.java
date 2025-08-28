package com.tienda.main;

// BUGS posibles:
// - Import innecesario (warning).
// - Acceso a args[0] sin validar (ArrayIndexOutOfBounds).
// - No capturar excepciones específicas.
// - Generar intencionalmente precios negativos.

import java.util.Scanner; // no se usa
import com.tienda.productos.Producto;
import com.tienda.ventas.Factura;
import com.tienda.util.Calculadora;
import com.tienda.excepciones.PrecioInvalidoException;

public class App {
    public static void main(String[] args) throws Exception {
        Factura factura = new Factura();
        Calculadora calc = new Calculadora();

        // BUG runtime: posible excepción por args vacío
        System.out.println("Primer argumento: " + args[0]);

        try {
            // BUG: división por cero
            System.out.println("5 / 0 = " + calc.dividir(5, 0));
        } catch (Exception e) {
            System.out.println("Ocurrió un error en división: " + e.getMessage());
        }

        try {
            // BUG: precio negativo dispara excepción personalizada
            Producto p1 = new Producto("Manzana", -1.5);
            factura.agregarProducto(p1);
        } catch (PrecioInvalidoException e) {
            System.out.println("Precio inválido: " + e.getMessage());
        }

        // BUG: agregar nulo
        factura.agregarProducto(null);

        System.out.println("Total: " + factura.calcularTotal());
        System.out.println("Promedio entero: " + factura.calcularPromedioEntero());

        // BUG: posible excepción (según cómo definan RaizNegativaException)
        System.out.println("√(-9) = " + calc.raizCuadrada(-9));
    }
}

