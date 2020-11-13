package com.utspbo;

import java.util.*;

class BilBul{
    int jmlbil;
    int[] bil = new int[30];
    int jml;
    int ii=0;
}

public class nomor3 {
    public static void main(String[] args) {
        BilBul akses = new BilBul();
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan jumlah bilangan yang akan diinput :");
        akses.jmlbil = inputUser.nextInt();
        for (int i = 1; i <= akses.jmlbil; i++) {
            System.out.print("Masukan bilangan ke-"+i+" : ");
            akses.bil[i] = inputUser.nextInt();
            akses.ii++;
            akses.jml = akses.jml+akses.bil[akses.ii];
                }

        System.out.println("Jumlah dari bilangan yang diinput : "+akses.jml);
    }
}
