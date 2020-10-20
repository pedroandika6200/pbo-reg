package com.pbo;

public class Main {

    public static void main(String[] args) {
        /*Classku objku = new Classku();
        System.out.println(objku.x);
        System.out.println(objku.y);
        System.out.println(objku.tampilkanZ());*/

        Bilangan tampilan = new Bilangan();
        System.out.println("Nilai E = "+tampilan.tampilkanE());
        System.out.println("Nilai F = "+tampilan.tampilkanF());
        System.out.println("Nilai G = "+tampilan.tampilkanG());

        //nilai diintput
        tampilan.inputE(100);
        System.out.println("Nilai E setelah diinput = "+tampilan.tampilkanE());
        tampilan.inputF(200);
        System.out.println("Nilai F setelah diinput = "+tampilan.tampilkanF());
        tampilan.inputG(300);
        System.out.println("Nilai G setelah diinput = "+tampilan.tampilkanG());

        //panggil method tambah(), kurang(), kali(), bagi()
        System.out.println("Hasil pertambahan E, F dan G = "+tampilan.tambah());
        System.out.println("Hasil pengurangan G dikurang E = "+tampilan.kurang());
        System.out.println("Hasil perkalian E, F dan G = "+tampilan.perkalian());
        System.out.println("Hasil pembagian G dibagi E = "+tampilan.pembagian());
    }
}
