/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUT3;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Ej01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);

        //Resultados del ejercicio
        /*
         Introduce tu edad:15
         No es mayor de edad
         mostrar la edad: 15
         */
        /*
        Introduce tu edad:18
        Es mayor de edad
        mostrar la edad: 18
         */
        /*
        Introduce tu edad:60
        Es mayor de edad
        mostrar la edad: 60
        */
    }
}
