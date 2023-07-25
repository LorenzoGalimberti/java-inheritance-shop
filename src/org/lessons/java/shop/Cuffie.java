package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    // ATTRIBUTI
    private String colore;
    private boolean filo;

    // COSTRUTTORI


    public Cuffie(String name, String description, BigDecimal price, double iva, String colore, boolean filo) {
        super(name, description, price, iva);
        this.colore = colore;
        this.filo = filo;
    }

    // METODI
    private  String convertiSmart(){
        if(filo){
            return  "Cuffie wireless";
        }else{
            return "cuffie cablate ";
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Cuffie{" +
                "colore='" + colore + '\'' +
                ", filo=" + convertiSmart() +
                '}';
    }
}
