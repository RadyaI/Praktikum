/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktek;

/**
 *
 * @author radya
 */
public class PTMT extends SistemPembelajaran {
    public String absen,bulan,hari,waktu,sesi_2;
    public int tanggal;
    
    
    @Override
    public void absen (){
        System.out.println("SMK Telkom Malang");
        System.out.println("tahun "+super.tahun);
     
           }
    @Override
    public void pembelajaran(){
        System.out.println("Mengikuti luring");
    }
    
    public String jam(String waktu){
    this.waktu=waktu;
    return waktu;
    }
    
    public String jam(){
    String sesi_2="09.30-12.30";
        System.out.println("absen: 21-40  ");
        System.out.println("Mengikuti luring");
        System.out.println("pada jam: "+sesi_2);
    return sesi_2;
    }
}
