/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class EjerClase3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros, suma = 0;
        do {
            System.out.println("Introduce un número: ");
            numeros = teclado.nextInt();
            suma += numeros;
        } while (numeros != 0);
        System.out.println("Suma de los números introducidos: " + suma);
    }
}
