package com.engeto.Autopredajna;

public class Auto {
    private String model;
    private double cena;
    private String vin;

    public Auto(String model, double cena, String vin) {
        this.model = model;
        this.cena = cena;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public double getCena() {
        return cena;
    }

    public String getVin() {
        return vin;
    }
}
