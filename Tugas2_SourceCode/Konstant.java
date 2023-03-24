/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Selasa 15/03/2023
   Waktu	    : 00.17 WITA */

import java.util.Scanner;

/* Membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian kostanta */
public class Konstant {
    
    /**
     * @param args
     */
    public static void main(String[] args){
        //TODO Auto-generated method stub
        /* Kamus */
        final float PHI = 3.1415f;
        float r;
        Scanner masukan = new Scanner(System.in);

        /* Program */ /* baca data */
        System.out.print("Jari-jari lingkaran = ");
        r = masukan.nextFloat();

        /* Hitung dan tulis hasil */
        System.out.print("Luas lingkaran = "+ (PHI * r * r)+"\n");
        System.out.print("Akhir program\n");
    }
}
