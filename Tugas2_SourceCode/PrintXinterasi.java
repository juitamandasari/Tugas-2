/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Rabu 16/03/2023
   Waktu	    : 00.01 WITA */

import java.util.Scanner;

/* contoh baca nili x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXinterasi {

    /**
     * @param args
     */
    public static void main(String[] args){
        //TODO Auto-generated method stub
        /* Kamus */
        int Sum=0;
        int x;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Masukan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999){
            System.out.println("Kasus kosong ");
        }else{ /* Minimal ada satu data yang dijumlahkan */
            Sum = x; /* Inisialisasi; ivariant !! */
            for(;;){
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if(x == 999)
                    break;
                else{
                    Sum = Sum + x; /* Proses */
                }
            }
        }
        System.out.println("\nHasil penjumlahan = "+ Sum); /* Terminasi */
    }
}
