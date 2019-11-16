package com.imooc.sell.VO;

import lombok.Data;

/**
 * @Classname ResultVO
 * @Date 2019/11/16 17:34
 * @Autor lengzefu
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;
}
