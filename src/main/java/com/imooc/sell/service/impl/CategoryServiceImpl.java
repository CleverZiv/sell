package com.imooc.sell.service.impl;

import com.imooc.sell.mapper.ProductCategoryMapper;
import com.imooc.sell.pojo.ProductCategory;
import com.imooc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname CategoryServiceImpl
 * @Date 2019/11/16 18:14
 * @Autor lengzefu
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryMapper.findByCategoryTypeIn(categoryTypeList);
    }
}
