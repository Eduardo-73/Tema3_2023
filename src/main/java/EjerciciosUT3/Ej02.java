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
public class Ej02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //A)
        System.out.println("Introduce un número: ");
        int numeroX = teclado.nextInt();
        
        String resultado = (numeroX > 135) ? "mayor" : "menor";
        
        System.out.println(resultado);
        
        //B)
        String MayorMenor0 = (numeroX <= 0) ? "Mayor que 0" : 
                "Menor que cero";
        System.out.println(MayorMenor0);
        
        //C)
        final int VALOR_ABSOLUTO = 30;
    }
}
