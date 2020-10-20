package com.pbo;

public class Bilangan {
    private int e = 10;
    private int f = 20;
    private int g = 30;

    public int tampilkanE(){
        return this.e;
    }
    public int tampilkanF() {
        return this.f;
    }
    public int tampilkanG() {
        return this.g;
    }
    public void inputE(int nilai){
        this.e = nilai;
    }
    public void inputF(int nilai){
        this.f = nilai;
    }
    public void inputG(int nilai){
        this.g = nilai;
    }
    public int tambah(){
        int hasil = this.e+this.f+this.g;
        return hasil;
    }
    public int kurang(){
        int hasil = this.g-this.e;
        return hasil;
    }
    public int perkalian(){
        int hasil = this.e*this.f*this.g;
        return hasil;
    }
    public int pembagian(){
        int hasil = this.g/this.e;
        return hasil;
    }
}
