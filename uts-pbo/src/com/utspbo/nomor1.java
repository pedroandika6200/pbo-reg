package com.utspbo;

import java.text.DecimalFormat;
import java.util.*;

public class nomor1 {
    public static void main(String[] args) {
        double rp;
        double usd;
        DecimalFormat decim = new DecimalFormat("#.###");
        Scanner inputUser = new Scanner(System.in);

        System.out.println("===Konversi Mata Uang Rupiah ke US Dollar===");
        System.out.print("Masukan Jumlah Rupiah : Rp.");
        rp = inputUser.nextDouble();

        usd = rp/14591;
        System.out.println("============================================");
        System.out.println("Jumlah US Dollar : $"+decim.format(usd));
        System.out.println("============================================");
    }
}
