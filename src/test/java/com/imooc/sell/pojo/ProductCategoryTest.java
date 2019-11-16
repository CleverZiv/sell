package com.imooc.sell.pojo;

import com.imooc.sell.SellApplication;
import com.imooc.sell.mapper.ProductCategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Classname ProductCategoryTest
 * @Date 2019/11/16 15:32
 * @Autor lengzefu
 */
@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class ProductCategoryTest {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;


}