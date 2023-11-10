/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_kv;
        double consumo_kv;
        int edad;
        double costo_planilla;
        double descuento;
        System.out.println("Ingrese el costo de Kilovatios");
        costo_kv = entrada.nextDouble();
        System.out.println("Ingrese el consumo mensual de Kilovatios");
        consumo_kv = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        costo_planilla = costo_kv * consumo_kv;
        if (edad > 65) {
            descuento = (costo_planilla * 10) / 100;
            costo_planilla = (costo_planilla - descuento);
            System.out.printf("El total a pagar es: %.2f", costo_planilla);
        } else {
            PrintStream printf = System.out.printf("El total a pagar es: %.2f", costo_planilla);

        }
    }
}