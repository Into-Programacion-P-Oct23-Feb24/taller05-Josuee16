/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int dias;
        double precio;
        double descuento;
        double subtotal;
        double total;
        System.out.println("Ingrese la cantidad de dias");
        dias = entrada.nextInt();
        System.out.println("Ingrese rel precio de la habitacion");
        precio = entrada.nextDouble();
        subtotal = precio * dias;
        if ((dias > 5) && (dias >= 10)) {
            descuento = (subtotal*10)/100;
            total = subtotal - descuento;
        } else {
           if ((dias > 10) && (dias >= 15)) {
            descuento = (subtotal*15)/100;
            total = subtotal - descuento;
        } else {
                if (dias >15 ) {
            descuento = (subtotal*20)/100;
            total = subtotal - descuento;
             } else {
                    descuento = 0;
                    total = subtotal;
           }
        }

    } System.out.printf("""
                        Su subtotal a pagar es: %.2f
                        Su descuento es: %.2f
                        Su total es: %.2f""",subtotal,descuento,total);

}
    
}
