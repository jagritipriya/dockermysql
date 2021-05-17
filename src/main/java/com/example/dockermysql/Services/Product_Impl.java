package com.example.dockermysql.Services;

import com.example.dockermysql.daos.ProductDao;
import com.example.dockermysql.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@Service
public class Product_Impl implements ProductService {
    @Autowired
    ProductDao prodDao;
    public List<Product> getProducts(Integer Product_id_fkn){
        return prodDao.findByfknproduct(Product_id_fkn);
    }
    public Product updateProd(Integer Product_id_fkn){
        Product prod  = prodDao.findprodbyproductId(Product_id_fkn);
        Integer quant = prod.getQuantity();

        if(quant!=0)
            prod.setQuantity(quant-1);
        return prodDao.save(prod);
    }

}
