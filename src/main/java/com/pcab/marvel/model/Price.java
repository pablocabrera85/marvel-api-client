package com.pcab.marvel.model;

/**
 * Price description
 */
public class Price extends BaseObject {

    /**
     * The price (all prices in USD).
     */
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
