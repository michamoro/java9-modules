package es.pildoras.uso;

import es.pildoras.producto.Producto;

public class UsoProducto {

    public static void main(String[] args) {

        Producto miProducto = new Producto();
        miProducto.setPrecio(15000);
        System.out.println(miProducto.getDescuento());
    }
}
