package com.geforce.product.vo;

import lombok.Data;

/**
 * @author geforce
 * @date 2018/4/16
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;


}
