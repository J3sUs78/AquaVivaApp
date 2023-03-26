package model;

import java.util.Date;

/**
 *
 * @author jesus
 */
public class Product {
    
    private String cod_prod, name_prod;
    private double liters_content,price_prod;
    private Date packing;

    public Product() {
    }

    public Product(String cod_prod, String name_prod, double liters_content, double price_prod, Date packing) {
        this.cod_prod = cod_prod;
        this.name_prod = name_prod;
        this.liters_content = liters_content;
        this.price_prod = price_prod;
        this.packing = packing;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getName_prod() {
        return name_prod;
    }

    public void setName_prod(String name_prod) {
        this.name_prod = name_prod;
    }

    public double getLiters_content() {
        return liters_content;
    }

    public void setLiters_content(double liters_content) {
        this.liters_content = liters_content;
    }

    public double getPrice_prod() {
        return price_prod;
    }

    public void setPrice_prod(double price_prod) {
        this.price_prod = price_prod;
    }

    public Date getPacking() {
        return packing;
    }

    public void setPacking(Date packing) {
        this.packing = packing;
    }
    
    
}
