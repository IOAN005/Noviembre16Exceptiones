package com.corenetworks.presentacion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        int []enteros=new int[5];
        try {
            enteros[5]=6;
        }catch(ArrayIndexOutOfBoundsException e1 ) {
            System.out.println("entra el catch del array");

        }catch (Exception e1){
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            System.out.println(e1.getCause());

        }finally {
            System.out.println("entro al finally ");
        }


        //for (int i=0;i< enteros.length;i++){
          //  enteros[i]=i*5;
        System.out.println("despues de estructura try");

    }
}