package com.tienda.productos;

// Falta import de la excepción personalizada (pista)
import com.tienda.excepciones.PrecioInvalidoException;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) throws PrecioInvalidoException {
        this.nombre = nombre;
        setPrecio(precio); // delega validación
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // BUG: no valida nulos o vacíos en nombre (pista de mejora)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // BUG: acepta precios negativos sin lanzar excepción (pista)
    public void setPrecio(double precio) throws PrecioInvalidoException {
        if (precio < 0) {
            // pista: lanzar excepción personalizada
            throw new PrecioInvalidoException("Precio no puede ser negativo: " + precio);
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + precio + "€)";
    }
}
