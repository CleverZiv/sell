package com.imooc.sell.service;

import com.imooc.sell.pojo.ProductCategory;

import java.util.List;

/**
 * @Classname CategoryService
 * @Date 2019/11/16 16:52
 * @Autor lengzefu
 */
public interface CategoryService {

    /**
     * 根据类目类型查询
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //加库存

    //减库存
}
