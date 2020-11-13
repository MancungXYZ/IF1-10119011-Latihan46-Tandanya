/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan46.tandanya;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan46Tandanya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Age usia = new Age(2020);
        System.out.print("Masukan Tahun Lahir Anda :");
        usia.setYearBirth(sc.nextInt());
        
        System.out.println();
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun anda lahir : " + usia.getYearBirth());
        System.out.println("Hari ini Tahun : " + usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah :" + usia.hitungUmur()+ "Tahun");
        System.out.println("Tandanya kamu " .concat(usia.tandanyaKamu(usia.hitungUmur())));
        
        
    }
}
