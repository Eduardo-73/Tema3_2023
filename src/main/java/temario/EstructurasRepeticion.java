/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class EstructurasRepeticion {

    public static void main(String[] args) {

        /*
        Todos los bucles tienen tres partes
        1.- Inicialización de la variable de control
        2.- Condición (usando la variable de control)
        3.- Actualización de la variable de control 
         */
        // En java hay 3 bucles, que sirven para repetir una serie de instrucciones 
        // mientras la condición es verdadera
        // Bucle while, se ejecuta entre 0 y n veces 
        int edad = 45;// Inicialización de la varieble de control
        while (edad <= 50) {// Condición del bucle. Si es trie se ejecuta otra vez
            System.out.println("Tu edad es: " + edad);
            edad++;// Actualización de la variable de control
        }

        System.out.println("Fuera del bucle while ");

        // Bucle que no se ejecuta nunca
        while (edad > 100 && edad < 0) {
            System.out.println("Hola ");
        }

        // Bucle infinito
        //while (edad < 100) {
        //System.out.println("Holaaaa...");
        //}
        // Bucle do-while, se ejecuta entre 1 y n veces
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog("Escribe el nombre: ");
            System.out.println("Nombre " + nombre);
        } while (nombre.equalsIgnoreCase("Julia"));

        // Bucle for, se usa cuando se sabe el numero de interacciones a realizar
        int numero = 0;

        while (numero >= 100) {
            System.out.println("Numero " + numero);
            numero++;
        }
        // Cuenta de 0 a 100
        for (int numero2 = 0; numero2 < 100; numero2++) {
            System.out.println("Numero2 " + numero2);
        }

        //Cuenta de 100 a 0 
        for (int numero3 = 100; numero3 >= 0; numero3--) {
            System.out.print(numero3 + " - ");
        }
    }
}
