package com.geforce.product.enums;

import lombok.Getter;

/**
 * @author geforce
 * @date 2018/4/16
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在售"),
    DOWN(1,"下架");


    private Integer code;

    private String message;


    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
