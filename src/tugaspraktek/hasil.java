/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktek;

import java.util.Scanner;

/**
 *
 * @author radya
 */
public class hasil {
    public static void main(String[] args) {
        PTMT luring=new PTMT();
        Scanner scan=new Scanner(System.in);
        luring.absen();
        System.out.print("bulan: ");
        String bulan=scan.nextLine();
        
        System.out.println("===============");
        System.out.print("absen: ");
        String absen=scan.nextLine();
        luring.pembelajaran();
        System.out.print("Pada jam: ");
        String waktu=scan.nextLine();
        System.out.println("===============");
        
      luring.jam();
       
    }
}
