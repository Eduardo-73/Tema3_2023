/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT04;

/**
 *
 * @author edu
 */
public class Ej13 {

    public static void main(String[] args) {
        char abc = 'A';
        int valorNumerico = (int) abc;
        do {
            System.out.print(abc + " --> " + valorNumerico + " ");
            abc++;
        } while (abc <= 'Z');
    }
}
