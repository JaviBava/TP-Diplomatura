/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.trabajopractico.trabajopractico;

import java.util.Scanner;

/**
 *
 * @author Javie
 */
public class Trabajopractico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese números enteros (0 para terminar):");
        System.out.print("Número: ");
        numero = scanner.nextInt();

        while (numero != 0) {
            int suma = 0;
            int n = Math.abs(numero); // Asegura que funcione con negativos

            while (n > 0) {
                int digito = n % 10;
                if (digito % 2 == 0) {
                    suma += digito;
                }
                n /= 10;
            }

            System.out.println("Suma de dígitos pares: " + suma);

            System.out.print("Número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Fin del programa.");
        scanner.close();
    }
}
