package com.engeto.Autopredajna;
public class Majitel {
    private String meno;
    private String vin;

    public Majitel(String meno, String vin) {
        this.meno = meno;
        this.vin = vin;
    }

    public String getMeno() {
        return meno;
    }

    public String getVin() {
        return vin;
    }
}
