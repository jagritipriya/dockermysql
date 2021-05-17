package com.example.dockermysql.Services;

import com.example.dockermysql.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(Integer Product_id_fkn);
    Product updateProd(Integer Product_id_fkn);
}
