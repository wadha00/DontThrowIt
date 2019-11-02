package com.example.dontthrowit.model;

import java.io.Serializable;

/**
 * Created by mostafa kamal khedr on 09,July,2019
 */
public class ProductsModel implements Serializable {

    private int productImage;
    private String productName;
    private String productLink;
    private String productPrice;
    private String day;

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public ProductsModel(String productName, int productImage, String productLink) {
        this.productImage = productImage;
        this.productName = productName;
        this.productLink = productLink;
    }


    public ProductsModel(String productName,int productImage , String productLink, String productPrice, String day) {
        this.productImage = productImage;
        this.productName = productName;
        this.productLink = productLink;
        this.productPrice = productPrice;
        this.day = day;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }
}
