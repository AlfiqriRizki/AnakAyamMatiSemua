/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anakayamalfiqri;

import java.util.Scanner;

/**
 *
 * @author LABKOM01-RPL04
 */
public class AnakAyamAlfiqri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int AlfiqriA,AlfiqriB;
        
        Scanner sc = new Scanner(System.in);

     
        System.out.println(" Masukan Anak Ayam : ");
        AlfiqriA = sc.nextInt();
    
    for(AlfiqriB = 1 ; AlfiqriB<AlfiqriA ;){ 
        System.out.println(" Anak Ayam Turun " + AlfiqriA);
        AlfiqriA=AlfiqriA-AlfiqriB;
        System.out.println(" Mati " + AlfiqriB + " Tinggal  "+ AlfiqriA + "\n");
        
       //System.out.println(" Tinggal  "+ AlfiqriB);
    }
        System.out.println(" Anak Ayam Turun " +AlfiqriA);
        System.out.println(" Mati " + AlfiqriB + " Tinggal Induknya ");
    }
    
}
