package com.engeto.Autopredajna;

import com.engeto.Autopredajna.Auto;
import com.engeto.Autopredajna.Majitel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoPredajna {
    private Map<String, Auto> vozidlaPodlaVIN;
    private Map<String, Majitel> majiteliaPodlaVIN;

    public AutoPredajna() {
        vozidlaPodlaVIN = new HashMap<>();
        majiteliaPodlaVIN = new HashMap<>();
    }

    public void pridajAuto(String vin, Auto auto) {
        vozidlaPodlaVIN.put(vin, auto);
    }

    public void pridajMajitela(String vin, Majitel majitel) {
        majiteliaPodlaVIN.put(vin, majitel);
    }

    public Auto najdiAutoPodlaVIN(String vin) {
        return vozidlaPodlaVIN.get(vin);
    }

    public Majitel najdiMajitelaPodlaVIN(String vin) {
        return majiteliaPodlaVIN.get(vin);
    }

    public List<Auto> dajVsetkyAuta() {
        return new ArrayList<>(vozidlaPodlaVIN.values());
    }

    public List<Majitel> dajVsetkychMajitelov() {
        return new ArrayList<>(majiteliaPodlaVIN.values());
    }
}