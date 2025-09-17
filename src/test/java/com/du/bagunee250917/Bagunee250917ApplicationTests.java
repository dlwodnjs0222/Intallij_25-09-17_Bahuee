package com.du.bagunee250917;

import com.du.bagunee250917.dao.ProductMapper;
import com.du.bagunee250917.domain.Products;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class Bagunee250917ApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    void contextLoads() {
        List<Products> products = productMapper.findAll();
        for (Products product : products) {
            System.out.println(product);
        }
    }

}
