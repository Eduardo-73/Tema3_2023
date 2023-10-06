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
public class Ej06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                System.out.print("Introduce la base: ");
                int baseCuadrado = teclado.nextInt();
                System.out.print("Introduce la altura: ");
                int alturaCuadrado = teclado.nextInt();
                int resultadoCuadra = baseCuadrado * alturaCuadrado;
                System.out.println("El área del cuadrado es: " + resultadoCuadra);
                break;
            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.print("Introduce la base: ");
                int baseTriangulo = teclado.nextInt();
                System.out.print("Introduce la altura: ");
                int alturaTriangulo = teclado.nextInt();
                int resultadoTri = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("El área del triángulo es: " + resultadoTri);
                break;
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                System.out.print("Introduce la radio: ");
                int radioCirculo = teclado.nextInt();
                int resultadoCir = (int) (Math.pow(radioCirculo, 2) * Math.PI);
                System.out.println("El área del circulo es: " + resultadoCir);
                break;
            default:
                System.out.println("Ha seleccionado terminar");
        }
    }
}
