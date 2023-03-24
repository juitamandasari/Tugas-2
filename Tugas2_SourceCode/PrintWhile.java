/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Selasa 15/03/2023
   Waktu	    : 23.48 WITA */

import java.util.Scanner;

/* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile{

    /**
     * @param args
     */
    public static void main(String[] args){
        //TODO Auto-generated method stub
        /* Kamus */
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Nilai N > 0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; /* First Elmt */

        System.out.println("Print i dengan WHILE : ");
        while (i <=N) /* kondisi perulangan */
        {System.out.println(i); /* Proses */
            i++; /* Next Elmt */
        }; /* Next Elmt */
    }
}
