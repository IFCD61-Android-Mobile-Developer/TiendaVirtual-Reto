package com.tienda.productos;


import com.tienda.excepciones.PrecioInvalidoException;
import java.util.Objects;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) throws PrecioInvalidoException {
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }

        this.nombre = nombre;
    }


    public void setPrecio(double precio) throws PrecioInvalidoException {
        if (precio < 0) {
            throw new PrecioInvalidoException("Precio no puede ser negativo: " + precio);
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + precio + "€)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto p = (Producto) o;
        return Double.compare(p.precio, precio) == 0 && nombre.equals(p.nombre);
    }

    @Override
    public int hashCode() { return Objects.hash(nombre, precio); }
}
