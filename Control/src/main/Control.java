/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author RGdevop
 */
public class Control {
    static int total=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*for(int i=0;i<5;i++){
            pedirCantidades();
        }*/
        
        while(total<1000){
            pedirCantidades();
        }
        
        float totalConDescuento=(float) ((float)total-(total*.20));
        
        
        System.out.println("El total sin descuento es: "+total);
        System.out.println("El total con descuento es: "+totalConDescuento);
        
    }
    
    private static void pedirCantidades(){
        int cantidad=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa una cantidad:");
        cantidad=sc.nextInt();
        total=total+cantidad;
    }
    
    
}
