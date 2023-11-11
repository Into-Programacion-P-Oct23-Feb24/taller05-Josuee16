/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        int edad;
        double descuento;
        double total;
        System.out.println("Ingrese el costo de Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el costo de YouTube Premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el costo de DropBox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el costo de Spotify");
        spotify = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        total = netflix + youtube + dropbox + spotify;

        if (edad < 30) {
            descuento = (total * 20) / 100;
            total = total - descuento;
            System.out.printf("El total a pagar mensual es: %.2f", total);
        } else {
            System.out.printf("El valor a pagar es de: %.2f", total);

        }

    }}
