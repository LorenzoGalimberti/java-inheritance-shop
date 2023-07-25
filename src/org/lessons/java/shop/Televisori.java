package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends  Prodotto{
    private int dimensione;
    private boolean smart ;

    // COSTRUTTORE

    public Televisori(String name, String description, BigDecimal price, double iva, int dimensione, boolean smart) {
        super(name, description, price, iva);
        this.dimensione = dimensione;
        this.smart = smart;
    }

    // METODI
    private  String convertiSmart(){
        if(smart){
            return  "smart tv";
        }else{
            return "not smart tv";
        }
    }
    @Override
    public String toString() {
        return super.toString() + " Televisori{" +
                "dimensione=" + dimensione +
                ", smart=" + convertiSmart() +
                '}';
    }
}
