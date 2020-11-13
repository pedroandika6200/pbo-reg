package com.utspbo;

import java.text.DecimalFormat;
import java.util.*;

class BBIdeal{
    double ideal=0;
    double brt;
    double tngg;
    double tngg1;
    double BMI;
    String jenkel;
}

public class nomor2 {
    public static void main(String[] args) {

        BBIdeal akses= new BBIdeal();
        DecimalFormat decim = new DecimalFormat("#.###");
        Scanner inputUser = new Scanner(System.in);

        System.out.println("===Penghitung Berat Badan Ideal===");
        System.out.print("Jenis kelamin (1.laki-laki/2.perempuan) : ");
        akses.jenkel = inputUser.next();
        System.out.print("Masukan berat badan anda : ");
        akses.brt = inputUser.nextDouble();
        System.out.print("Masukan tinggi badan anda : ");
        akses.tngg = inputUser.nextDouble();

        akses.tngg1 = akses.tngg/100;
        akses.BMI = akses.brt/(akses.tngg1*akses.tngg1);

        System.out.println("==================================");
        System.out.print("BMI anda adalah "+decim.format(akses.BMI));

        if((akses.jenkel.equals("laki-laki"))||(akses.jenkel.equals("1"))){
            akses.ideal = (akses.tngg-100)-(0.10*(akses.tngg-100));
        }else if((akses.jenkel.equals("perempuan"))||(akses.jenkel.equals("2"))) {
            akses.ideal = (akses.tngg-100)-(0.15*(akses.tngg-100));
        }else{
            System.out.println("Anda salah input jenis kelamin");
        }

        if(akses.BMI<18.5){
            System.out.println("(Underweight)");
            System.out.println("Berat ideal anda : "+akses.ideal+" kg");
        }else if(akses.BMI<=22.9){
            System.out.println("(Normal)");
            System.out.println("Berat ideal anda : "+akses.ideal+" kg");
        }else{
            System.out.println("(Overweight)");
            System.out.println("Berat ideal anda : "+akses.ideal+" kg");
        }


    }
}
