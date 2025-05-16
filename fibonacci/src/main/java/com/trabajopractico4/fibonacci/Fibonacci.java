/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.trabajopractico4.fibonacci;

/**
 *
 * @author Javier
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int cantidad = 20;

        System.out.println("Sucesion de Fibonacci (los primeros " + cantidad + " numeros):");

        for (int i = 0; i < cantidad; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
