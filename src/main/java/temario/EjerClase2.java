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
public class EjerClase2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String menu = "";
        do {
            int horas, min, seg;

            do {
                System.out.println("Introduce la hora correcta (entre 0 a 23)");
                horas = teclado.nextInt();
            } while (horas < 0 || horas > 23);

            do {
                System.out.println("Introduce los min correctos (entre 0 a 59)");
                min = teclado.nextInt();
            } while (min < 0 || min > 59);

            do {
                System.out.println("Introduce los seg correctos (entre 0 a 59)");
                seg = teclado.nextInt();
            } while (seg < 0 || seg > 59);

            System.out.println(horas + " : " + min + " : " + seg);
            teclado.nextLine();
            System.out.println("\nDesea seguir ejecutando el programa");
            menu = teclado.nextLine();
        } while (menu.equalsIgnoreCase("Si"));

    }

}
