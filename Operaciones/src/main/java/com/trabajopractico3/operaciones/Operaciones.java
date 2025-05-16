/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.trabajopractico3.operaciones;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        float num1 = scanner.nextFloat();

        System.out.print("Ingrese otro numero: ");
        float num2 = scanner.nextFloat();

        System.out.print("Ingrese una operacion matematica (+, -, *, /): ");
        String operacion = scanner.next();

        switch (operacion) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No es posible dividir por cero.");
                }
                break;
            default:
                System.out.println("Operacion invalida.");
        }

    }
}