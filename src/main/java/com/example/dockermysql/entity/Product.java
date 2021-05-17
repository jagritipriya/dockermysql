package com.example.dockermysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

    @Id
    @Column(name="product_id")
    private Integer Product_id_fkn;
    @Column(name="Quantity")
    private Integer Quantity;
    @Column(name="size")
    private String size;
    @Column(name = "description")
    private String Description;
    @Column(name = "price")
    private Double price;

    public Product(Integer product_id_fkn, Integer quantity, String size, String description, Double price) {
        Product_id_fkn = product_id_fkn;
        Quantity = quantity;
        this.size = size;
        Description = description;
        this.price = price;
    }

    public Integer getProduct_id_fkn() {
        return Product_id_fkn;
    }

    public void setProduct_id_fkn(Integer product_id_fkn) {
        Product_id_fkn = product_id_fkn;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
