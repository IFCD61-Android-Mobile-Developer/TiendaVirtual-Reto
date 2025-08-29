package com.tienda.main;

import com.tienda.productos.Producto;
import com.tienda.ventas.Factura;
import com.tienda.util.Calculadora;
import com.tienda.excepciones.PrecioInvalidoException;

public class App {
    public static void main(String[] args) throws Exception {
        Factura factura = new Factura();
        Calculadora calc = new Calculadora();

        if (args.length > 0){
            System.out.println("Primer argumento: " + args[0]);
        } else {
            System.out.println("Error: No se proporcionaron argumentos.");
        }


        try {

            System.out.println("5 / 0 = " + calc.dividir(5, 0));
        } catch (Exception e) {
            System.out.println("Ocurrió un error en división: " + e.getMessage());
        }

        try {

            Producto p1 = new Producto("Manzana", -1.5);
            factura.agregarProducto(p1);
        } catch (PrecioInvalidoException e) {
            System.out.println("Precio inválido: " + e.getMessage());
        }


        factura.agregarProducto(null);

        System.out.println("Total: " + factura.calcularTotal());
        System.out.println("Promedio entero: " + factura.calcularPromedioEntero());


        try {
            System.out.println("√(-9) = " + calc.raizCuadrada(-9));
        } catch (RaizNegativaException e) {
            System.out.println("Error al calcular la raíz cuadrada: " + e.getMessage());
        }
    }
}

