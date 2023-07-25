package org.lessons.java.shop;

import java.math.BigDecimal;

/*Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria*/
public class Smartphone extends Prodotto {
    //ATTRIBUTI
    private String codeImei;
    private int memory;

    // COSTRUTTORE

    public Smartphone(String name, String description, BigDecimal price, double iva, String codeImei, int memory) {
        super(name, description, price, iva);
        this.codeImei = codeImei;
        this.memory = memory;
    }


    // GETTER AND SETTE
    // METODI

    @Override
    public String toString() {
        return super.toString() + "tipo Smartphone{" +
                "codeImei='" + codeImei + '\'' +
                ", memory=" + memory +
                '}';
    }
}
