package com.imooc.sell.mapper;

import com.imooc.sell.pojo.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname ProductInfoMapperX
 * @Date 2019/11/16 18:44
 * @Autor lengzefu
 */
@Repository
public interface ProductInfoMapper {
    List<ProductInfo> selectByProductStatus(Integer productStatus);
}
