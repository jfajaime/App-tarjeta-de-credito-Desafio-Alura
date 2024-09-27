package com.desafiotarjeta.calculos;

public class Compra implements Comparable<Compra>{
    private final String nombre;
    private final double precio;


    public double getPrecio() {
        return precio;
    }

    public Compra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.compare(this.precio, otraCompra.precio);
    }
    @Override
    public String toString() {
        return "Articulo: " + nombre + " >$" + getPrecio();
    }
}
