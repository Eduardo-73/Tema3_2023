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
public class EjercicioClase1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String textoMenu = """
                           ---------------------
                           1. Par o Impar
                           2. Mes válido
                           3. HORAS MIN SEG
                           4. Terminar programa
                           ---------------------
                           """;

        System.out.println(textoMenu);
        System.out.print("Introduce una de las anteriores opciones: ");
        int menu = teclado.nextInt();

        switch (menu) {
            case 1:

                System.out.print("Introduce un número: ");
                int numero = teclado.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("El número es par ");
                } else {
                    System.out.println("El número es impar ");
                }

                break;
            case 2:

                System.out.print("Introduce un número del mes: ");
                int numMes = teclado.nextInt();

                switch (numMes) {
                    case 1 ->
                        System.out.println("Enero");
                    case 2 ->
                        System.out.println("Febrero");
                    case 3 ->
                        System.out.println("Marzo");
                    case 4 ->
                        System.out.println("Abril");
                    case 5 ->
                        System.out.println("Mayo");
                    case 6 ->
                        System.out.println("Junio");
                    case 7 ->
                        System.out.println("Julio");
                    case 8 ->
                        System.out.println("Agosto");
                    case 9 ->
                        System.out.println("Septiembre");
                    case 10 ->
                        System.out.println("Octubre");
                    case 11 ->
                        System.out.println("Noviembre");
                    case 12 ->
                        System.out.println("Diciembre");
                    default ->
                        System.out.println("Mes no válido");
                }

                break;
            case 3:

                System.out.print("Introduce 3 números ");
                String numeros = teclado.nextLine();
                int horas = numeros.charAt(1);
                break;
            default:
                System.out.println("Has elegido terminado el programa");
        }
    }

}
