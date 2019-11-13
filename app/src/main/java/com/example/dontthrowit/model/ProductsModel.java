package com.example.dontthrowit.model;

import java.io.Serializable;

/**
 *
 */
public class ProductsModel implements Serializable {

    private int productImage;
    private String productImage2;

    public String getProductImage2() {
        return productImage2;
    }

    public void setProductImage2(String productImage2) {
        this.productImage2 = productImage2;
    }

    private String productName;
    private String productLink;
    private String productPrice;
    private String day;
    private String id;
    private int position;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String specification;
    private String descreption;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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


    public ProductsModel(int position, String id, String productName, int productImage, String productLink, String productPrice, String day) {
        this.productImage = productImage;
        this.productName = productName;
        this.productLink = productLink;
        this.productPrice = productPrice;
        this.day = day;
        this.id = id;
        this.position = position;
    }    public ProductsModel(int position, String id, String productName, String productImage, String productLink, String productPrice, String day) {
        this.productImage2 = productImage;
        this.productName = productName;
        this.productLink = productLink;
        this.productPrice = productPrice;
        this.day = day;
        this.id = id;
        this.position = position;
    }

    public ProductsModel( int position,String id,String productName,int productImage, String productLink, String productPrice,
                          String day, String descreption, String userName, String userEmail, String userPhone,String specification) {
        this.productImage = productImage;
        this.productName = productName;
        this.productLink = productLink;
        this.productPrice = productPrice;
        this.day = day;
        this.id = id;
        this.position = position;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.specification = specification;
        this.descreption=descreption;
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
