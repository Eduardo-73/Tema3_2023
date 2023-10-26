/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
/*
Una cadena de tiendas de autoservicio cuenta con sucursales en C ciudades del país,
en cada ciudad cuenta con T tiendas y cada tienda tiene E empleados.

Cada día una tienda pregunta lo que vende cada empleado de manera individual,
para saber cuánto vendió la tienda en total, cuánto se vendió en la ciudad y el total
recaudado por la cadena de tiendas en el país.

Realiza el programa para introducir en un día lo que vendió cada empleado de cada
tienda de cada ciudad y saber las ventas de cada tienda, de cada ciudad y del total en el país
 */
public class EjClase4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numCiudades, numTiendas, numEmpleados;
        double ventaEmpleado, sumaVenta = 0, sumaVentaTotal = 0;

        System.out.println("¿Cuántas sucursales hay en esta ciudad del país: ?");
        numCiudades = teclado.nextInt();
        for (int i = 0; i < numCiudades; i++) {
            System.out.println("Sucursal nº" + (i + 1));
            System.out.println("¿Cuántas tiendas hay: ?");
            numTiendas = teclado.nextInt();
            for (int j = 0; j < numTiendas; j++) {
                System.out.println("Tienda nº" + (j + 1));
                System.out.println("¿Cuántos empleados tiene esta tienda: ?");
                numEmpleados = teclado.nextInt();
                for (int k = 0; k < numEmpleados; k++) {
                    System.out.println("¿Cuánto ha vendido el empleado nº" + (k + 1) + "?");
                    ventaEmpleado = teclado.nextDouble();
                    sumaVenta += ventaEmpleado;
                }
                System.out.println("Suma del total de la tienda nº" + (j + 1)
                        + ": " + sumaVenta + "€");
                sumaVentaTotal += sumaVenta;
                sumaVenta = 0;
            }
        }
        System.out.println("La suma total de las tiendas del país es de: "
                + sumaVentaTotal + "€");
    }
}
