package com.example.dockermysql.entity;

import javax.persistence.Entity;


@Entity
@Table(name="Product_avail")
public class Prod_Availibilty {
    @Column(name="product_id")
  private Integer Product_id_fkn;
    @Column(name="available")
  private String Available;

    public Prod_Availibilty(Integer product_id_fkn, String available) {
        Product_id_fkn = product_id_fkn;
        Available = available;
    }

    public Integer getProduct_id_fkn() {
        return Product_id_fkn;
    }

    public void setProduct_id_fkn(Integer product_id_fkn) {
        Product_id_fkn = product_id_fkn;
    }

    public String getAvailable() {
        return Available;
    }

    public void setAvailable(String available) {
        Available = available;
    }
}
