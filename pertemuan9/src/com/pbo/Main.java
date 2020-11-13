package com.pbo;

abstract class Hewan{
    public abstract void suaraHewan();

    public void tidur(){
        System.out.println("Zzzz...");
    }
}

class Ayam extends Hewan{

    public void suaraHewan(){
        System.out.println("Kukuruyuk...");
    }
}

class Kucing extends Hewan{

    public void suaraHewan(){
        System.out.println("Meow... Meow...");
    }
}


public class Main {

    public static void main(String[] args) {

        Ayam ayamku = new Ayam();
        ayamku.suaraHewan();
        ayamku.tidur();

        Kucing kucingku = new Kucing();
        kucingku.suaraHewan();
        kucingku.tidur();

    }
}