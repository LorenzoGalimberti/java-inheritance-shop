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
    private double   iva;
    // COSTRUTTORI

    public Prodotto(String name, String description, BigDecimal price, double iva) {
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

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    // METODI

    public void basePrice(){
        System.out.println(" il prezzo base del prodotto è : "+ price);
    }


    public  BigDecimal taxedPrice(){
        return price.multiply(BigDecimal.valueOf(1+iva/100));
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + taxedPrice() +
                ", iva=" + iva +
                '}';
    }
}
