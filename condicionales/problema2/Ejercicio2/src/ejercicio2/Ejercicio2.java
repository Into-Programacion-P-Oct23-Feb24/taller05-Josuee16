/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String articulo;
        int cantidad;
        double precio;
        double costo_pedido;
        double descuento;
        System.out.println("Ingrsee el nombre del articulo");
        articulo = entrada.nextLine();
        System.out.println("Ingrese la cantidad de articulos");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el costo del articulo");
        precio = entrada.nextDouble();
        costo_pedido = cantidad * precio;
        
        if (cantidad > 50) {
            descuento = (costo_pedido * 15) /100;
            costo_pedido = costo_pedido - descuento;
            System.out.printf("El costo de su pedido es %.2f",costo_pedido);
        }else{
            System.out.printf("El costo total es: %.2f",costo_pedido);
        }
    }

}
