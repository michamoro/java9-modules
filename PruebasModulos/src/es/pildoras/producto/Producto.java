package es.pildoras.producto;

import es.pildoras.descuento.Descuento;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return Descuento.calcDescuento(this.precio);
    }

}
