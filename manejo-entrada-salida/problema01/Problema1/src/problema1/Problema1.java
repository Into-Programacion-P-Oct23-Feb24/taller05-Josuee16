/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lado1;
        double lado2;
        double lado3;
        double area;
        System.out.println("Ingrese el lado 1 del triangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del triangulo");
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese el lado 3 del triangulo");
        lado3 = entrada.nextDouble();
        area = lado1 * lado2 * lado3;
        System.out.printf("El area del triangulo es: %.2fcm",area);

    }

}
