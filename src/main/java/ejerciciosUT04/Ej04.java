/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT04;

/**
 *
 * @author edu
 */
public class Ej04 {

    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        // Hace una cuenta del 1 al 10 
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);
        // Hace una cuenta atras del 10 al 1
        
        /*
        Número: 1
        Número: 2
        Número: 3
        Número: 4
        Número: 5
        Número: 6
        Número: 7
        Número: 8
        Número: 9
        Número: 10
        ----------
        Número: 10
        Número: 9
        Número: 8
        Número: 7
        Número: 6
        Número: 5
        Número: 4
        Número: 3
        Número: 2
        Número: 1
        */
    }
}


