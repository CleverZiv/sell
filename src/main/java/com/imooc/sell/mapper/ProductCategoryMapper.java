package com.imooc.sell.mapper;

import com.imooc.sell.pojo.ProductCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname ProductCategoryMapperX
 * @Date 2019/11/16 18:44
 * @Autor lengzefu
 */
@Repository
public interface ProductCategoryMapper {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
