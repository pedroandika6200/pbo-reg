package com.pbo;

public class kendaraan {
    private String merek;

    public kendaraan(String merek) {
        this.merek = merek;
    }

    protected String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
}
