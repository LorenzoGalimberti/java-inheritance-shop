package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;
/*
*  codice (numero intero)
- nome
- descrizione
- prezzo
- iva*/
public class Prodotto {
    //ATTRIBUTI
    private  int code;
    private String name;
    private  String description;
    private BigDecimal price;
    private  BigDecimal iva;
    // COSTRUTTORI

    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {
        Random random = new Random();
        this.code= random.nextInt(100);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    // GETTER SETTER

    public int getCode() {
        return code;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    // METODI

    public void basePrice(){
        System.out.println(" il prezzo base del prodotto è : "+ price);
    }


    public  void taxedPrice(){
        System.out.println( "il prezzo compreso di iva è : "+ price.multiply(iva.add(BigDecimal.valueOf(1))));
    }
}
