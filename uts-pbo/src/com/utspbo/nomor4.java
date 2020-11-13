package com.utspbo;

import java.util.Scanner;

class Warnet{
    double internet;
    double pengetikan;
    double gameonline;
    double scan;
    double printwarna;
    double printhp;
    double tehbotol;

    public Warnet(double internet, double pengetikan, double gameonline, double scan, double printwarna, double printhp, double tehbotol) {
        this.internet = internet;
        this.pengetikan = pengetikan;
        this.gameonline = gameonline;
        this.scan = scan;
        this.printwarna = printwarna;
        this.printhp = printhp;
        this.tehbotol = tehbotol;
    }

    public void setInternet(double internet) {
        this.internet = internet;
    }

    public void setPengetikan(double pengetikan) {
        this.pengetikan = pengetikan;
    }

    public void setGameonline(double gameonline) {
        this.gameonline = gameonline;
    }

    public void setScan(double scan) {
        this.scan = scan;
    }

    public void setPrintwarna(double printwarna) {
        this.printwarna = printwarna;
    }

    public void setPrinthp(double printhp) {
        this.printhp = printhp;
    }

    public void setTehbotol(double tehbotol) {
        this.tehbotol = tehbotol;
    }

    void display(){
        System.out.println("Internet : Rp." + this.internet +"/Jam");
        System.out.println("Pengetikan : Rp." + this.pengetikan +"/Jam");
        System.out.println("Game Online : Rp." + this.gameonline +"/Jam");
        System.out.println("Scan : Rp." + this.scan +"/Lembar");
        System.out.println("Prdouble : Rp." + this.printwarna +"/Lembar");
        System.out.println("Prdouble : Rp." + this.printhp +"/Lembar");
        System.out.println("Teh Botol : Rp." + this.tehbotol +"/Botol");
    }
}

public class nomor4 {

    public static void main(String[] args) {
        System.out.println("=========== DAFTAR HARGA ===========");
        Warnet harga = new Warnet(4000.00, 2000.00, 5000.00, 1000.00, 500.00, 300.00, 3000.00);

        harga.display();

        System.out.println("====================================\n");

        Scanner byr = new Scanner(System.in);
        //<---------Rental-------->
        System.out.println("Jenis Rental (internet / pengetikan / game online): ");
        String BiayaRental = byr.nextLine();
        System.out.println("Jumlah waktu : ");
        double waktu = byr.nextDouble();
        double Rental = 0;
        double biayascan = 0;
        double biayaprint = 0;
        double biayatehbtl = 0;
        if(waktu <= 30){
            waktu = 30;
        }
        switch (BiayaRental){
            case "internet":
                Rental = (waktu/60)*4000;
                break;
            case "pengetikan":
                Rental = (waktu/60)*2000;
                break;
            case "game online":
                Rental = (waktu/60)*5000;
                break;
        }

        //<---------Scan-------->
        System.out.println("Jumlah Scan File : ");
        double scan = byr.nextDouble();
        biayascan = scan*1000;

        Scanner prnt = new Scanner(System.in);
        //<---------Print-------->
        System.out.println("Jenis Print (warna / hitam putih / tidak ada): ");
        String print = prnt.nextLine();
        double lembar = 0;

        switch (print){
            case "warna":
                System.out.println("Jumlah lembar yang diprint : ");
                lembar = prnt.nextDouble();
                biayaprint = lembar*500;
                break;
            case "hitam putih":

                System.out.println("Jumlah lembar yang diprint : ");
                lembar = prnt.nextDouble();
                biayaprint = lembar*300;
                break;
            default:
                biayaprint = 0;
                break;
        }

        //<---------Teh Botol-------->
        System.out.println("Jumlah Teh Botol : ");
        double tehbtl = byr.nextDouble();
        biayatehbtl = tehbtl*3000;

        System.out.println("=========== TOTAL HARGA ===========");
        System.out.println("Biaya Rental : Rp."+Rental);
        System.out.println("Biaya Scan : Rp."+biayascan);
        System.out.println("Biaya Print : Rp."+biayaprint);
        System.out.println("Biaya Teh Botol : Rp."+biayatehbtl);

        double total = Rental+biayaprint+biayascan+biayatehbtl;
        System.out.println("\nTotal Biaya : Rp."+total);
    }
}
