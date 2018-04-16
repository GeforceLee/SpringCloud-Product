package com.geforce.product.service;

import com.geforce.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @author geforce
 * @date 2018/4/16
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
