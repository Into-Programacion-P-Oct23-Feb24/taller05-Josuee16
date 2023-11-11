/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double gastos_hijo1;
        double gastos_hijo2;
        double gastos_hijo3;
        double gastototal;
        System.out.println("Ingrese los gastos del Hijo 1");
        gastos_hijo1 = entrada.nextDouble();
         System.out.println("Ingrese los gastos del Hijo 2");
        gastos_hijo2 = entrada.nextDouble();
         System.out.println("Ingrese los gastos del Hijo 3");
        gastos_hijo3 = entrada.nextDouble();
        gastototal = gastos_hijo1 + gastos_hijo2 + gastos_hijo3;
        System.out.printf("El gasto mensual es de: %.2f", gastototal);
    }

}
