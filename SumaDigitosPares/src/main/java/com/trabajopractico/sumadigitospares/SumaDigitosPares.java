/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.trabajopractico.sumadigitospares;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class SumaDigitosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese numeros enteros positivos (0 para finalizar):");
        numero = scanner.nextInt();
        
        while (numero != 0) {
            int suma = 0;
            int numeroOriginal = numero;
            
            while (numero > 0) {
                int digito = numero % 10;
                if (digito % 2 == 0) {
                    suma += digito;
                }
                numero /= 10;
            }
            
            System.out.println("La suma de los digitos pares de " + numeroOriginal + " es: " + suma);
            numero = scanner.nextInt();
        }
      
    }
}
