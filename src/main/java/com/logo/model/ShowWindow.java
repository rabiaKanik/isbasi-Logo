package com.logo.model;

import java.util.ArrayList;
import java.util.List;

public class ShowWindow {

     private String  url;
     private String brand;
     private String address;

     private List<Product> productList = new ArrayList<>(10);

    private boolean costType;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCostType() {
        return costType;
    }

    public void setCostType(boolean costType) {
        this.costType = costType;
    }

}
