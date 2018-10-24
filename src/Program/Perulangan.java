/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Program;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int pil;
        Scanner s = new Scanner (System.in);
        do{
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar");
            System.out.println("Pilih : ");
            pil=s.nextInt();
        }
        while(pil!=3);
        
    }    
}
