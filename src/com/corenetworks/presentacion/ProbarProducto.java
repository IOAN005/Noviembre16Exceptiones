package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p1=new Producto();
        p1.setId(0);
        try {
            p1.comprobarId();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
