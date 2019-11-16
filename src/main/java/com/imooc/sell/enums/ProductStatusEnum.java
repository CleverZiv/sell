package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @Classname ProductStatusEnum
 * @Date 2019/11/16 18:01
 * @Autor lengzefu
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
