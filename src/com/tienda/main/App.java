package com.tienda.main;


import com.tienda.excepciones.RaizNegativaException;
import com.tienda.productos.Producto;
import com.tienda.ventas.Factura;
import com.tienda.util.Calculadora;
import com.tienda.excepciones.PrecioInvalidoException;

public class App {
    public static void main(String[] args) {
        Factura factura = new Factura();
        Calculadora calc = new Calculadora();

        if(args.length > 0){
            System.out.println("Primer argumento: " + args[0]);
        } else {
            System.out.println("Sin argumentos: ejecuta con algún valor para probar");
        }


        try {

            System.out.println("5 / 1 = " + calc.dividir(5, 1));
        } catch (ArithmeticException ex) {
            System.out.println("Ocurrió un error en división: " + ex.getMessage());
        }

        try {
            Producto p1 = new Producto("Manzana", 1.5);
            Producto p2 = new Producto("Pera", 2.0);
            factura.agregarProducto(p1);
            factura.agregarProducto(p1);
        } catch (PrecioInvalidoException e) {
            System.out.println("Precio inválido: " + e.getMessage());
        }

        System.out.println("Total: " + factura.calcularTotal());
        try {
            System.out.println("Promedio entero: " + factura.calcularPromedioEntero());
        } catch (IllegalStateException e) {
            System.out.println("No hay productos para promedio: " + e.getMessage());
        }


        try {
            System.out.println("√(-9) = " + calc.raizCuadrada(9));
        } catch (RaizNegativaException e){
            System.out.println("Error con raíz: " + e.getMessage());
        }

    }
}

