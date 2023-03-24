/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Rabu 16/03/2023
   Waktu	    : 00.33 WITA */

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXWhile {

    /**
     * @param args
     */
    public static void main(String[] args){
        //TODO Auto-generated method stub
        /* Kamus */
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        Sum = 0; /* Inisialisasi */

        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        while (x != 999) /* Kondisi berhenti */ {
            Sum = Sum + x; /* Proses */
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt(); /* First Elmt */
        }
        System.out.println("\nHasil Penjumlahan = "+ Sum); /* Terminasi */        
    }
}
