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
public class EstructuraSeleccion {

    public static void main(String[] args) {

        //si el peso es menos que 18,5 muestra "peso inferior al normal"
        //Dentro del if hay que poner una condicion (expresión lógica)
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un peso: ");
        double imc = teclado.nextDouble();

        if (imc < 18.5) {
            System.out.println("El peso es inferior a 18.5 ");
        } else {
            System.out.println("El peso es superior a 18.5 ");
        }

        if (imc >= 18.5 && imc < 25) {
            System.out.println("El peso es normal ");
        }
    }
}
