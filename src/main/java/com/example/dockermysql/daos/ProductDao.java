package com.example.dockermysql.daos;

import com.example.dockermysql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer >{
        List<Product> findByfknproduct(Integer Product_id_fkn);
        Product findprodbyproductId(Integer Product_id_fkn);
}
