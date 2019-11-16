package com.imooc.sell.service.impl;

import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.mapper.ProductInfoMapper;
import com.imooc.sell.pojo.ProductInfo;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ProductServiceImpl
 * @Date 2019/11/16 16:59
 * @Autor lengzefu
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoMapper.selectByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
