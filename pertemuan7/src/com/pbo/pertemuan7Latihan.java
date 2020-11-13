package com.pbo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class pertemuan7Latihan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        String nama;
        int golongan, jamkerja, jamlembur, gajipokok, gajilembur, tunjanganpengabdian;
        double pajakgajipokok, pajaklembur, totpajak,gajibersih;

        System.out.println("--------PROGRAM MENGHITUNG GAJI KARYAWAN---------");
        System.out.println("-------------------------------------------------");

        System.out.print("Masukan Nama : ");
        nama=input.next();
        System.out.print("Masukan Golongan (1/2/3/4) : ");
        golongan=input.nextInt();
        System.out.print("Masukan Jam Kerja : ");
        jamkerja=input.nextInt();

        switch(golongan){
            case 1 :
                gajipokok=1486500;
                tunjanganpengabdian=250000;
                break;
            case 2 :
                gajipokok=1926000;
                tunjanganpengabdian=300000;
                break;
            case 3 :
                gajipokok=2456700;
                tunjanganpengabdian=350000;
                break;
            case 4 :
                gajipokok=2899500;
                tunjanganpengabdian=400000;
                break;
            default :
                gajipokok=0;
                tunjanganpengabdian=0;
        }

        if (jamkerja>173){
            jamlembur=jamkerja-173;
        }else{
            jamlembur=0;
        }

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        gajilembur=jamlembur*20000;
        pajakgajipokok=0.05*gajipokok;
        pajaklembur=0.05*gajilembur;
        totpajak=pajakgajipokok+pajaklembur;
        gajibersih=((gajipokok+tunjanganpengabdian+gajilembur)-totpajak);

        System.out.println("Nama                 : "+nama);
        System.out.println("Gaji Pokok           : "+kursIndonesia.format(gajipokok));
        System.out.println("Gaji Lembur          : "+kursIndonesia.format(gajilembur));
        System.out.println("Pajak Gaji Pokok     : "+kursIndonesia.format(pajakgajipokok));
        System.out.println("Pajak Lembur         : "+kursIndonesia.format(pajaklembur));
        System.out.println("Total Pajak          : "+kursIndonesia.format(totpajak));
        System.out.println("Tunjangan Pengabdian : "+kursIndonesia.format(tunjanganpengabdian));
        System.out.println("Total Gaji Diterima  : "+kursIndonesia.format(gajibersih));
    }
}