/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_minutos;
        double consumo_minutos;
        double total;
        System.out.println("Ingrese el costo por minutos de la operadora");
        costo_minutos = entrada.nextDouble();
         System.out.println("Ingrese el consumo mensual");
        consumo_minutos = entrada.nextDouble();
        total = costo_minutos * consumo_minutos;
        System.out.printf("El total a pagar es de: %.2f", total);
    }

}
