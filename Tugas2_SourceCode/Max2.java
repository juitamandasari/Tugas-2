/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Selasa 15/03/2023
   Waktu	    : 00.54 WITA */

import java.util.Scanner;
public class Max2 {

    /**
     * @param args
     */
    public static void main(String[] args){
        //TODO Auto-generated method stub
        /* Kamus */
        int a, b;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Maksimum dua bilangan : \n");
        System.out.print("Ketikkan dua bilangan, pisahlan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println("Ke dua bilangan : a = "+ a +" b = "+ b);
        if (a >= b){
            System.out.println("Nilai a yang maksimum : "+ a);
        }else /* a < b */{
            System.out.println("Nilai b yang maksimum : "+ b);
        }
    }
}
