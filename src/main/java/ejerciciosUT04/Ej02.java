/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT04;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
        // El usuario ingresa un valor y si es menor o igual ha x lo repite hasta llegar a su valor
        
        /*
        Ingrese el valor final:10
        1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 
        */
    }
}
