package com.niit.miniprojectmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Furniture {
    @Id
    int idNo;
    String productName;
    String productSize;
    int productPrice;

    public Furniture(int idNo, String productName, String productSize, int productPrice) {
        this.idNo = idNo;
        this.productName = productName;
        this.productSize = productSize;
        this.productPrice = productPrice;
    }

    public Furniture() {
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
