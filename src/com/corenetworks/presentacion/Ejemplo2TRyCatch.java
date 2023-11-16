package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;
import com.corenetworks.modelo.Tipoproducto;

public class Ejemplo2TRyCatch {
    public static void main(String[] args) {

        try {
            Tipoproducto leche=Tipoproducto.valueOf("PRODUCTO_PRIMERA_NECESIDAD");
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally {
            System.out.println("Entro el finally");
        }




    }


}
