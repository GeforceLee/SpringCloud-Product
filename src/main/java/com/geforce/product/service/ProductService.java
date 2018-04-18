package com.geforce.product.service;

import com.geforce.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author geforce
 * @date 2018/4/16
 */
public interface ProductService {

    List<ProductInfo> findUpAll();


    List<ProductInfo> findList(List<String > productIdList);
}
