/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUT3;

/**
 *
 * @author edu
 */
public class Ej03 {
    public static void main(String[] args) {
        
        
        boolean unaCondicion = true;
        String resultado = unaCondicion ? "valor1" : "valor2";

        System.out.println(resultado);
        System.out.println("----------------------");
        
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        System.out.println(y);
        System.out.println("----------------------");
        
        int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": 
        (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        System.out.println(status);

        /*
        valor1
        ----------------------
        100
        ----------------------
        Esta todo vendido
        */
    }
}
