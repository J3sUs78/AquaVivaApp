
package model;

import java.util.Date;

/**
 *
 * @author jesus
 */
public class Sale_Dates {
    //Sales are the transactions carried out in which a Client acquires a product from our company, and from them must be stored
    private Date date_sell, date_delivery;
    private Customer customer;
    private Seller seller;
    private Product product;
    private String description_sell;
    private int stock_prod, subtotal;

    public Sale_Dates() {
    }

    public Sale_Dates(Date date_sell, Date date_delivery, Customer customer, Seller seller, Product product, String description_sell, int stock_prod, int subtotal) {
        this.date_sell = date_sell;
        this.date_delivery = date_delivery;
        this.customer = customer;
        this.seller = seller;
        this.product = product;
        this.description_sell = description_sell;
        this.stock_prod = stock_prod;
        this.subtotal = subtotal;
    }

    public Date getDate_sell() {
        return date_sell;
    }

    public void setDate_sell(Date date_sell) {
        this.date_sell = date_sell;
    }

    public Date getDate_delivery() {
        return date_delivery;
    }

    public void setDate_delivery(Date date_delivery) {
        this.date_delivery = date_delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDescription_sell() {
        return description_sell;
    }

    public void setDescription_sell(String description_sell) {
        this.description_sell = description_sell;
    }

    public int getStock_prod() {
        return stock_prod;
    }

    public void setStock_prod(int stock_prod) {
        this.stock_prod = stock_prod;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    
 
    
}
