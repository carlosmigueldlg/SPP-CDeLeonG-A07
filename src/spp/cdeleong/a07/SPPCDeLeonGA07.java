/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.a07;
import java.util.Scanner;
/**
 *
 * @author CarlosMiguel De Leon Garcia A01410399 IMA
 */
public class SPPCDeLeonGA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          int num;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println("Introduce el numero telefonico a 10 digitos " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("Introduzca el numero ");
        num= kb.nextInt();
        if (num < telefono.length){
        System.out.println("El numero es " + telefono[num]);
        } else System.out.println("FUERA DE RANGO.");    
    }
    
             public static void arrelgo(){

    }
    
}
