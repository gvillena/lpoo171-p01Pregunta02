/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.pregunta02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P01Pregunta02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int i = Integer.parseInt(reader.nextLine());
        int j = 0;
        int suma = 0;
        while (j<=i) {
            int resultado = (int) Math.pow(2, j);
            System.out.println("resultado = " + resultado);
            suma += resultado; 
            j++;            
        }
        System.out.println("Resultado: " + suma);                
    }
    
}
