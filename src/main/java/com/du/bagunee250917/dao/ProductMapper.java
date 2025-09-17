package com.du.bagunee250917.dao;

import com.du.bagunee250917.domain.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("select * from products")
    List<Products> findAll();

    @Select("select * from products where id = #{id}")
    Products findById(Long id);
}
