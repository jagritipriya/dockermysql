package com.example.dockermysql.controllers;

import com.example.dockermysql.Services.ProductService;
import com.example.dockermysql.Utilities.JsonResponseBody;
import com.example.dockermysql.Utilities.UserNotInDatabaseException;
import com.example.dockermysql.daos.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

public class RestController {

    @Autowired
    ProductService productService;
    @RequestMapping(value = "/getproduct", method= POST)
    public ResponseEntity<JsonResponseBody> getProduct(HttpServletRequest request, @RequestParam(value="Product_id_fkn") Integer Product_id_fkn){

            return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), productService.getProducts(Product_id_fkn)));
    }

    public ResponseEntity<JsonResponseBody> updateProduct(HttpServletRequest request, @RequestParam(value="Product_id_fkn") Integer Product_id_fkn){
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), productService.updateProd(Product_id_fkn)));
    }
}
