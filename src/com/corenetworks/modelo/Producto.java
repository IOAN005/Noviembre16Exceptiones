package com.corenetworks.modelo;

public class Producto {
            private int id;
    public void comprobarId() throws Exception {
        if ( id >= 0){


            throw new Exception("Elije un numero que esta en el rango");
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                '}';
    }

    public Producto() {
    }

    public Producto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
