/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Selasa 14/03/2023
   Waktu	    : 00.30 WITA */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        /* Kamus */
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Program */

        System.out.print ("\nBaca string dan Integer: \n");

        System.out.print ("masukkan sebuah string: ");

        str= datAIn.readLine();

        System.out.print ("String yang dibaca : "+ str);
    
    }
}