package com.example.dockermysql;

import com.example.dockermysql.daos.ProductDao;
import com.example.dockermysql.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockermysqlApplication implements CommandLineRunner {
	@Autowired
	ProductDao productDao;
	public static void main(String[] args) {
		SpringApplication.run(DockermysqlApplication.class, args); }

		@Override
		public void run(String... string) throws Exception {
		productDao.save(new Product(12423,2,"xs","green zara top",803.88));
	}

}
