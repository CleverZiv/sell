package com.imooc.sell.service;

import com.imooc.sell.pojo.ProductInfo;

import java.util.List;

/**
 * @Classname ProductService
 * @Date 2019/11/16 16:57
 * @Autor lengzefu
 */
public interface ProductService {
    /**
     * 查询所有的上架商品
     * @return
     */
    List<ProductInfo> findUpAll();
}
