/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double costo_total;
        System.out.println("Ingrese el precio del cpu");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el precio del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el precio de la pantalla");
        pantalla = entrada.nextDouble();
        System.out.println("Ingrese el precio del raton");
        raton = entrada.nextDouble();
        costo_total = cpu + teclado + pantalla + raton;
        System.out.printf("El valor del CPU es: %.2f\n"
                + "El valor del teclado es: %.2f\n"
                + "El valor de la pantalla es: %.2f\n"
                + "El valor del raton es: %.2f\n"
                + "Su total a pagar es: %.2f",cpu,teclado,pantalla,
                raton,costo_total);
    }

}
