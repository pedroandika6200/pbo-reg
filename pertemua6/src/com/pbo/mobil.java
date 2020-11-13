package com.pbo;

public class mobil extends kendaraan {
    private String model;

    public mobil(String merek, String model) {
        super(merek);
    }

    public String getModel() {
        return model;
    }

    public void viewData(){
        System.out.println("Merek : "+this.getMerek());
        System.out.println("Model : "+this.getModel());
    }
}
