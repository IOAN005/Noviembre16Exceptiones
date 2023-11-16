package com.corenetworks.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //Declaracion de variable
        int dato;
        Scanner teclado = new Scanner(System.in);
        //Recibir un dato
        System.out.println("escriba un dato numerico");
        try {
            dato = teclado.nextInt();
        }catch (InputMismatchException i1){
            System.out.println("el dato que se pidio fue numerico");
    }finally {
            System.out.println("entro el finally");
        }
}
}