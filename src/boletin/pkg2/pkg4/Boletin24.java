/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg4;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billetes100, billetes20, billetes5, monedas, cantidad;
        Scanner sc;
        sc = new Scanner (System.in);
        System.out.println("introduzca cantidad");
        cantidad = sc.nextInt();
        billetes100 = cantidad/100;
        cantidad = cantidad%100;
        billetes20 = cantidad/20;
        cantidad = cantidad%20;
        billetes5 = cantidad/5;
        cantidad = cantidad%5;
        monedas = cantidad;
        System.out.println("importe = " +billetes100+" " +billetes20+" " +billetes5+" " +monedas);
        
    }
    
}
